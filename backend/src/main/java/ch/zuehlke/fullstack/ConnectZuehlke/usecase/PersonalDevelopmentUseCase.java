package ch.zuehlke.fullstack.ConnectZuehlke.usecase;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.DevelopmentProposal;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Arrays.asList;

@Service
public class PersonalDevelopmentUseCase {
    public List<DevelopmentProposal> getProposalsFor(String employeeCode) {
        return getMockData();
    }

    private List<DevelopmentProposal> getMockData() {
        Employee e1 = new Employee("Hugo", "Boss", 100);
        Employee e2 = new Employee("Maria", "Meier", 100);
        Employee e3 = new Employee("Franz", "Müller", 100);
        Employee e4 = new Employee("Helena", "Kummer", 100);
        return asList(
                new DevelopmentProposal("Interests", "Angular", asList(e1, e2), asList(e3, e4)),
                new DevelopmentProposal("Development Goals", "Spring", asList(e2, e4), asList(e1, e3))
        );
    }
}
