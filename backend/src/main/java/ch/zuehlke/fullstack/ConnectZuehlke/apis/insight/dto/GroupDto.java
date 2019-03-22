package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Group;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GroupDto {

    @JsonProperty("Employee")
    private EmployeeDto employee;

    @JsonProperty("OrganisationUnit")
    private OrganisationUnitDto organisationUnit;

    public static Group toGroup(GroupDto dto) {
        return new Group(
                dto.getOrganisationUnit().getId(),
                dto.getOrganisationUnit().getName(),
                dto.getOrganisationUnit().getType(),
                dto.getOrganisationUnit().getTypeText()
        );
    }

    public EmployeeDto getEmployee() {
        return employee;
    }

    public OrganisationUnitDto getOrganisationUnit() {
        return organisationUnit;
    }
}
