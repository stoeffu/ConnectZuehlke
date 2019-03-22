package ch.zuehlke.fullstack.ConnectZuehlke.rest.dto;

import java.util.List;

public class DevelopmentProposalDto {
    private String name;
    private String source;
    private List<EmployeeDto> experts;
    private List<EmployeeDto> interestedColleagues;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public List<EmployeeDto> getExperts() {
        return experts;
    }

    public void setExperts(List<EmployeeDto> experts) {
        this.experts = experts;
    }

    public List<EmployeeDto> getInterestedColleagues() {
        return interestedColleagues;
    }

    public void setInterestedColleagues(List<EmployeeDto> interestedColleagues) {
        this.interestedColleagues = interestedColleagues;
    }
}
