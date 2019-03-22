package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.ParticipantDto;
import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.mapper.EmployeeMapper;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.function.Predicate;

import static java.text.MessageFormat.format;
import static java.util.stream.Collectors.toList;
import static org.springframework.http.HttpMethod.GET;

@Service
@Profile({"prod", "staging"})
public class InsightOrganisationUnitServiceRemote implements InsightOrganisationUnitService {

    private static final String MEMBER = "Member";
    private static final String LEAD = "Lead";
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
                .filter(isMemberOrLead())
                .map(ParticipantDto::getEmployee)
                .map(EmployeeMapper::toEmployee)
                .collect(toList());
    }

    private Predicate<ParticipantDto> isMemberOrLead() {
        return participant ->
                MEMBER.equals(participant.getRoleText())
                        || LEAD.equals(participant.getRoleText());
    }
}
