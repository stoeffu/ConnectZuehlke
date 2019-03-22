package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;

import java.util.List;

public interface InsightOrganisationUnitService {

    List<Employee> getMembers(String teamId);

}
