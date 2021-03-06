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

import java.util.Objects;

/**
 * AssetProjectLink
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class AssetProjectLink {

    @JsonProperty("Asset")

    private Asset asset = null;

    @JsonProperty("Project")

    private Project project = null;

    @JsonProperty("Employee")

    private Employee employee = null;

    @JsonProperty("Remarks")

    private String remarks = null;

    @JsonProperty("Amount")

    private Double amount = null;

    @JsonProperty("Rating")

    private Double rating = null;
    @JsonProperty("Outcome")

    private OutcomeEnum outcome = null;
    @JsonProperty("OutcomeText")

    private String outcomeText = null;
    @JsonProperty("Id")

    private Long id = null;

    public AssetProjectLink asset(Asset asset) {
        this.asset = asset;
        return this;
    }

    /**
     * Get asset
     *
     * @return asset
     **/
    @Schema(description = "")
    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public AssetProjectLink project(Project project) {
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

    public AssetProjectLink employee(Employee employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Get employee
     *
     * @return employee
     **/
    @Schema(description = "")
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public AssetProjectLink remarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * Get remarks
     *
     * @return remarks
     **/
    @Schema(description = "")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public AssetProjectLink amount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     **/
    @Schema(description = "")
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public AssetProjectLink rating(Double rating) {
        this.rating = rating;
        return this;
    }

    /**
     * Get rating
     *
     * @return rating
     **/
    @Schema(description = "")
    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public AssetProjectLink outcome(OutcomeEnum outcome) {
        this.outcome = outcome;
        return this;
    }

    /**
     * Get outcome
     *
     * @return outcome
     **/
    @Schema(description = "")
    public OutcomeEnum getOutcome() {
        return outcome;
    }

    public void setOutcome(OutcomeEnum outcome) {
        this.outcome = outcome;
    }

    /**
     * Get outcomeText
     *
     * @return outcomeText
     **/
    @Schema(description = "")
    public String getOutcomeText() {
        return outcomeText;
    }

    public AssetProjectLink id(Long id) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssetProjectLink assetProjectLink = (AssetProjectLink) o;
        return Objects.equals(this.asset, assetProjectLink.asset) &&
                Objects.equals(this.project, assetProjectLink.project) &&
                Objects.equals(this.employee, assetProjectLink.employee) &&
                Objects.equals(this.remarks, assetProjectLink.remarks) &&
                Objects.equals(this.amount, assetProjectLink.amount) &&
                Objects.equals(this.rating, assetProjectLink.rating) &&
                Objects.equals(this.outcome, assetProjectLink.outcome) &&
                Objects.equals(this.outcomeText, assetProjectLink.outcomeText) &&
                Objects.equals(this.id, assetProjectLink.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asset, project, employee, remarks, amount, rating, outcome, outcomeText, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetProjectLink {\n");

        sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
        sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
        sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
        sb.append("    outcomeText: ").append(toIndentedString(outcomeText)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
     * Gets or Sets outcome
     */
    public enum OutcomeEnum {
        NUMBER_0(0),
        NUMBER_1(1),
        NUMBER_2(2),
        NUMBER_3(3),
        NUMBER_4(4);

        private Integer value;

        OutcomeEnum(Integer value) {
            this.value = value;
        }

        @JsonCreator
        public static OutcomeEnum fromValue(String text) {
            for (OutcomeEnum b : OutcomeEnum.values()) {
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
