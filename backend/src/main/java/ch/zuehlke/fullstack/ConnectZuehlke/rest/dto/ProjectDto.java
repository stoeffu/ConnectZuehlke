package ch.zuehlke.fullstack.ConnectZuehlke.rest.dto;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ProjectDto {
    private List<EmployeeDto> colleagues;
    private String projectName;

    public List<EmployeeDto> getColleagues() {
        return colleagues;
    }

    public void setColleagues(List<EmployeeDto> colleagues) {
        this.colleagues = colleagues;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public static ProjectDto of(Project project) {
        ProjectDto dto = new ProjectDto();
        dto.setProjectName(project.getName());
        List<EmployeeDto> mappedColleagues = project.getEmployees().stream()
                .map(EmployeeDto::of)
                .collect(toList());
        dto.setColleagues(mappedColleagues);
        return dto;
    }
}
