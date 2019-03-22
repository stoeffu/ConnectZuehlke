package ch.zuehlke.fullstack.ConnectZuehlke.domain;

import java.util.List;

public class DevelopmentProposal {
    private final String source;
    private final String name;
    private final List<Employee> experts;
    private final List<Employee> colleagues;

    public DevelopmentProposal(String source, String name, List<Employee> experts, List<Employee> colleagues) {
        this.source = source;
        this.name = name;
        this.experts = experts;
        this.colleagues = colleagues;
    }

    public String getSource() {
        return source;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getExperts() {
        return experts;
    }

    public List<Employee> getColleagues() {
        return colleagues;
    }
}
