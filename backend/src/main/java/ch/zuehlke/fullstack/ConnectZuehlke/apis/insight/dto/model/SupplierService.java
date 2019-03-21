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
 * SupplierService
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class SupplierService {

    @JsonProperty("Id")

    private Long id = null;

    @JsonProperty("Name")

    private String name = null;

    @JsonProperty("NameDe")

    private String nameDe = null;

    @JsonProperty("Aliases")

    private String aliases = null;

    public SupplierService id(Long id) {
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

    public SupplierService name(String name) {
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

    public SupplierService nameDe(String nameDe) {
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

    public SupplierService aliases(String aliases) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SupplierService supplierService = (SupplierService) o;
        return Objects.equals(this.id, supplierService.id) &&
                Objects.equals(this.name, supplierService.name) &&
                Objects.equals(this.nameDe, supplierService.nameDe) &&
                Objects.equals(this.aliases, supplierService.aliases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nameDe, aliases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupplierService {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameDe: ").append(toIndentedString(nameDe)).append("\n");
        sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
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
