package ch.zuehlke.fullstack.ConnectZuehlke.rest.dto;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.DevelopmentProposal;

import java.util.List;

import static java.util.stream.Collectors.toList;

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

    public static DevelopmentProposalDto of(DevelopmentProposal proposal) {
        DevelopmentProposalDto dto = new DevelopmentProposalDto();
        dto.setExperts(proposal.getExperts().stream().map(EmployeeDto::of).collect(toList()));
        dto.setInterestedColleagues(proposal.getColleagues().stream().map(EmployeeDto::of).collect(toList()));
        dto.setName(proposal.getName());
        dto.setSource(proposal.getSource());
        return dto;
    }
}
