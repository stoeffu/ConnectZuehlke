package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.model.OrganisationUnit;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Group;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GroupDto {
    @JsonProperty("OrganisationUnit")
    private OrganisationUnit organisationUnit;

    public OrganisationUnit getOrganisationUnit() {
        return organisationUnit;
    }

    public void setOrganisationUnit(OrganisationUnit organisationUnit) {
        this.organisationUnit = organisationUnit;
    }

    public static Group toGroup(GroupDto dto) {
        OrganisationUnit org = dto.getOrganisationUnit();
        return new Group(org.getId().toString(), org.getName(), org.getType().name(), org.getTypeText());
    }
}
