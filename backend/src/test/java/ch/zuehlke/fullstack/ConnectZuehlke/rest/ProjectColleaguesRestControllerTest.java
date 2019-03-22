package ch.zuehlke.fullstack.ConnectZuehlke.rest;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
import ch.zuehlke.fullstack.ConnectZuehlke.usecase.ColleaguesUseCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@ActiveProfiles("default")
@WebMvcTest(value = ColleaguesRestController.class)
public class ProjectColleaguesRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ColleaguesUseCase useCase;

    @Test
    public void emptyResponse() throws Exception {
        when(useCase.getProjectColleaguesFor("abc")).thenReturn(emptyList());

        mockMvc.perform(get("/api/colleagues/abc/projects"))
                .andExpect(content().json("{}"));
    }

    @Test
    public void getColleagues() throws Exception {
        when(useCase.getProjectColleaguesFor("abc")).thenReturn(asList(
                new Project("123", "Swisscom", "C123", null, asList(
                        new Employee("Hans", "Wurst", 4242),
                        new Employee("Emma", "Laden", 2424)
                )),
                new Project("321", "SBB", "C321", null, asList(
                        new Employee("Hans", "Wurst", 4242),
                        new Employee("Peter", "Meier", 1234)
                ))
        ));

        mockMvc.perform(get("/api/colleagues/abc/projects"))
                .andExpect(content().json("{\n" +
                        "  \"projects\": [\n" +
                        "    {\n" +
                        "      \"colleagues\": [\n" +
                        "        {\n" +
                        "          \"firstName\": \"Hans\",\n" +
                        "          \"lastName\": \"Wurst\",\n" +
                        "          \"mail\": \"Hans.Wurst@zuehlke.com\",\n" +
                        "          \"code\": \"hwu\"\n" +
                        "        },\n" +
                        "        {\n" +
                        "          \"firstName\": \"Emma\",\n" +
                        "          \"lastName\": \"Laden\",\n" +
                        "          \"mail\": \"Emma.Laden@zuehlke.com\",\n" +
                        "          \"code\": \"ela\"\n" +
                        "        }\n" +
                        "      ],\n" +
                        "      \"projectName\": \"Swisscom\"\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"colleagues\": [\n" +
                        "        {\n" +
                        "          \"firstName\": \"Hans\",\n" +
                        "          \"lastName\": \"Wurst\",\n" +
                        "          \"mail\": \"Hans.Wurst@zuehlke.com\",\n" +
                        "          \"code\": \"hwu\"\n" +
                        "        },\n" +
                        "        {\n" +
                        "          \"firstName\": \"Peter\",\n" +
                        "          \"lastName\": \"Meier\",\n" +
                        "          \"mail\": \"Peter.Meier@zuehlke.com\",\n" +
                        "          \"code\": \"pme\"\n" +
                        "        }\n" +
                        "      ],\n" +
                        "      \"projectName\": \"SBB\"\n" +
                        "    }\n" +
                        "  ]\n" +
                        "}"));
    }
}
