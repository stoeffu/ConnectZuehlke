package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.mapper;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.model.ProjectParticipation;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;

import static java.util.Collections.singletonList;

public class ProjectMapper {
    public static Project toProject(ProjectParticipation dto) {
        return new Project(dto.getId().toString(), dto.getTitleResolved(), dto.getProject().getCode(), null,
                singletonList(EmployeeMapper.toEmployee(dto.getEmployee())));
    }
}
