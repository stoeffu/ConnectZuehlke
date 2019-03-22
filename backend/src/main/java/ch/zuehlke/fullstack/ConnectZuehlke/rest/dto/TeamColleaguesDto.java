package ch.zuehlke.fullstack.ConnectZuehlke.rest.dto;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class TeamColleaguesDto {

    private final List<EmployeeDto> colleagues;

    private TeamColleaguesDto(List<EmployeeDto> colleagues) {
        this.colleagues = colleagues;
    }

    public static TeamColleaguesDto of(List<Employee> teamColleagues) {
        List<EmployeeDto> teamColleaguesDto = teamColleagues.stream()
                .map(EmployeeDto::of)
                .collect(Collectors.toList());

        return new TeamColleaguesDto(teamColleaguesDto);
    }

    public List<EmployeeDto> getColleagues() {
        return colleagues;
    }
}
