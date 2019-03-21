package ch.zuehlke.fullstack.ConnectZuehlke.domain;

import java.util.List;
import java.util.Objects;

public class Project {
    private final String id;
    private final String name;
    private final String code;
    private final Customer customer;
    private final List<Employee> employees;

    public Project(String id, String name, String code, Customer customer, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.customer = customer;
        this.employees = employees;
    }

    public Project withEmployees(List<Employee> employees) {
        return new Project(getId(), getName(), getCode(), getCustomer(), employees);
    }

    public String getCode() {
        return code;
    }

    public String getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(code, project.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
