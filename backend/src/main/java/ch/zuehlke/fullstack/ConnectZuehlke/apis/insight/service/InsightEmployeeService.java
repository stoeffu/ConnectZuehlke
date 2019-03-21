package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;

import java.io.IOException;
import java.util.List;

public interface InsightEmployeeService {

    List<Employee> getEmployees(List<String> employeeCodes);

    byte[] getEmployeePicture(String code) throws IOException;

    Employee getEmployee(String code);

    List<Project> getCurrentProjectsForEmployee(String code);
}
