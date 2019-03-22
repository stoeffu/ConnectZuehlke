package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.mapper;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.model.Employee;
import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.model.EmployeeResult;

public class EmployeeMapper {
    public static ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee toEmployee(Employee dto) {
        return new ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee(dto.getFirstName(),
                dto.getLastName(), dto.getMail(), dto.getMobilePhone(),
                dto.getBusinessPhone(), dto.getId().intValue(), dto.getCode(), dto.getLocation());
    }

    public static ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee toEmployee(EmployeeResult dto) {
        return new ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee(dto.getFirstName(),
                dto.getLastName(), dto.getMail(), dto.getMobilePhone(),
                dto.getBusinessPhone(), dto.getId().intValue(), dto.getCode(), dto.getLocation());
    }
}
