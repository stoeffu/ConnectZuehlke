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
 * AssetBudgetPhase
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class AssetBudgetPhase {

    @JsonProperty("Project")

    private Project project = null;

    @JsonProperty("Phase")

    private ProjectPhase phase = null;

    @JsonProperty("PlannedAmount")

    private Double plannedAmount = null;

    @JsonProperty("EffectiveAmount")

    private Double effectiveAmount = null;

    public AssetBudgetPhase project(Project project) {
        this.project = project;
        return this;
    }


    /**
     * Get project
     *
     * @return project
     **/
    @Schema(description = "")
    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public AssetBudgetPhase phase(ProjectPhase phase) {
        this.phase = phase;
        return this;
    }


    /**
     * Get phase
     *
     * @return phase
     **/
    @Schema(description = "")
    public ProjectPhase getPhase() {
        return phase;
    }

    public void setPhase(ProjectPhase phase) {
        this.phase = phase;
    }

    public AssetBudgetPhase plannedAmount(Double plannedAmount) {
        this.plannedAmount = plannedAmount;
        return this;
    }


    /**
     * Get plannedAmount
     *
     * @return plannedAmount
     **/
    @Schema(description = "")
    public Double getPlannedAmount() {
        return plannedAmount;
    }

    public void setPlannedAmount(Double plannedAmount) {
        this.plannedAmount = plannedAmount;
    }

    public AssetBudgetPhase effectiveAmount(Double effectiveAmount) {
        this.effectiveAmount = effectiveAmount;
        return this;
    }


    /**
     * Get effectiveAmount
     *
     * @return effectiveAmount
     **/
    @Schema(description = "")
    public Double getEffectiveAmount() {
        return effectiveAmount;
    }

    public void setEffectiveAmount(Double effectiveAmount) {
        this.effectiveAmount = effectiveAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssetBudgetPhase assetBudgetPhase = (AssetBudgetPhase) o;
        return Objects.equals(this.project, assetBudgetPhase.project) &&
                Objects.equals(this.phase, assetBudgetPhase.phase) &&
                Objects.equals(this.plannedAmount, assetBudgetPhase.plannedAmount) &&
                Objects.equals(this.effectiveAmount, assetBudgetPhase.effectiveAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project, phase, plannedAmount, effectiveAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetBudgetPhase {\n");

        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    plannedAmount: ").append(toIndentedString(plannedAmount)).append("\n");
        sb.append("    effectiveAmount: ").append(toIndentedString(effectiveAmount)).append("\n");
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
