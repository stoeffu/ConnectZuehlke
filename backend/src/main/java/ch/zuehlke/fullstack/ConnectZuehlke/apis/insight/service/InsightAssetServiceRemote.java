package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.model.AssetEmployeeLink;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Skill;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.SkillLevel;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.SkilledEmployee;
import org.springframework.context.annotation.Profile;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import static java.text.MessageFormat.format;
import static org.springframework.http.HttpMethod.GET;

@Service
@Profile({"prod", "staging"})
public class InsightAssetServiceRemote implements InsightAssetService {
    private final InsightEmployeeService employeeService;
    private final RestTemplate insightRestTemplate;

    public InsightAssetServiceRemote(InsightEmployeeService employeeService, RestTemplate insightRestTemplate) {
        this.employeeService = employeeService;
        this.insightRestTemplate = insightRestTemplate;
    }

    @Override
    public List<SkilledEmployee> getEmployeesForSkill(Skill skill) {
        List<SkilledEmployee> skilledEmployees = new ArrayList<>();

        ResponseEntity<List<AssetEmployeeLink>> response = this.insightRestTemplate
                .exchange(format("/assets/{0}/employees", skill.getId()), GET, null, new ParameterizedTypeReference<List<AssetEmployeeLink>>() {
                });

        for (AssetEmployeeLink employeeLink : response.getBody()) {
            boolean isExpert = employeeLink.getExperience().getValue() >= 4;
            boolean isBeginner = employeeLink.getExperience().getValue() == 1;

            if (isExpert || isBeginner) {
                SkillLevel skillLevel = isExpert ? SkillLevel.EXPERT : SkillLevel.INTERESTED;

                String firstName = employeeLink.getFirstName();
                String lastName = employeeLink.getLastName();
                Employee employee = new Employee(firstName, lastName, format("{0}.{1}@zuehlke.com", firstName, lastName),
                        null, null, employeeLink.getId().intValue(), employeeLink.getCode(),
                        employeeLink.getLocation());

                skilledEmployees.add(new SkilledEmployee(skill, employee, skillLevel));
            }
        }

        return skilledEmployees;
    }
}
