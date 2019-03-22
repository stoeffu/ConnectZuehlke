package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Skill;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.SkilledEmployee;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@Profile({"ci", "default"})
public class InsightAssetServiceMocked implements InsightAssetService {
    @Override
    public List<SkilledEmployee> getEmployeesForSkill(Skill skill) {
        return Collections.emptyList();
    }
}
