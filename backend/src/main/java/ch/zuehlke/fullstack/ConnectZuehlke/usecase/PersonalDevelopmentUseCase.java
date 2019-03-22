package ch.zuehlke.fullstack.ConnectZuehlke.usecase;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightAssetService;
import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightEmployeeService;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.stream.Collectors.toList;

@Service
public class PersonalDevelopmentUseCase {

    private final InsightEmployeeService employeeService;
    private final InsightAssetService assetService;

    public PersonalDevelopmentUseCase(InsightEmployeeService employeeService, InsightAssetService assetService) {
        this.employeeService = employeeService;
        this.assetService = assetService;
    }

    public List<DevelopmentProposal> getProposalsFor(String employeeCode) {
        List<DevelopmentProposal> proposals = new ArrayList<>();

        String ownLocation = employeeService.getEmployee(employeeCode).getLocation();

        List<Skill> interests = employeeService.getInterestsForEmployee(employeeCode);
        addDevelopmentProposal(proposals, interests, ownLocation, employeeCode);

        List<Skill> skillGoals = employeeService.getSkillGoalsForEmployee(employeeCode);
        addDevelopmentProposal(proposals, skillGoals, ownLocation, employeeCode);

        return proposals;
    }

    private void addDevelopmentProposal(List<DevelopmentProposal> proposals, List<Skill> skills, String ownLocation, String ownEmployeeCode) {
        for (Skill skill : skills) {
            List<SkilledEmployee> employees = assetService.getEmployeesForSkill(skill);

            List<Employee> experts = employees.stream()
                    .filter(skilledEmployee -> skilledEmployee.getSkillLevel().equals(SkillLevel.EXPERT))
                    .map(SkilledEmployee::getEmployee)
                    .filter(employee -> Objects.equals(employee.getLocation(), ownLocation))
                    .filter(employee -> !ownEmployeeCode.equals(employee.getCode()))
                    .collect(toList());
            List<Employee> interested = employees.stream()
                    .filter(skilledEmployee -> skilledEmployee.getSkillLevel().equals(SkillLevel.INTERESTED))
                    .map(SkilledEmployee::getEmployee)
                    .filter(employee -> Objects.equals(employee.getLocation(), ownLocation))
                    .filter(employee -> !ownEmployeeCode.equals(employee.getCode()))
                    .collect(toList());

            proposals.add(new DevelopmentProposal("Interests", experts, interested, skill));
        }
    }
}
