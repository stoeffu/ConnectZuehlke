package ch.zuehlke.fullstack.ConnectZuehlke.rest.dto;

import java.util.List;

public class ProjectColleaguesDto {
    private List<ProjectDto> projects;

    public List<ProjectDto> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectDto> projects) {
        this.projects = projects;
    }
}
