package ch.zuehlke.fullstack.ConnectZuehlke.rest.dto;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeDto {
    private String firstName;
    private String lastName;
    private String mail;
    private String mobilePhoneNumber;
    private String businessPhoneNumber;
    private String code;
    private String location;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getBusinessPhoneNumber() {
        return businessPhoneNumber;
    }

    public void setBusinessPhoneNumber(String businessPhoneNumber) {
        this.businessPhoneNumber = businessPhoneNumber;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static EmployeeDto of(Employee employee) {
        EmployeeDto dto = new EmployeeDto();
        dto.setCode(employee.getCode());
        dto.setFirstName(employee.getFirstName());
        dto.setLastName(employee.getLastName());
        dto.setMail(employee.getMailAddress());
        dto.setBusinessPhoneNumber(employee.getBusinessPhoneNumber());
        dto.setMobilePhoneNumber(employee.getMobilePhoneNumber());
        dto.setLocation(employee.getLocation());
        return dto;
    }
}
