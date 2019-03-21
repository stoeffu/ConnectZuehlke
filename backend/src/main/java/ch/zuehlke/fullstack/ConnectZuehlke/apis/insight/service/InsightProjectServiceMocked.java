package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@Profile({"ci", "default"})
public class InsightProjectServiceMocked implements InsightProjectService {

    @Override
    public List<Employee> getCurrentTeam(String projectCode) {
        return Collections.emptyList();
    }
}
