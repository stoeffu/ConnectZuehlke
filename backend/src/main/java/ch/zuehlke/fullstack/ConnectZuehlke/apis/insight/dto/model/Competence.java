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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Competence
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class Competence {

    @JsonProperty("Id")

    private Long id = null;

    @JsonProperty("Skill")

    private Skill skill = null;

    @JsonProperty("Description")

    private String description = null;
    @JsonProperty("Experience")

    private ExperienceEnum experience = null;
    @JsonProperty("Trainings")

    private List<Training> trainings = null;
    @JsonProperty("ExperienceText")

    private String experienceText = null;

    public Competence id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @Schema(description = "")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Competence skill(Skill skill) {
        this.skill = skill;
        return this;
    }

    /**
     * Get skill
     *
     * @return skill
     **/
    @Schema(description = "")
    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Competence description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @Schema(description = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Competence experience(ExperienceEnum experience) {
        this.experience = experience;
        return this;
    }

    /**
     * Get experience
     *
     * @return experience
     **/
    @Schema(description = "")
    public ExperienceEnum getExperience() {
        return experience;
    }

    public void setExperience(ExperienceEnum experience) {
        this.experience = experience;
    }

    public Competence trainings(List<Training> trainings) {
        this.trainings = trainings;
        return this;
    }

    public Competence addTrainingsItem(Training trainingsItem) {
        if (this.trainings == null) {
            this.trainings = new ArrayList<Training>();
        }
        this.trainings.add(trainingsItem);
        return this;
    }

    /**
     * Get trainings
     *
     * @return trainings
     **/
    @Schema(description = "")
    public List<Training> getTrainings() {
        return trainings;
    }

    public void setTrainings(List<Training> trainings) {
        this.trainings = trainings;
    }

    /**
     * Get experienceText
     *
     * @return experienceText
     **/
    @Schema(description = "")
    public String getExperienceText() {
        return experienceText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Competence competence = (Competence) o;
        return Objects.equals(this.id, competence.id) &&
                Objects.equals(this.skill, competence.skill) &&
                Objects.equals(this.description, competence.description) &&
                Objects.equals(this.experience, competence.experience) &&
                Objects.equals(this.trainings, competence.trainings) &&
                Objects.equals(this.experienceText, competence.experienceText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, skill, description, experience, trainings, experienceText);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Competence {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    skill: ").append(toIndentedString(skill)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
        sb.append("    trainings: ").append(toIndentedString(trainings)).append("\n");
        sb.append("    experienceText: ").append(toIndentedString(experienceText)).append("\n");
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

    /**
     * Gets or Sets experience
     */
    public enum ExperienceEnum {
        NUMBER_0(0),
        NUMBER_1(1),
        NUMBER_2(2),
        NUMBER_4(4),
        NUMBER_5(5),
        NUMBER_6(6);

        private Integer value;

        ExperienceEnum(Integer value) {
            this.value = value;
        }

        @JsonCreator
        public static ExperienceEnum fromValue(String text) {
            for (ExperienceEnum b : ExperienceEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

    }

}
