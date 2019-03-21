package ch.zuehlke.fullstack.ConnectZuehlke.rest;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
import ch.zuehlke.fullstack.ConnectZuehlke.rest.dto.ProjectColleaguesDto;
import ch.zuehlke.fullstack.ConnectZuehlke.usecase.ProjectColleaguesUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectColleaguesRestController {

    private final ProjectColleaguesUseCase projectColleaguesUseCase;

    public ProjectColleaguesRestController(ProjectColleaguesUseCase projectColleaguesUseCase) {
        this.projectColleaguesUseCase = projectColleaguesUseCase;
    }

    @GetMapping("/api/{code}/projectColleagues")
    public ProjectColleaguesDto getProjectColleagues(@PathVariable String code) {
        List<Project> projects = projectColleaguesUseCase.getProjectColleaguesFor(code);
        return ProjectColleaguesDto.of(projects);
    }

}
