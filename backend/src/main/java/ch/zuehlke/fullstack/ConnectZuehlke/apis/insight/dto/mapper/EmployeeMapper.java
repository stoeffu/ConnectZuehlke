package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.mapper;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.model.EmployeeResult;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;

public class EmployeeMapper {
    public static Employee toEmployee(EmployeeResult dto) {
        return new Employee(dto.getFirstName(), dto.getLastName(), dto.getMail(), dto.getMobilePhone(),
                dto.getBusinessPhone(), dto.getId().intValue(), dto.getCode());
    }
}
