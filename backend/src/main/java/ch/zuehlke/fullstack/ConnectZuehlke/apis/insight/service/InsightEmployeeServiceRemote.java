package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.mapper.EmployeeMapper;
import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.mapper.ProjectMapper;
import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.model.EmployeeResult;
import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.model.ProjectParticipation;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.text.MessageFormat.format;
import static java.util.stream.Collectors.toList;
import static org.springframework.http.HttpMethod.GET;

@Service
@Profile({"prod", "staging"})
public class InsightEmployeeServiceRemote implements InsightEmployeeService {
    private final RestTemplate insightRestTemplate;

    @Autowired
    public InsightEmployeeServiceRemote(RestTemplate insightRestTemplate) {
        this.insightRestTemplate = insightRestTemplate;
    }

    @Override
    public List<Employee> getEmployees(List<String> employeeCodes) {
        Set<String> codes = new HashSet<>(employeeCodes);
        String url = "/employees?name=" + String.join(",", codes);

        ResponseEntity<List<EmployeeResult>> response = this.insightRestTemplate
                .exchange(url, GET, null, new ParameterizedTypeReference<List<EmployeeResult>>() {
                });

        return response.getBody().stream()
                .filter(resp -> codes.contains(resp.getCode()))
                .map(EmployeeMapper::toEmployee)
                .collect(toList());
    }

    @Override
    public byte[] getEmployeePicture(String code) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_OCTET_STREAM));

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<byte[]> response = this.insightRestTemplate
                .exchange(format("/employees/{0}/picture?large=false", code), GET, entity, byte[].class, "1");
        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        }
        throw new IllegalStateException("Status code was not 200");
    }

    @Override
    public Employee getEmployee(String code) {
        ResponseEntity<EmployeeResult> response = this.insightRestTemplate
                .getForEntity(format("/employees/{0}", code), EmployeeResult.class);

        return EmployeeMapper.toEmployee(response.getBody());
    }

    @Override
    public List<Project> getCurrentProjectsForEmployee(String code) {
        ResponseEntity<List<ProjectParticipation>> response = this.insightRestTemplate
                .exchange(format("/employees/{0}/projects/current", code), GET, null, new ParameterizedTypeReference<List<ProjectParticipation>>() {
                });
        return response.getBody().stream()
                .map(ProjectMapper::toProject)
                .collect(toList());
    }
}
