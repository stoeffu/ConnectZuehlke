package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.EmployeeDto;
import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.ParticipantDto;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static java.text.MessageFormat.format;
import static java.util.stream.Collectors.toList;
import static org.springframework.http.HttpMethod.GET;

@Service
@Profile({"prod", "staging"})
public class InsightOrganisationUnitServiceRemote implements InsightOrganisationUnitService {

    public static final String MEMBER = "Member";
    private final RestTemplate insightRestTemplate;

    @Autowired
    public InsightOrganisationUnitServiceRemote(RestTemplate insightRestTemplate) {
        this.insightRestTemplate = insightRestTemplate;
    }

    @Override
    public List<Employee> getMembers(String teamId) {
        ResponseEntity<List<ParticipantDto>> response = this.insightRestTemplate
                .exchange(format("/organisationunits/{0}/participants", teamId), GET, null, new ParameterizedTypeReference<List<ParticipantDto>>() {
                });

        return response.getBody().stream()
                .filter(participant -> participant.getRoleText().equals(MEMBER))
                .map(ParticipantDto::getEmployee)
                .map(EmployeeDto::toEmployee)
                .collect(toList());
    }
}
