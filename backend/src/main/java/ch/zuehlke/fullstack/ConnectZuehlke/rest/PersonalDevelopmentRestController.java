package ch.zuehlke.fullstack.ConnectZuehlke.rest;

import ch.zuehlke.fullstack.ConnectZuehlke.rest.dto.DevelopmentProposalDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/personalDevelopment/")
public class PersonalDevelopmentRestController {

    @GetMapping("/{employeeCode}")
    public List<DevelopmentProposalDto> getProposals(@PathVariable String employeeCode) {
        return Collections.emptyList();
    }
}
