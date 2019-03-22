package ch.zuehlke.fullstack.ConnectZuehlke.domain;

public class SkilledEmployee {
    private final Skill skill;
    private final Employee employee;
    private final SkillLevel skillLevel;

    public SkilledEmployee(Skill skill, Employee employee, SkillLevel skillLevel) {
        this.skill = skill;
        this.employee = employee;
        this.skillLevel = skillLevel;
    }

    public Skill getSkill() {
        return skill;
    }

    public Employee getEmployee() {
        return employee;
    }

    public SkillLevel getSkillLevel() {
        return skillLevel;
    }
}
