package ch.zuehlke.fullstack.ConnectZuehlke.rest.dto;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

import static java.util.stream.Collectors.toList;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectColleaguesDto {

    private List<ProjectDto> projects;

    public static ProjectColleaguesDto of(List<Project> projects) {
        ProjectColleaguesDto dto = new ProjectColleaguesDto();
        List<ProjectDto> mappedProjects = projects.stream()
                .map(ProjectDto::of)
                .collect(toList());
        dto.setProjects(mappedProjects);
        return dto;
    }

    public List<ProjectDto> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectDto> projects) {
        this.projects = projects;
    }

}