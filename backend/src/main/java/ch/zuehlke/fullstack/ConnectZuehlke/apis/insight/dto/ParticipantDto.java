package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.model.EmployeeResult;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ParticipantDto {

    @JsonProperty("Employee")
    private EmployeeResult employee;

    @JsonProperty("Role")
    private String role;

    @JsonProperty("RoleText")
    private String roleText;

    public EmployeeResult getEmployee() {
        return employee;
    }

    public String getRole() {
        return role;
    }

    public String getRoleText() {
        return roleText;
    }
}
