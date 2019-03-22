package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.mapper;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.model.Skill;

public class SkillMapper {
    public static ch.zuehlke.fullstack.ConnectZuehlke.domain.Skill toSkill(Skill skill) {
        return new ch.zuehlke.fullstack.ConnectZuehlke.domain.Skill(skill.getId().toString(), skill.getName());
    }
}
