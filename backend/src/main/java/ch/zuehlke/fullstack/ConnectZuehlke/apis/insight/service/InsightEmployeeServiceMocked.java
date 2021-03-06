package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Group;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Skill;
import org.apache.commons.io.IOUtils;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

@Service
@Profile({"ci", "default"})
public class InsightEmployeeServiceMocked implements InsightEmployeeService {

    public static final List<Employee> EMPLOYEES = asList(
            new Employee("Klaus", "Mustermann", 1, "kmu"),
            new Employee("Magda", "Müller", 2, "mmu"),
            new Employee("Kurt", "Peters", 3, "kpe")
    );

    public List<Employee> getEmployees(List<String> employeeCodes) {
        return EMPLOYEES;
    }

    @Override
    public byte[] getEmployeePicture(String code) throws IOException {
        ClassPathResource classPathResource = new ClassPathResource("demo_picture.jpg");
        return IOUtils.toByteArray(classPathResource.getInputStream());
    }

    @Override
    public Employee getEmployee(String code) {
        return EMPLOYEES.stream().filter(employee -> employee.getCode().equals(code)).findFirst().orElse(null);
    }

    @Override
    public List<Project> getCurrentProjectsForEmployee(String code) {
        return Collections.emptyList();
    }

    @Override
    public List<Group> getCurrentGroupsForEmployee(String code) {
        return Collections.emptyList();
    }

    @Override
    public List<Skill> getInterestsForEmployee(String code) {
        return Collections.emptyList();
    }

    @Override
    public List<Skill> getSkillGoalsForEmployee(String code) {
        return Collections.emptyList();
    }
}
