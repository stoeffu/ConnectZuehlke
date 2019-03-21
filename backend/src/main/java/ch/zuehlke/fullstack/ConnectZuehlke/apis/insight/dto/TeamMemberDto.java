package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class TeamMemberDto {
    @JsonProperty("Employee")
    EmployeeDto employee;

    public EmployeeDto getEmployee() {
        return employee;
    }
}
