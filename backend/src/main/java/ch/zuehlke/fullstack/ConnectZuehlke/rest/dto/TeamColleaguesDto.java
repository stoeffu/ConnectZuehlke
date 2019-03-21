package ch.zuehlke.fullstack.ConnectZuehlke.rest.dto;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;

import java.util.List;

public class TeamColleaguesDto {

    private final List<Employee> colleagues;

    private TeamColleaguesDto(List<Employee> colleagues) {
        this.colleagues = colleagues;
    }

    public static TeamColleaguesDto of(List<Employee> teamColleagues) {
        return new TeamColleaguesDto(teamColleagues);
    }

    public List<Employee> getColleagues() {
        return colleagues;
    }
}
