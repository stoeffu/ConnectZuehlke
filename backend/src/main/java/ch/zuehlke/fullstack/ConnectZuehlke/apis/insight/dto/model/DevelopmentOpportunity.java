/*
 * WebApi
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * DevelopmentOpportunity
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class DevelopmentOpportunity {

    @JsonProperty("Name")

    private String name = null;

    @JsonProperty("DisciplineCode")

    private String disciplineCode = null;

    @JsonProperty("Grade")

    private String grade = null;

    @JsonProperty("Process")

    private String process = null;

    public DevelopmentOpportunity name(String name) {
        this.name = name;
        return this;
    }


    /**
     * Get name
     *
     * @return name
     **/
    @Schema(description = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DevelopmentOpportunity disciplineCode(String disciplineCode) {
        this.disciplineCode = disciplineCode;
        return this;
    }


    /**
     * Get disciplineCode
     *
     * @return disciplineCode
     **/
    @Schema(description = "")
    public String getDisciplineCode() {
        return disciplineCode;
    }

    public void setDisciplineCode(String disciplineCode) {
        this.disciplineCode = disciplineCode;
    }

    public DevelopmentOpportunity grade(String grade) {
        this.grade = grade;
        return this;
    }


    /**
     * Get grade
     *
     * @return grade
     **/
    @Schema(description = "")
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public DevelopmentOpportunity process(String process) {
        this.process = process;
        return this;
    }


    /**
     * Get process
     *
     * @return process
     **/
    @Schema(description = "")
    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DevelopmentOpportunity developmentOpportunity = (DevelopmentOpportunity) o;
        return Objects.equals(this.name, developmentOpportunity.name) &&
                Objects.equals(this.disciplineCode, developmentOpportunity.disciplineCode) &&
                Objects.equals(this.grade, developmentOpportunity.grade) &&
                Objects.equals(this.process, developmentOpportunity.process);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, disciplineCode, grade, process);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DevelopmentOpportunity {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    disciplineCode: ").append(toIndentedString(disciplineCode)).append("\n");
        sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
        sb.append("    process: ").append(toIndentedString(process)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}