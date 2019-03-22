package ch.zuehlke.fullstack.ConnectZuehlke.domain;

import static java.text.MessageFormat.format;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final String mailAddress;
    private final String mobilePhoneNumber;
    private final String businessPhoneNumber;
    private final int id;
    private final String code;
    private final String location;

    public Employee(String firstName, String lastName, int id) {
        this(firstName, lastName, id, firstName.substring(0, 1) + lastName.substring(0, 2));
    }

    public Employee(String firstName, String lastName, int id, String code) {
        this(firstName, lastName, format("{0}.{1}@zuehlke.com", firstName, lastName), null, null, id, code.toLowerCase(), null);
    }

    public Employee(String firstName, String lastName, String mailAddress, String mobilePhoneNumber, String businessPhoneNumber, int id, String code, String location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mailAddress = mailAddress;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.businessPhoneNumber = businessPhoneNumber;
        this.id = id;
        this.code = code;
        this.location = location;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public String getBusinessPhoneNumber() {
        return businessPhoneNumber;
    }

    public String getLocation() {
        return location;
    }
}
