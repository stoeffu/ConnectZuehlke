package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class EmployeeDto {
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("MobilePhone")
    private String mobile;
    @JsonProperty("BusinessPhone")
    private String business;
    @JsonProperty("Mail")
    private String mailAddress;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
    }

    private String getCode() {
        return code;
    }

    public String getMobile() {
        return mobile;
    }

    public String getBusiness() {
        return business;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public Employee toEmployee() {
        return new Employee(getFirstName(), getLastName(), getMailAddress(), getMobile(), getBusiness(), getId(), getCode());
    }

}
