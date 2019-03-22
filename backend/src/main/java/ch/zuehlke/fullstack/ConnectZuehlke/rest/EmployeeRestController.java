package ch.zuehlke.fullstack.ConnectZuehlke.rest;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightEmployeeService;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/employee/")
public class EmployeeRestController {

    private final InsightEmployeeService employeeService;

    public EmployeeRestController(InsightEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/{employeeCode}")
    public Employee getEmployee(@PathVariable String employeeCode) {
        return employeeService.getEmployee(employeeCode);
    }

    @GetMapping(value = "/{employeeCode}/picture", produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody
    byte[] getEmployeePicture(@PathVariable String employeeCode) throws IOException {
        return employeeService.getEmployeePicture(employeeCode);
    }

}
