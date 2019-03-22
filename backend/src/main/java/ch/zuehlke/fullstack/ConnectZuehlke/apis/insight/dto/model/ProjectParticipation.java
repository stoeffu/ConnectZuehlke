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
 * ProjectParticipation
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class ProjectParticipation {

    @JsonProperty("LastModifiedCode")

    private String lastModifiedCode = null;

    @JsonProperty("LastModifiedDate")

    private String lastModifiedDate = null;

    @JsonProperty("Percentages")

    private List<Double> percentages = null;

    @JsonProperty("Percentage")

    private Double percentage = null;

    @JsonProperty("PercentageEffective")

    private Double percentageEffective = null;

    @JsonProperty("JobProfile")

    private JobProfile jobProfile = null;

    @JsonProperty("Days")

    private Double days = null;

    @JsonProperty("Title")

    private String title = null;

    @JsonProperty("Description")

    private String description = null;

    @JsonProperty("TitleDe")

    private String titleDe = null;

    @JsonProperty("DescriptionDe")

    private String descriptionDe = null;

    @JsonProperty("TitleResolved")

    private String titleResolved = null;

    @JsonProperty("DescriptionResolved")

    private String descriptionResolved = null;

    @JsonProperty("TasksResolved")

    private String tasksResolved = null;

    @JsonProperty("IsHidden")

    private Boolean isHidden = null;

    @JsonProperty("Priority")

    private Integer priority = null;

    @JsonProperty("Warnings")

    private String warnings = null;
    @JsonProperty("Status")

    private StatusEnum status = null;
    @JsonProperty("StatusText")

    private String statusText = null;
    @JsonProperty("Remarks")

    private String remarks = null;
    @JsonProperty("Function")

    private String function = null;
    @JsonProperty("Phase")

    private ProjectPhase phase = null;
    @JsonProperty("Links")

    private List<ProjectParticipation> links = null;
    @JsonProperty("Employee")

    private EmployeeResult employee = null;
    @JsonProperty("Project")

    private Project project = null;
    @JsonProperty("EmployeeProjectId")

    private Long employeeProjectId = null;
    @JsonProperty("HourlyRate")

    private Double hourlyRate = null;
    @JsonProperty("ImputedMargin")

    private Double imputedMargin = null;
    @JsonProperty("FromPlanned")

    private String fromPlanned = null;
    @JsonProperty("ToPlanned")

    private String toPlanned = null;
    @JsonProperty("FromEffective")

    private String fromEffective = null;
    @JsonProperty("ToEffective")

    private String toEffective = null;
    @JsonProperty("WorkingForCustomerSince")

    private String workingForCustomerSince = null;
    @JsonProperty("WorkingForCustomerSinceText")

    private String workingForCustomerSinceText = null;
    @JsonProperty("From")

    private String from = null;
    @JsonProperty("FromYear")

    private String fromYear = null;
    @JsonProperty("To")

    private String to = null;
    @JsonProperty("ToYear")

    private String toYear = null;
    @JsonProperty("DaysEffective")

    private Double daysEffective = null;
    @JsonProperty("TotalHoursEffective")

    private Double totalHoursEffective = null;
    @JsonProperty("Skills")

    private List<EmployeeSkill> skills = null;
    @JsonProperty("Descriptions")

    private List<ProjectDescription> descriptions = null;
    @JsonProperty("Id")

    private Long id = null;

    public ProjectParticipation lastModifiedCode(String lastModifiedCode) {
        this.lastModifiedCode = lastModifiedCode;
        return this;
    }

    /**
     * Get lastModifiedCode
     *
     * @return lastModifiedCode
     **/
    @Schema(description = "")
    public String getLastModifiedCode() {
        return lastModifiedCode;
    }

    public void setLastModifiedCode(String lastModifiedCode) {
        this.lastModifiedCode = lastModifiedCode;
    }

    public ProjectParticipation lastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * Get lastModifiedDate
     *
     * @return lastModifiedDate
     **/
    @Schema(description = "")
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public ProjectParticipation percentages(List<Double> percentages) {
        this.percentages = percentages;
        return this;
    }

    public ProjectParticipation addPercentagesItem(Double percentagesItem) {
        if (this.percentages == null) {
            this.percentages = new ArrayList<Double>();
        }
        this.percentages.add(percentagesItem);
        return this;
    }

    /**
     * Get percentages
     *
     * @return percentages
     **/
    @Schema(description = "")
    public List<Double> getPercentages() {
        return percentages;
    }

    public void setPercentages(List<Double> percentages) {
        this.percentages = percentages;
    }

    public ProjectParticipation percentage(Double percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * Get percentage
     *
     * @return percentage
     **/
    @Schema(description = "")
    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public ProjectParticipation percentageEffective(Double percentageEffective) {
        this.percentageEffective = percentageEffective;
        return this;
    }

    /**
     * Get percentageEffective
     *
     * @return percentageEffective
     **/
    @Schema(description = "")
    public Double getPercentageEffective() {
        return percentageEffective;
    }

    public void setPercentageEffective(Double percentageEffective) {
        this.percentageEffective = percentageEffective;
    }

    public ProjectParticipation jobProfile(JobProfile jobProfile) {
        this.jobProfile = jobProfile;
        return this;
    }

    /**
     * Get jobProfile
     *
     * @return jobProfile
     **/
    @Schema(description = "")
    public JobProfile getJobProfile() {
        return jobProfile;
    }

    public void setJobProfile(JobProfile jobProfile) {
        this.jobProfile = jobProfile;
    }

    public ProjectParticipation days(Double days) {
        this.days = days;
        return this;
    }

    /**
     * Get days
     *
     * @return days
     **/
    @Schema(description = "")
    public Double getDays() {
        return days;
    }

    public void setDays(Double days) {
        this.days = days;
    }

    public ProjectParticipation title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     *
     * @return title
     **/
    @Schema(description = "")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ProjectParticipation description(String description) {
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

    public ProjectParticipation titleDe(String titleDe) {
        this.titleDe = titleDe;
        return this;
    }

    /**
     * Get titleDe
     *
     * @return titleDe
     **/
    @Schema(description = "")
    public String getTitleDe() {
        return titleDe;
    }

    public void setTitleDe(String titleDe) {
        this.titleDe = titleDe;
    }

    public ProjectParticipation descriptionDe(String descriptionDe) {
        this.descriptionDe = descriptionDe;
        return this;
    }

    /**
     * Get descriptionDe
     *
     * @return descriptionDe
     **/
    @Schema(description = "")
    public String getDescriptionDe() {
        return descriptionDe;
    }

    public void setDescriptionDe(String descriptionDe) {
        this.descriptionDe = descriptionDe;
    }

    /**
     * Get titleResolved
     *
     * @return titleResolved
     **/
    @Schema(description = "")
    public String getTitleResolved() {
        return titleResolved;
    }

    /**
     * Get descriptionResolved
     *
     * @return descriptionResolved
     **/
    @Schema(description = "")
    public String getDescriptionResolved() {
        return descriptionResolved;
    }

    /**
     * Get tasksResolved
     *
     * @return tasksResolved
     **/
    @Schema(description = "")
    public String getTasksResolved() {
        return tasksResolved;
    }

    public ProjectParticipation isHidden(Boolean isHidden) {
        this.isHidden = isHidden;
        return this;
    }

    /**
     * Get isHidden
     *
     * @return isHidden
     **/
    @Schema(description = "")
    public Boolean isIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    public ProjectParticipation priority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get priority
     *
     * @return priority
     **/
    @Schema(description = "")
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public ProjectParticipation warnings(String warnings) {
        this.warnings = warnings;
        return this;
    }

    /**
     * Get warnings
     *
     * @return warnings
     **/
    @Schema(description = "")
    public String getWarnings() {
        return warnings;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    public ProjectParticipation status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @Schema(description = "")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * Get statusText
     *
     * @return statusText
     **/
    @Schema(description = "")
    public String getStatusText() {
        return statusText;
    }

    public ProjectParticipation remarks(String remarks) {
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

    public ProjectParticipation function(String function) {
        this.function = function;
        return this;
    }

    /**
     * Get function
     *
     * @return function
     **/
    @Schema(description = "")
    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public ProjectParticipation phase(ProjectPhase phase) {
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

    public ProjectParticipation links(List<ProjectParticipation> links) {
        this.links = links;
        return this;
    }

    public ProjectParticipation addLinksItem(ProjectParticipation linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<ProjectParticipation>();
        }
        this.links.add(linksItem);
        return this;
    }

    /**
     * Get links
     *
     * @return links
     **/
    @Schema(description = "")
    public List<ProjectParticipation> getLinks() {
        return links;
    }

    public void setLinks(List<ProjectParticipation> links) {
        this.links = links;
    }

    public ProjectParticipation employee(EmployeeResult employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Get employee
     *
     * @return employee
     **/
    @Schema(description = "")
    public EmployeeResult getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeResult employee) {
        this.employee = employee;
    }

    public ProjectParticipation project(Project project) {
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

    public ProjectParticipation employeeProjectId(Long employeeProjectId) {
        this.employeeProjectId = employeeProjectId;
        return this;
    }

    /**
     * Get employeeProjectId
     *
     * @return employeeProjectId
     **/
    @Schema(description = "")
    public Long getEmployeeProjectId() {
        return employeeProjectId;
    }

    public void setEmployeeProjectId(Long employeeProjectId) {
        this.employeeProjectId = employeeProjectId;
    }

    public ProjectParticipation hourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
        return this;
    }

    /**
     * Get hourlyRate
     *
     * @return hourlyRate
     **/
    @Schema(description = "")
    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * Get imputedMargin
     *
     * @return imputedMargin
     **/
    @Schema(description = "")
    public Double getImputedMargin() {
        return imputedMargin;
    }

    public ProjectParticipation fromPlanned(String fromPlanned) {
        this.fromPlanned = fromPlanned;
        return this;
    }

    /**
     * Get fromPlanned
     *
     * @return fromPlanned
     **/
    @Schema(description = "")
    public String getFromPlanned() {
        return fromPlanned;
    }

    public void setFromPlanned(String fromPlanned) {
        this.fromPlanned = fromPlanned;
    }

    public ProjectParticipation toPlanned(String toPlanned) {
        this.toPlanned = toPlanned;
        return this;
    }

    /**
     * Get toPlanned
     *
     * @return toPlanned
     **/
    @Schema(description = "")
    public String getToPlanned() {
        return toPlanned;
    }

    public void setToPlanned(String toPlanned) {
        this.toPlanned = toPlanned;
    }

    public ProjectParticipation fromEffective(String fromEffective) {
        this.fromEffective = fromEffective;
        return this;
    }

    /**
     * Get fromEffective
     *
     * @return fromEffective
     **/
    @Schema(description = "")
    public String getFromEffective() {
        return fromEffective;
    }

    public void setFromEffective(String fromEffective) {
        this.fromEffective = fromEffective;
    }

    public ProjectParticipation toEffective(String toEffective) {
        this.toEffective = toEffective;
        return this;
    }

    /**
     * Get toEffective
     *
     * @return toEffective
     **/
    @Schema(description = "")
    public String getToEffective() {
        return toEffective;
    }

    public void setToEffective(String toEffective) {
        this.toEffective = toEffective;
    }

    public ProjectParticipation workingForCustomerSince(String workingForCustomerSince) {
        this.workingForCustomerSince = workingForCustomerSince;
        return this;
    }

    /**
     * Get workingForCustomerSince
     *
     * @return workingForCustomerSince
     **/
    @Schema(description = "")
    public String getWorkingForCustomerSince() {
        return workingForCustomerSince;
    }

    public void setWorkingForCustomerSince(String workingForCustomerSince) {
        this.workingForCustomerSince = workingForCustomerSince;
    }

    /**
     * Get workingForCustomerSinceText
     *
     * @return workingForCustomerSinceText
     **/
    @Schema(description = "")
    public String getWorkingForCustomerSinceText() {
        return workingForCustomerSinceText;
    }

    /**
     * Get from
     *
     * @return from
     **/
    @Schema(description = "")
    public String getFrom() {
        return from;
    }

    /**
     * Get fromYear
     *
     * @return fromYear
     **/
    @Schema(description = "")
    public String getFromYear() {
        return fromYear;
    }

    /**
     * Get to
     *
     * @return to
     **/
    @Schema(description = "")
    public String getTo() {
        return to;
    }

    /**
     * Get toYear
     *
     * @return toYear
     **/
    @Schema(description = "")
    public String getToYear() {
        return toYear;
    }

    /**
     * Get daysEffective
     *
     * @return daysEffective
     **/
    @Schema(description = "")
    public Double getDaysEffective() {
        return daysEffective;
    }

    public ProjectParticipation totalHoursEffective(Double totalHoursEffective) {
        this.totalHoursEffective = totalHoursEffective;
        return this;
    }

    /**
     * Get totalHoursEffective
     *
     * @return totalHoursEffective
     **/
    @Schema(description = "")
    public Double getTotalHoursEffective() {
        return totalHoursEffective;
    }

    public void setTotalHoursEffective(Double totalHoursEffective) {
        this.totalHoursEffective = totalHoursEffective;
    }

    public ProjectParticipation skills(List<EmployeeSkill> skills) {
        this.skills = skills;
        return this;
    }

    public ProjectParticipation addSkillsItem(EmployeeSkill skillsItem) {
        if (this.skills == null) {
            this.skills = new ArrayList<EmployeeSkill>();
        }
        this.skills.add(skillsItem);
        return this;
    }

    /**
     * Get skills
     *
     * @return skills
     **/
    @Schema(description = "")
    public List<EmployeeSkill> getSkills() {
        return skills;
    }

    public void setSkills(List<EmployeeSkill> skills) {
        this.skills = skills;
    }

    public ProjectParticipation descriptions(List<ProjectDescription> descriptions) {
        this.descriptions = descriptions;
        return this;
    }

    public ProjectParticipation addDescriptionsItem(ProjectDescription descriptionsItem) {
        if (this.descriptions == null) {
            this.descriptions = new ArrayList<ProjectDescription>();
        }
        this.descriptions.add(descriptionsItem);
        return this;
    }

    /**
     * Get descriptions
     *
     * @return descriptions
     **/
    @Schema(description = "")
    public List<ProjectDescription> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<ProjectDescription> descriptions) {
        this.descriptions = descriptions;
    }

    public ProjectParticipation id(Long id) {
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
        ProjectParticipation projectParticipation = (ProjectParticipation) o;
        return Objects.equals(this.lastModifiedCode, projectParticipation.lastModifiedCode) &&
                Objects.equals(this.lastModifiedDate, projectParticipation.lastModifiedDate) &&
                Objects.equals(this.percentages, projectParticipation.percentages) &&
                Objects.equals(this.percentage, projectParticipation.percentage) &&
                Objects.equals(this.percentageEffective, projectParticipation.percentageEffective) &&
                Objects.equals(this.jobProfile, projectParticipation.jobProfile) &&
                Objects.equals(this.days, projectParticipation.days) &&
                Objects.equals(this.title, projectParticipation.title) &&
                Objects.equals(this.description, projectParticipation.description) &&
                Objects.equals(this.titleDe, projectParticipation.titleDe) &&
                Objects.equals(this.descriptionDe, projectParticipation.descriptionDe) &&
                Objects.equals(this.titleResolved, projectParticipation.titleResolved) &&
                Objects.equals(this.descriptionResolved, projectParticipation.descriptionResolved) &&
                Objects.equals(this.tasksResolved, projectParticipation.tasksResolved) &&
                Objects.equals(this.isHidden, projectParticipation.isHidden) &&
                Objects.equals(this.priority, projectParticipation.priority) &&
                Objects.equals(this.warnings, projectParticipation.warnings) &&
                Objects.equals(this.status, projectParticipation.status) &&
                Objects.equals(this.statusText, projectParticipation.statusText) &&
                Objects.equals(this.remarks, projectParticipation.remarks) &&
                Objects.equals(this.function, projectParticipation.function) &&
                Objects.equals(this.phase, projectParticipation.phase) &&
                Objects.equals(this.links, projectParticipation.links) &&
                Objects.equals(this.employee, projectParticipation.employee) &&
                Objects.equals(this.project, projectParticipation.project) &&
                Objects.equals(this.employeeProjectId, projectParticipation.employeeProjectId) &&
                Objects.equals(this.hourlyRate, projectParticipation.hourlyRate) &&
                Objects.equals(this.imputedMargin, projectParticipation.imputedMargin) &&
                Objects.equals(this.fromPlanned, projectParticipation.fromPlanned) &&
                Objects.equals(this.toPlanned, projectParticipation.toPlanned) &&
                Objects.equals(this.fromEffective, projectParticipation.fromEffective) &&
                Objects.equals(this.toEffective, projectParticipation.toEffective) &&
                Objects.equals(this.workingForCustomerSince, projectParticipation.workingForCustomerSince) &&
                Objects.equals(this.workingForCustomerSinceText, projectParticipation.workingForCustomerSinceText) &&
                Objects.equals(this.from, projectParticipation.from) &&
                Objects.equals(this.fromYear, projectParticipation.fromYear) &&
                Objects.equals(this.to, projectParticipation.to) &&
                Objects.equals(this.toYear, projectParticipation.toYear) &&
                Objects.equals(this.daysEffective, projectParticipation.daysEffective) &&
                Objects.equals(this.totalHoursEffective, projectParticipation.totalHoursEffective) &&
                Objects.equals(this.skills, projectParticipation.skills) &&
                Objects.equals(this.descriptions, projectParticipation.descriptions) &&
                Objects.equals(this.id, projectParticipation.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastModifiedCode, lastModifiedDate, percentages, percentage, percentageEffective, jobProfile, days, title, description, titleDe, descriptionDe, titleResolved, descriptionResolved, tasksResolved, isHidden, priority, warnings, status, statusText, remarks, function, phase, links, employee, project, employeeProjectId, hourlyRate, imputedMargin, fromPlanned, toPlanned, fromEffective, toEffective, workingForCustomerSince, workingForCustomerSinceText, from, fromYear, to, toYear, daysEffective, totalHoursEffective, skills, descriptions, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectParticipation {\n");

        sb.append("    lastModifiedCode: ").append(toIndentedString(lastModifiedCode)).append("\n");
        sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
        sb.append("    percentages: ").append(toIndentedString(percentages)).append("\n");
        sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
        sb.append("    percentageEffective: ").append(toIndentedString(percentageEffective)).append("\n");
        sb.append("    jobProfile: ").append(toIndentedString(jobProfile)).append("\n");
        sb.append("    days: ").append(toIndentedString(days)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    titleDe: ").append(toIndentedString(titleDe)).append("\n");
        sb.append("    descriptionDe: ").append(toIndentedString(descriptionDe)).append("\n");
        sb.append("    titleResolved: ").append(toIndentedString(titleResolved)).append("\n");
        sb.append("    descriptionResolved: ").append(toIndentedString(descriptionResolved)).append("\n");
        sb.append("    tasksResolved: ").append(toIndentedString(tasksResolved)).append("\n");
        sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
        sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    employeeProjectId: ").append(toIndentedString(employeeProjectId)).append("\n");
        sb.append("    hourlyRate: ").append(toIndentedString(hourlyRate)).append("\n");
        sb.append("    imputedMargin: ").append(toIndentedString(imputedMargin)).append("\n");
        sb.append("    fromPlanned: ").append(toIndentedString(fromPlanned)).append("\n");
        sb.append("    toPlanned: ").append(toIndentedString(toPlanned)).append("\n");
        sb.append("    fromEffective: ").append(toIndentedString(fromEffective)).append("\n");
        sb.append("    toEffective: ").append(toIndentedString(toEffective)).append("\n");
        sb.append("    workingForCustomerSince: ").append(toIndentedString(workingForCustomerSince)).append("\n");
        sb.append("    workingForCustomerSinceText: ").append(toIndentedString(workingForCustomerSinceText)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    fromYear: ").append(toIndentedString(fromYear)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    toYear: ").append(toIndentedString(toYear)).append("\n");
        sb.append("    daysEffective: ").append(toIndentedString(daysEffective)).append("\n");
        sb.append("    totalHoursEffective: ").append(toIndentedString(totalHoursEffective)).append("\n");
        sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
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
     * Gets or Sets status
     */
    public enum StatusEnum {
        NUMBER_0(0),
        NUMBER_1(1),
        NUMBER_2(2);

        private Integer value;

        StatusEnum(Integer value) {
            this.value = value;
        }

        @JsonCreator
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
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
