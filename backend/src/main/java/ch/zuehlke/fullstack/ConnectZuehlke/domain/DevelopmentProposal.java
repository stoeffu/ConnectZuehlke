package ch.zuehlke.fullstack.ConnectZuehlke.domain;

import java.util.List;

public class DevelopmentProposal {
    private final String source;
    private final List<Employee> experts;
    private final List<Employee> colleagues;
    private final Skill skill;

    public DevelopmentProposal(String source, List<Employee> experts, List<Employee> colleagues, Skill skill) {
        this.source = source;
        this.experts = experts;
        this.colleagues = colleagues;
        this.skill = skill;
    }

    public Skill getSkill() {
        return skill;
    }

    public String getSource() {
        return source;
    }

    public List<Employee> getExperts() {
        return experts;
    }

    public List<Employee> getColleagues() {
        return colleagues;
    }
}
