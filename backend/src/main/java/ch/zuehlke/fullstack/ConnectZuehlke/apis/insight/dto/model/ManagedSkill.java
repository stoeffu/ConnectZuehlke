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
 * ManagedSkill
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class ManagedSkill {

    @JsonProperty("Trend")

    private Trend trend = null;

    @JsonProperty("Driver")

    private CapabilityDriver driver = null;

    @JsonProperty("Trainings")

    private List<Training> trainings = null;

    @JsonProperty("OfficeSummaries")

    private List<CapabilitySkillOfficeSummary> officeSummaries = null;

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

    public ManagedSkill trend(Trend trend) {
        this.trend = trend;
        return this;
    }


    /**
     * Get trend
     *
     * @return trend
     **/
    @Schema(description = "")
    public Trend getTrend() {
        return trend;
    }

    public void setTrend(Trend trend) {
        this.trend = trend;
    }

    public ManagedSkill driver(CapabilityDriver driver) {
        this.driver = driver;
        return this;
    }


    /**
     * Get driver
     *
     * @return driver
     **/
    @Schema(description = "")
    public CapabilityDriver getDriver() {
        return driver;
    }

    public void setDriver(CapabilityDriver driver) {
        this.driver = driver;
    }

    public ManagedSkill trainings(List<Training> trainings) {
        this.trainings = trainings;
        return this;
    }

    public ManagedSkill addTrainingsItem(Training trainingsItem) {
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

    public ManagedSkill officeSummaries(List<CapabilitySkillOfficeSummary> officeSummaries) {
        this.officeSummaries = officeSummaries;
        return this;
    }

    public ManagedSkill addOfficeSummariesItem(CapabilitySkillOfficeSummary officeSummariesItem) {
        if (this.officeSummaries == null) {
            this.officeSummaries = new ArrayList<CapabilitySkillOfficeSummary>();
        }
        this.officeSummaries.add(officeSummariesItem);
        return this;
    }

    /**
     * Get officeSummaries
     *
     * @return officeSummaries
     **/
    @Schema(description = "")
    public List<CapabilitySkillOfficeSummary> getOfficeSummaries() {
        return officeSummaries;
    }

    public void setOfficeSummaries(List<CapabilitySkillOfficeSummary> officeSummaries) {
        this.officeSummaries = officeSummaries;
    }

    public ManagedSkill id(Long id) {
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

    public ManagedSkill parentId(Long parentId) {
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

    public ManagedSkill infoPageLink(String infoPageLink) {
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

    public ManagedSkill name(String name) {
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

    public ManagedSkill nameDe(String nameDe) {
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

    public ManagedSkill groupName(String groupName) {
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

    public ManagedSkill shortDescription(String shortDescription) {
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

    public ManagedSkill description(String description) {
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

    public ManagedSkill investmentRemarks(String investmentRemarks) {
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

    public ManagedSkill beginnerDefinition(String beginnerDefinition) {
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

    public ManagedSkill proficientDefinition(String proficientDefinition) {
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

    public ManagedSkill expertDefinition(String expertDefinition) {
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

    public ManagedSkill aliases(String aliases) {
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

    public ManagedSkill sortOrder(Integer sortOrder) {
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

    public ManagedSkill category(SkillCategory category) {
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

    public ManagedSkill beginnerCount(Integer beginnerCount) {
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

    public ManagedSkill proficientCount(Integer proficientCount) {
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

    public ManagedSkill expertCount(Integer expertCount) {
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

    public ManagedSkill interestedCount(Integer interestedCount) {
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

    public ManagedSkill capability(Capability capability) {
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

    public ManagedSkill children(List<LinkedSkill> children) {
        this.children = children;
        return this;
    }

    public ManagedSkill addChildrenItem(LinkedSkill childrenItem) {
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

    public ManagedSkill parents(List<LinkedSkill> parents) {
        this.parents = parents;
        return this;
    }

    public ManagedSkill addParentsItem(LinkedSkill parentsItem) {
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

    public ManagedSkill companyLinks(List<SkillCompanyLink> companyLinks) {
        this.companyLinks = companyLinks;
        return this;
    }

    public ManagedSkill addCompanyLinksItem(SkillCompanyLink companyLinksItem) {
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

    public ManagedSkill modified(String modified) {
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

    public ManagedSkill creator(Employee creator) {
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

    public ManagedSkill modifier(Employee modifier) {
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

    public ManagedSkill isMetaSkill(Boolean isMetaSkill) {
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

    public ManagedSkill isVisible(Boolean isVisible) {
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
        ManagedSkill managedSkill = (ManagedSkill) o;
        return Objects.equals(this.trend, managedSkill.trend) &&
                Objects.equals(this.driver, managedSkill.driver) &&
                Objects.equals(this.trainings, managedSkill.trainings) &&
                Objects.equals(this.officeSummaries, managedSkill.officeSummaries) &&
                Objects.equals(this.id, managedSkill.id) &&
                Objects.equals(this.parentId, managedSkill.parentId) &&
                Objects.equals(this.infoPageLink, managedSkill.infoPageLink) &&
                Objects.equals(this.name, managedSkill.name) &&
                Objects.equals(this.nameDe, managedSkill.nameDe) &&
                Objects.equals(this.groupName, managedSkill.groupName) &&
                Objects.equals(this.shortDescription, managedSkill.shortDescription) &&
                Objects.equals(this.description, managedSkill.description) &&
                Objects.equals(this.investmentRemarks, managedSkill.investmentRemarks) &&
                Objects.equals(this.beginnerDefinition, managedSkill.beginnerDefinition) &&
                Objects.equals(this.proficientDefinition, managedSkill.proficientDefinition) &&
                Objects.equals(this.expertDefinition, managedSkill.expertDefinition) &&
                Objects.equals(this.aliases, managedSkill.aliases) &&
                Objects.equals(this.sortOrder, managedSkill.sortOrder) &&
                Objects.equals(this.category, managedSkill.category) &&
                Objects.equals(this.employeeCount, managedSkill.employeeCount) &&
                Objects.equals(this.beginnerCount, managedSkill.beginnerCount) &&
                Objects.equals(this.proficientCount, managedSkill.proficientCount) &&
                Objects.equals(this.expertCount, managedSkill.expertCount) &&
                Objects.equals(this.interestedCount, managedSkill.interestedCount) &&
                Objects.equals(this.capability, managedSkill.capability) &&
                Objects.equals(this.isManagedSkill, managedSkill.isManagedSkill) &&
                Objects.equals(this.children, managedSkill.children) &&
                Objects.equals(this.parents, managedSkill.parents) &&
                Objects.equals(this.companyLinks, managedSkill.companyLinks) &&
                Objects.equals(this.modified, managedSkill.modified) &&
                Objects.equals(this.creator, managedSkill.creator) &&
                Objects.equals(this.modifier, managedSkill.modifier) &&
                Objects.equals(this.isMetaSkill, managedSkill.isMetaSkill) &&
                Objects.equals(this.depth, managedSkill.depth) &&
                Objects.equals(this.isVisible, managedSkill.isVisible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trend, driver, trainings, officeSummaries, id, parentId, infoPageLink, name, nameDe, groupName, shortDescription, description, investmentRemarks, beginnerDefinition, proficientDefinition, expertDefinition, aliases, sortOrder, category, employeeCount, beginnerCount, proficientCount, expertCount, interestedCount, capability, isManagedSkill, children, parents, companyLinks, modified, creator, modifier, isMetaSkill, depth, isVisible);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ManagedSkill {\n");

        sb.append("    trend: ").append(toIndentedString(trend)).append("\n");
        sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
        sb.append("    trainings: ").append(toIndentedString(trainings)).append("\n");
        sb.append("    officeSummaries: ").append(toIndentedString(officeSummaries)).append("\n");
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
