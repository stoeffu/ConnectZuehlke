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
 * AssetSolutionLink
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class AssetSolutionLink {

    @JsonProperty("Id")

    private Long id = null;

    @JsonProperty("AssetId")

    private Long assetId = null;

    @JsonProperty("SolutionId")

    private Long solutionId = null;

    @JsonProperty("Solution")

    private Solution solution = null;

    @JsonProperty("IsSingleLink")

    private Boolean isSingleLink = null;

    @JsonProperty("SolutionExpression")

    private String solutionExpression = null;

    @JsonProperty("TechnicalBenefit")

    private String technicalBenefit = null;

    @JsonProperty("ContributionToValueProposition")

    private String contributionToValueProposition = null;

    @JsonProperty("Condition")

    private String condition = null;

    public AssetSolutionLink id(Long id) {
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

    public AssetSolutionLink assetId(Long assetId) {
        this.assetId = assetId;
        return this;
    }


    /**
     * Get assetId
     *
     * @return assetId
     **/
    @Schema(description = "")
    public Long getAssetId() {
        return assetId;
    }

    public void setAssetId(Long assetId) {
        this.assetId = assetId;
    }

    public AssetSolutionLink solutionId(Long solutionId) {
        this.solutionId = solutionId;
        return this;
    }


    /**
     * Get solutionId
     *
     * @return solutionId
     **/
    @Schema(description = "")
    public Long getSolutionId() {
        return solutionId;
    }

    public void setSolutionId(Long solutionId) {
        this.solutionId = solutionId;
    }

    public AssetSolutionLink solution(Solution solution) {
        this.solution = solution;
        return this;
    }


    /**
     * Get solution
     *
     * @return solution
     **/
    @Schema(description = "")
    public Solution getSolution() {
        return solution;
    }

    public void setSolution(Solution solution) {
        this.solution = solution;
    }

    public AssetSolutionLink isSingleLink(Boolean isSingleLink) {
        this.isSingleLink = isSingleLink;
        return this;
    }


    /**
     * Get isSingleLink
     *
     * @return isSingleLink
     **/
    @Schema(description = "")
    public Boolean isIsSingleLink() {
        return isSingleLink;
    }

    public void setIsSingleLink(Boolean isSingleLink) {
        this.isSingleLink = isSingleLink;
    }

    public AssetSolutionLink solutionExpression(String solutionExpression) {
        this.solutionExpression = solutionExpression;
        return this;
    }


    /**
     * Get solutionExpression
     *
     * @return solutionExpression
     **/
    @Schema(description = "")
    public String getSolutionExpression() {
        return solutionExpression;
    }

    public void setSolutionExpression(String solutionExpression) {
        this.solutionExpression = solutionExpression;
    }

    public AssetSolutionLink technicalBenefit(String technicalBenefit) {
        this.technicalBenefit = technicalBenefit;
        return this;
    }


    /**
     * Get technicalBenefit
     *
     * @return technicalBenefit
     **/
    @Schema(description = "")
    public String getTechnicalBenefit() {
        return technicalBenefit;
    }

    public void setTechnicalBenefit(String technicalBenefit) {
        this.technicalBenefit = technicalBenefit;
    }

    public AssetSolutionLink contributionToValueProposition(String contributionToValueProposition) {
        this.contributionToValueProposition = contributionToValueProposition;
        return this;
    }


    /**
     * Get contributionToValueProposition
     *
     * @return contributionToValueProposition
     **/
    @Schema(description = "")
    public String getContributionToValueProposition() {
        return contributionToValueProposition;
    }

    public void setContributionToValueProposition(String contributionToValueProposition) {
        this.contributionToValueProposition = contributionToValueProposition;
    }

    public AssetSolutionLink condition(String condition) {
        this.condition = condition;
        return this;
    }


    /**
     * Get condition
     *
     * @return condition
     **/
    @Schema(description = "")
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssetSolutionLink assetSolutionLink = (AssetSolutionLink) o;
        return Objects.equals(this.id, assetSolutionLink.id) &&
                Objects.equals(this.assetId, assetSolutionLink.assetId) &&
                Objects.equals(this.solutionId, assetSolutionLink.solutionId) &&
                Objects.equals(this.solution, assetSolutionLink.solution) &&
                Objects.equals(this.isSingleLink, assetSolutionLink.isSingleLink) &&
                Objects.equals(this.solutionExpression, assetSolutionLink.solutionExpression) &&
                Objects.equals(this.technicalBenefit, assetSolutionLink.technicalBenefit) &&
                Objects.equals(this.contributionToValueProposition, assetSolutionLink.contributionToValueProposition) &&
                Objects.equals(this.condition, assetSolutionLink.condition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, assetId, solutionId, solution, isSingleLink, solutionExpression, technicalBenefit, contributionToValueProposition, condition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetSolutionLink {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    solutionId: ").append(toIndentedString(solutionId)).append("\n");
        sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
        sb.append("    isSingleLink: ").append(toIndentedString(isSingleLink)).append("\n");
        sb.append("    solutionExpression: ").append(toIndentedString(solutionExpression)).append("\n");
        sb.append("    technicalBenefit: ").append(toIndentedString(technicalBenefit)).append("\n");
        sb.append("    contributionToValueProposition: ").append(toIndentedString(contributionToValueProposition)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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