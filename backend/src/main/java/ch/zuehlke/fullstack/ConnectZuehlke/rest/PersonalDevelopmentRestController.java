package ch.zuehlke.fullstack.ConnectZuehlke.rest;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.DevelopmentProposal;
import ch.zuehlke.fullstack.ConnectZuehlke.rest.dto.DevelopmentProposalDto;
import ch.zuehlke.fullstack.ConnectZuehlke.usecase.PersonalDevelopmentUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/api/personalDevelopment/")
public class PersonalDevelopmentRestController {

    private final PersonalDevelopmentUseCase personalDevelopmentUseCase;

    public PersonalDevelopmentRestController(PersonalDevelopmentUseCase personalDevelopmentUseCase) {
        this.personalDevelopmentUseCase = personalDevelopmentUseCase;
    }

    @GetMapping("/{employeeCode}")
    public List<DevelopmentProposalDto> getProposals(@PathVariable String employeeCode) {
        List<DevelopmentProposal> proposals = personalDevelopmentUseCase.getProposalsFor(employeeCode);
        return proposals.stream()
                .map(DevelopmentProposalDto::of)
                .collect(toList());
    }
}
