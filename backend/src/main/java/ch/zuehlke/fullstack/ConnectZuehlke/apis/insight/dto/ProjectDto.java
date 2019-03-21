package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class ProjectDto {

    @JsonProperty("Id")
    private String id;

    @JsonProperty("TitleResolved")
    private String name;

    @JsonProperty("Project")
    private ProjectDetailDto detail;

    public static Project toProject(ProjectDto dto) {
        return new Project(dto.getId(), dto.getName(), dto.getDetail().getCode(), null, null);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ProjectDetailDto getDetail() {
        return detail;
    }

    @JsonIgnoreProperties
    public class ProjectDetailDto {
        @JsonProperty("Code")
        private String code;

        public String getCode() {
            return code;
        }
    }
}
