package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Skill;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.SkilledEmployee;

import java.util.List;

public interface InsightAssetService {
    List<SkilledEmployee> getEmployeesForSkill(Skill skill);
}
