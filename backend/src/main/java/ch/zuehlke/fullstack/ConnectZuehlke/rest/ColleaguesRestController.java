package ch.zuehlke.fullstack.ConnectZuehlke.rest;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
import ch.zuehlke.fullstack.ConnectZuehlke.rest.dto.ProjectColleaguesDto;
import ch.zuehlke.fullstack.ConnectZuehlke.rest.dto.TeamColleaguesDto;
import ch.zuehlke.fullstack.ConnectZuehlke.usecase.ColleaguesUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/colleagues")
public class ColleaguesRestController {

    private final ColleaguesUseCase colleaguesUseCase;

    public ColleaguesRestController(ColleaguesUseCase colleaguesUseCase) {
        this.colleaguesUseCase = colleaguesUseCase;
    }

    @GetMapping("/{employee-code}/projects")
    public ProjectColleaguesDto getProjectColleagues(@PathVariable("employee-code") String employeeCode) {
        List<Project> projects = colleaguesUseCase.getProjectColleaguesFor(employeeCode);
        return ProjectColleaguesDto.of(projects);
    }

    @GetMapping("/{employee-code}/team")
    public TeamColleaguesDto getTeamColleagues(@PathVariable("employee-code") String employeeCode) {
        List<Employee> teamColleagues = colleaguesUseCase.getTeamColleaguesFor(employeeCode);
        return TeamColleaguesDto.of(teamColleagues);
    }

}
