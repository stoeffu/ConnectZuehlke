package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Group;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Skill;

import java.io.IOException;
import java.util.List;

public interface InsightEmployeeService {

    List<Employee> getEmployees(List<String> employeeCodes);

    byte[] getEmployeePicture(String code) throws IOException;

    Employee getEmployee(String code);

    List<Project> getCurrentProjectsForEmployee(String code);

    List<Group> getCurrentGroupsForEmployee(String code);

    List<Skill> getInterestsForEmployee(String code);

    List<Skill> getSkillGoalsForEmployee(String code);
}
