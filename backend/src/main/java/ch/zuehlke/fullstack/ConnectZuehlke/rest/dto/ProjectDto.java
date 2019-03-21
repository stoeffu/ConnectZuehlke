package ch.zuehlke.fullstack.ConnectZuehlke.rest.dto;

import java.util.List;

public class ProjectDto {
    private List<ColleagueDto> colleagues;
    private String projectName;

    public List<ColleagueDto> getColleagues() {
        return colleagues;
    }

    public void setColleagues(List<ColleagueDto> colleagues) {
        this.colleagues = colleagues;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
