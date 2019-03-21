package ch.zuehlke.fullstack.ConnectZuehlke.usecase;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightEmployeeService;
import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightProjectService;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class ProjectColleaguesUseCase {

    private final InsightEmployeeService employeeService;
    private final InsightProjectService projectService;

    public ProjectColleaguesUseCase(InsightEmployeeService employeeService, InsightProjectService projectService) {
        this.employeeService = employeeService;
        this.projectService = projectService;
    }

    public List<Project> getProjectColleaguesFor(String employeeCode) {
        List<Project> currentProjects = employeeService.getCurrentProjectsForEmployee(employeeCode);

        return currentProjects.stream()
                .map(project -> project.withEmployees(getProjectColleagues(employeeCode, project)))
                .collect(toList());
    }

    public byte[] getEmployeePicture(String employeeCode) throws IOException {
        return employeeService.getEmployeePicture(employeeCode);
    }

    private List<Employee> getProjectColleagues(String code, Project project) {
        List<Employee> colleagues = projectService.getCurrentTeam(project.getCode()).stream()
                .filter(e -> !e.getCode().equalsIgnoreCase(code))
                .collect(toList());

        List<String> employeeCodes = colleagues.stream()
                .map(Employee::getCode)
                .collect(toList());

        return employeeService.getEmployees(employeeCodes);
    }
}
