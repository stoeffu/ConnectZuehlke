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
 * TaskView
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class TaskView {

    @JsonProperty("Id")

    private Long id = null;

    @JsonProperty("Name")

    private String name = null;

    @JsonProperty("Code")

    private String code = null;

    @JsonProperty("Scope")

    private String scope = null;

    @JsonProperty("Url")

    private String url = null;

    public TaskView id(Long id) {
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

    public TaskView name(String name) {
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

    public TaskView code(String code) {
        this.code = code;
        return this;
    }


    /**
     * Get code
     *
     * @return code
     **/
    @Schema(description = "")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public TaskView scope(String scope) {
        this.scope = scope;
        return this;
    }


    /**
     * Get scope
     *
     * @return scope
     **/
    @Schema(description = "")
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public TaskView url(String url) {
        this.url = url;
        return this;
    }


    /**
     * Get url
     *
     * @return url
     **/
    @Schema(description = "")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskView taskView = (TaskView) o;
        return Objects.equals(this.id, taskView.id) &&
                Objects.equals(this.name, taskView.name) &&
                Objects.equals(this.code, taskView.code) &&
                Objects.equals(this.scope, taskView.scope) &&
                Objects.equals(this.url, taskView.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, code, scope, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskView {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
