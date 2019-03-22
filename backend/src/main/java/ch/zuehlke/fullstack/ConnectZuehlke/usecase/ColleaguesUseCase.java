package ch.zuehlke.fullstack.ConnectZuehlke.usecase;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightEmployeeService;
import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightOrganisationUnitService;
import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightProjectService;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Group;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@Service
public class ColleaguesUseCase {

    private static final String TEAM = "Team";

    private final InsightEmployeeService employeeService;
    private final InsightProjectService projectService;
    private final InsightOrganisationUnitService organisationUnitService;

    public ColleaguesUseCase(
            InsightEmployeeService employeeService,
            InsightProjectService projectService,
            InsightOrganisationUnitService organisationUnitService) {
        this.employeeService = employeeService;
        this.projectService = projectService;
        this.organisationUnitService = organisationUnitService;
    }

    public List<Project> getProjectColleaguesFor(String employeeCode) {
        List<Project> currentProjects = employeeService.getCurrentProjectsForEmployee(employeeCode);

        return currentProjects.stream()
                .map(project -> project.withEmployees(getProjectColleagues(employeeCode, project)))
                .collect(toList());
    }

    public List<Employee> getTeamColleaguesFor(String employeeCode) {
        List<Group> currentGroupsForEmployee = employeeService.getCurrentGroupsForEmployee(employeeCode);
        Optional<Group> teamOptional = currentGroupsForEmployee.stream()
                .filter(group -> group.getTypeText().equals(TEAM))
                .findAny();

        if (!teamOptional.isPresent()) {
            return Collections.emptyList();
        }

        Group team = teamOptional.get();

        return getTeamColleagues(employeeCode, team.getId());
    }

    private List<Employee> getProjectColleagues(String employeeCode, Project project) {
        return projectService.getCurrentTeam(project.getCode()).stream()
                .filter(e -> !e.getCode().equalsIgnoreCase(employeeCode))
                .map(employee -> employeeService.getEmployee(employee.getCode()))
                .sorted(Comparator.comparing(Employee::getLastName).thenComparing(Employee::getFirstName))
                .collect(toList());
    }

    private List<Employee> getTeamColleagues(String employeeCode, String teamId) {
        return organisationUnitService.getMembers(teamId).stream()
                .filter(employee -> !employeeCode.equals(employee.getCode()))
                .map(employee -> employeeService.getEmployee(employee.getCode()))
                .sorted(Comparator.comparing(Employee::getLastName).thenComparing(Employee::getFirstName))
                .collect(toList());
    }
}
