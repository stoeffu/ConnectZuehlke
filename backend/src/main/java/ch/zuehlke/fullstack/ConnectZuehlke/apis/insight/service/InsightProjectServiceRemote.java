package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.mapper.EmployeeMapper;
import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.model.ProjectParticipation;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
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
public class InsightProjectServiceRemote implements InsightProjectService {
    private final RestTemplate insightRestTemplate;

    public InsightProjectServiceRemote(RestTemplate insightRestTemplate) {
        this.insightRestTemplate = insightRestTemplate;
    }

    @Override
    public List<Employee> getCurrentTeam(String projectCode) {
        ResponseEntity<List<ProjectParticipation>> response = this.insightRestTemplate
                .exchange(format("/projects/{0}/team/current", projectCode), GET, null, new ParameterizedTypeReference<List<ProjectParticipation>>() {
                });
        return response.getBody().stream()
                .map(ProjectParticipation::getEmployee)
                .map(EmployeeMapper::toEmployee)
                .collect(toList());
    }
}
