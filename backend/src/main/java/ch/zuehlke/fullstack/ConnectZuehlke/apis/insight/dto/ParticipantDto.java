package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParticipantDto {

    @JsonProperty("Employee")
    private EmployeeDto employee;

    @JsonProperty("Role")
    private String role;

    @JsonProperty("RoleText")
    private String roleText;

    public EmployeeDto getEmployee() {
        return employee;
    }

    public String getRole() {
        return role;
    }

    public String getRoleText() {
        return roleText;
    }
}
