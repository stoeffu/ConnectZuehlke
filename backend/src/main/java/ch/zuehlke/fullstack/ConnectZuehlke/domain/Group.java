package ch.zuehlke.fullstack.ConnectZuehlke.domain;

public class Group {

    private String id;
    private String name;
    private String type;
    private String typeText;

    public Group(String id, String name, String type, String typeText) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.typeText = typeText;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getTypeText() {
        return typeText;
    }
}
