package ch.zuehlke.fullstack.ConnectZuehlke.usecase;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightEmployeeService;
import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightProjectService;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Comparator;
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

    public List<Project> getProjectColleaguesFor(String code) {
        List<Project> currentProjects = employeeService.getCurrentProjectsForEmployee(code);

        return currentProjects.stream()
                .map(project -> project.withEmployees(getProjectColleagues(code, project)))
                .collect(toList());
    }

    public byte[] getEmployeePicture(String code) throws IOException {
        return employeeService.getEmployeePicture(code);
    }

    private List<Employee> getProjectColleagues(String code, Project project) {
        return projectService.getCurrentTeam(project.getCode()).stream()
                .filter(e -> !e.getCode().equalsIgnoreCase(code))
                .map(employee -> employeeService.getEmployee(employee.getCode()))
                .sorted(Comparator.comparing(Employee::getLastName).thenComparing(Employee::getFirstName))
                .collect(toList());
    }
}
