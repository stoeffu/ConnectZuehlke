package ch.zuehlke.fullstack.ConnectZuehlke.domain;

public class Skill {
    private final String id;
    private final String name;

    public Skill(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
