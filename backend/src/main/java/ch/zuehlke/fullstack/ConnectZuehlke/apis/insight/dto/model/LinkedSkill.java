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


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * LinkedSkill
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class LinkedSkill {

    @JsonProperty("Id")

    private Long id = null;

    @JsonProperty("ParentId")

    private Long parentId = null;

    @JsonProperty("InfoPageLink")

    private String infoPageLink = null;

    @JsonProperty("Name")

    private String name = null;

    @JsonProperty("NameDe")

    private String nameDe = null;

    @JsonProperty("GroupName")

    private String groupName = null;

    @JsonProperty("ShortDescription")

    private String shortDescription = null;

    @JsonProperty("Description")

    private String description = null;

    @JsonProperty("InvestmentRemarks")

    private String investmentRemarks = null;

    @JsonProperty("BeginnerDefinition")

    private String beginnerDefinition = null;

    @JsonProperty("ProficientDefinition")

    private String proficientDefinition = null;

    @JsonProperty("ExpertDefinition")

    private String expertDefinition = null;

    @JsonProperty("Aliases")

    private String aliases = null;

    @JsonProperty("SortOrder")

    private Integer sortOrder = null;

    @JsonProperty("Category")

    private SkillCategory category = null;

    @JsonProperty("EmployeeCount")

    private Integer employeeCount = null;

    @JsonProperty("BeginnerCount")

    private Integer beginnerCount = null;

    @JsonProperty("ProficientCount")

    private Integer proficientCount = null;

    @JsonProperty("ExpertCount")

    private Integer expertCount = null;

    @JsonProperty("InterestedCount")

    private Integer interestedCount = null;

    @JsonProperty("Capability")

    private Capability capability = null;

    @JsonProperty("IsManagedSkill")

    private Boolean isManagedSkill = null;

    @JsonProperty("Children")

    private List<LinkedSkill> children = null;

    @JsonProperty("Parents")

    private List<LinkedSkill> parents = null;

    @JsonProperty("CompanyLinks")

    private List<SkillCompanyLink> companyLinks = null;

    @JsonProperty("Modified")

    private String modified = null;

    @JsonProperty("Creator")

    private Employee creator = null;

    @JsonProperty("Modifier")

    private Employee modifier = null;

    @JsonProperty("IsMetaSkill")

    private Boolean isMetaSkill = null;

    @JsonProperty("Depth")

    private Integer depth = null;

    @JsonProperty("IsVisible")

    private Boolean isVisible = null;

    public LinkedSkill id(Long id) {
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

    public LinkedSkill parentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }


    /**
     * Get parentId
     *
     * @return parentId
     **/
    @Schema(description = "")
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public LinkedSkill infoPageLink(String infoPageLink) {
        this.infoPageLink = infoPageLink;
        return this;
    }


    /**
     * Get infoPageLink
     *
     * @return infoPageLink
     **/
    @Schema(description = "")
    public String getInfoPageLink() {
        return infoPageLink;
    }

    public void setInfoPageLink(String infoPageLink) {
        this.infoPageLink = infoPageLink;
    }

    public LinkedSkill name(String name) {
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

    public LinkedSkill nameDe(String nameDe) {
        this.nameDe = nameDe;
        return this;
    }


    /**
     * Get nameDe
     *
     * @return nameDe
     **/
    @Schema(description = "")
    public String getNameDe() {
        return nameDe;
    }

    public void setNameDe(String nameDe) {
        this.nameDe = nameDe;
    }

    public LinkedSkill groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }


    /**
     * Get groupName
     *
     * @return groupName
     **/
    @Schema(description = "")
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public LinkedSkill shortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }


    /**
     * Get shortDescription
     *
     * @return shortDescription
     **/
    @Schema(description = "")
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public LinkedSkill description(String description) {
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

    public LinkedSkill investmentRemarks(String investmentRemarks) {
        this.investmentRemarks = investmentRemarks;
        return this;
    }


    /**
     * Get investmentRemarks
     *
     * @return investmentRemarks
     **/
    @Schema(description = "")
    public String getInvestmentRemarks() {
        return investmentRemarks;
    }

    public void setInvestmentRemarks(String investmentRemarks) {
        this.investmentRemarks = investmentRemarks;
    }

    public LinkedSkill beginnerDefinition(String beginnerDefinition) {
        this.beginnerDefinition = beginnerDefinition;
        return this;
    }


    /**
     * Get beginnerDefinition
     *
     * @return beginnerDefinition
     **/
    @Schema(description = "")
    public String getBeginnerDefinition() {
        return beginnerDefinition;
    }

    public void setBeginnerDefinition(String beginnerDefinition) {
        this.beginnerDefinition = beginnerDefinition;
    }

    public LinkedSkill proficientDefinition(String proficientDefinition) {
        this.proficientDefinition = proficientDefinition;
        return this;
    }


    /**
     * Get proficientDefinition
     *
     * @return proficientDefinition
     **/
    @Schema(description = "")
    public String getProficientDefinition() {
        return proficientDefinition;
    }

    public void setProficientDefinition(String proficientDefinition) {
        this.proficientDefinition = proficientDefinition;
    }

    public LinkedSkill expertDefinition(String expertDefinition) {
        this.expertDefinition = expertDefinition;
        return this;
    }


    /**
     * Get expertDefinition
     *
     * @return expertDefinition
     **/
    @Schema(description = "")
    public String getExpertDefinition() {
        return expertDefinition;
    }

    public void setExpertDefinition(String expertDefinition) {
        this.expertDefinition = expertDefinition;
    }

    public LinkedSkill aliases(String aliases) {
        this.aliases = aliases;
        return this;
    }


    /**
     * Get aliases
     *
     * @return aliases
     **/
    @Schema(description = "")
    public String getAliases() {
        return aliases;
    }

    public void setAliases(String aliases) {
        this.aliases = aliases;
    }

    public LinkedSkill sortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }


    /**
     * Get sortOrder
     *
     * @return sortOrder
     **/
    @Schema(description = "")
    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public LinkedSkill category(SkillCategory category) {
        this.category = category;
        return this;
    }


    /**
     * Get category
     *
     * @return category
     **/
    @Schema(description = "")
    public SkillCategory getCategory() {
        return category;
    }

    public void setCategory(SkillCategory category) {
        this.category = category;
    }

    /**
     * Get employeeCount
     *
     * @return employeeCount
     **/
    @Schema(description = "")
    public Integer getEmployeeCount() {
        return employeeCount;
    }

    public LinkedSkill beginnerCount(Integer beginnerCount) {
        this.beginnerCount = beginnerCount;
        return this;
    }


    /**
     * Get beginnerCount
     *
     * @return beginnerCount
     **/
    @Schema(description = "")
    public Integer getBeginnerCount() {
        return beginnerCount;
    }

    public void setBeginnerCount(Integer beginnerCount) {
        this.beginnerCount = beginnerCount;
    }

    public LinkedSkill proficientCount(Integer proficientCount) {
        this.proficientCount = proficientCount;
        return this;
    }


    /**
     * Get proficientCount
     *
     * @return proficientCount
     **/
    @Schema(description = "")
    public Integer getProficientCount() {
        return proficientCount;
    }

    public void setProficientCount(Integer proficientCount) {
        this.proficientCount = proficientCount;
    }

    public LinkedSkill expertCount(Integer expertCount) {
        this.expertCount = expertCount;
        return this;
    }


    /**
     * Get expertCount
     *
     * @return expertCount
     **/
    @Schema(description = "")
    public Integer getExpertCount() {
        return expertCount;
    }

    public void setExpertCount(Integer expertCount) {
        this.expertCount = expertCount;
    }

    public LinkedSkill interestedCount(Integer interestedCount) {
        this.interestedCount = interestedCount;
        return this;
    }


    /**
     * Get interestedCount
     *
     * @return interestedCount
     **/
    @Schema(description = "")
    public Integer getInterestedCount() {
        return interestedCount;
    }

    public void setInterestedCount(Integer interestedCount) {
        this.interestedCount = interestedCount;
    }

    public LinkedSkill capability(Capability capability) {
        this.capability = capability;
        return this;
    }


    /**
     * Get capability
     *
     * @return capability
     **/
    @Schema(description = "")
    public Capability getCapability() {
        return capability;
    }

    public void setCapability(Capability capability) {
        this.capability = capability;
    }

    /**
     * Get isManagedSkill
     *
     * @return isManagedSkill
     **/
    @Schema(description = "")
    public Boolean isIsManagedSkill() {
        return isManagedSkill;
    }

    public LinkedSkill children(List<LinkedSkill> children) {
        this.children = children;
        return this;
    }

    public LinkedSkill addChildrenItem(LinkedSkill childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<LinkedSkill>();
        }
        this.children.add(childrenItem);
        return this;
    }

    /**
     * Get children
     *
     * @return children
     **/
    @Schema(description = "")
    public List<LinkedSkill> getChildren() {
        return children;
    }

    public void setChildren(List<LinkedSkill> children) {
        this.children = children;
    }

    public LinkedSkill parents(List<LinkedSkill> parents) {
        this.parents = parents;
        return this;
    }

    public LinkedSkill addParentsItem(LinkedSkill parentsItem) {
        if (this.parents == null) {
            this.parents = new ArrayList<LinkedSkill>();
        }
        this.parents.add(parentsItem);
        return this;
    }

    /**
     * Get parents
     *
     * @return parents
     **/
    @Schema(description = "")
    public List<LinkedSkill> getParents() {
        return parents;
    }

    public void setParents(List<LinkedSkill> parents) {
        this.parents = parents;
    }

    public LinkedSkill companyLinks(List<SkillCompanyLink> companyLinks) {
        this.companyLinks = companyLinks;
        return this;
    }

    public LinkedSkill addCompanyLinksItem(SkillCompanyLink companyLinksItem) {
        if (this.companyLinks == null) {
            this.companyLinks = new ArrayList<SkillCompanyLink>();
        }
        this.companyLinks.add(companyLinksItem);
        return this;
    }

    /**
     * Get companyLinks
     *
     * @return companyLinks
     **/
    @Schema(description = "")
    public List<SkillCompanyLink> getCompanyLinks() {
        return companyLinks;
    }

    public void setCompanyLinks(List<SkillCompanyLink> companyLinks) {
        this.companyLinks = companyLinks;
    }

    public LinkedSkill modified(String modified) {
        this.modified = modified;
        return this;
    }


    /**
     * Get modified
     *
     * @return modified
     **/
    @Schema(description = "")
    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public LinkedSkill creator(Employee creator) {
        this.creator = creator;
        return this;
    }


    /**
     * Get creator
     *
     * @return creator
     **/
    @Schema(description = "")
    public Employee getCreator() {
        return creator;
    }

    public void setCreator(Employee creator) {
        this.creator = creator;
    }

    public LinkedSkill modifier(Employee modifier) {
        this.modifier = modifier;
        return this;
    }


    /**
     * Get modifier
     *
     * @return modifier
     **/
    @Schema(description = "")
    public Employee getModifier() {
        return modifier;
    }

    public void setModifier(Employee modifier) {
        this.modifier = modifier;
    }

    public LinkedSkill isMetaSkill(Boolean isMetaSkill) {
        this.isMetaSkill = isMetaSkill;
        return this;
    }


    /**
     * Get isMetaSkill
     *
     * @return isMetaSkill
     **/
    @Schema(description = "")
    public Boolean isIsMetaSkill() {
        return isMetaSkill;
    }

    public void setIsMetaSkill(Boolean isMetaSkill) {
        this.isMetaSkill = isMetaSkill;
    }

    /**
     * Get depth
     *
     * @return depth
     **/
    @Schema(description = "")
    public Integer getDepth() {
        return depth;
    }

    public LinkedSkill isVisible(Boolean isVisible) {
        this.isVisible = isVisible;
        return this;
    }


    /**
     * Get isVisible
     *
     * @return isVisible
     **/
    @Schema(description = "")
    public Boolean isIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LinkedSkill linkedSkill = (LinkedSkill) o;
        return Objects.equals(this.id, linkedSkill.id) &&
                Objects.equals(this.parentId, linkedSkill.parentId) &&
                Objects.equals(this.infoPageLink, linkedSkill.infoPageLink) &&
                Objects.equals(this.name, linkedSkill.name) &&
                Objects.equals(this.nameDe, linkedSkill.nameDe) &&
                Objects.equals(this.groupName, linkedSkill.groupName) &&
                Objects.equals(this.shortDescription, linkedSkill.shortDescription) &&
                Objects.equals(this.description, linkedSkill.description) &&
                Objects.equals(this.investmentRemarks, linkedSkill.investmentRemarks) &&
                Objects.equals(this.beginnerDefinition, linkedSkill.beginnerDefinition) &&
                Objects.equals(this.proficientDefinition, linkedSkill.proficientDefinition) &&
                Objects.equals(this.expertDefinition, linkedSkill.expertDefinition) &&
                Objects.equals(this.aliases, linkedSkill.aliases) &&
                Objects.equals(this.sortOrder, linkedSkill.sortOrder) &&
                Objects.equals(this.category, linkedSkill.category) &&
                Objects.equals(this.employeeCount, linkedSkill.employeeCount) &&
                Objects.equals(this.beginnerCount, linkedSkill.beginnerCount) &&
                Objects.equals(this.proficientCount, linkedSkill.proficientCount) &&
                Objects.equals(this.expertCount, linkedSkill.expertCount) &&
                Objects.equals(this.interestedCount, linkedSkill.interestedCount) &&
                Objects.equals(this.capability, linkedSkill.capability) &&
                Objects.equals(this.isManagedSkill, linkedSkill.isManagedSkill) &&
                Objects.equals(this.children, linkedSkill.children) &&
                Objects.equals(this.parents, linkedSkill.parents) &&
                Objects.equals(this.companyLinks, linkedSkill.companyLinks) &&
                Objects.equals(this.modified, linkedSkill.modified) &&
                Objects.equals(this.creator, linkedSkill.creator) &&
                Objects.equals(this.modifier, linkedSkill.modifier) &&
                Objects.equals(this.isMetaSkill, linkedSkill.isMetaSkill) &&
                Objects.equals(this.depth, linkedSkill.depth) &&
                Objects.equals(this.isVisible, linkedSkill.isVisible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parentId, infoPageLink, name, nameDe, groupName, shortDescription, description, investmentRemarks, beginnerDefinition, proficientDefinition, expertDefinition, aliases, sortOrder, category, employeeCount, beginnerCount, proficientCount, expertCount, interestedCount, capability, isManagedSkill, children, parents, companyLinks, modified, creator, modifier, isMetaSkill, depth, isVisible);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkedSkill {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    infoPageLink: ").append(toIndentedString(infoPageLink)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameDe: ").append(toIndentedString(nameDe)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    investmentRemarks: ").append(toIndentedString(investmentRemarks)).append("\n");
        sb.append("    beginnerDefinition: ").append(toIndentedString(beginnerDefinition)).append("\n");
        sb.append("    proficientDefinition: ").append(toIndentedString(proficientDefinition)).append("\n");
        sb.append("    expertDefinition: ").append(toIndentedString(expertDefinition)).append("\n");
        sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
        sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    employeeCount: ").append(toIndentedString(employeeCount)).append("\n");
        sb.append("    beginnerCount: ").append(toIndentedString(beginnerCount)).append("\n");
        sb.append("    proficientCount: ").append(toIndentedString(proficientCount)).append("\n");
        sb.append("    expertCount: ").append(toIndentedString(expertCount)).append("\n");
        sb.append("    interestedCount: ").append(toIndentedString(interestedCount)).append("\n");
        sb.append("    capability: ").append(toIndentedString(capability)).append("\n");
        sb.append("    isManagedSkill: ").append(toIndentedString(isManagedSkill)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
        sb.append("    companyLinks: ").append(toIndentedString(companyLinks)).append("\n");
        sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
        sb.append("    isMetaSkill: ").append(toIndentedString(isMetaSkill)).append("\n");
        sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
        sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
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
