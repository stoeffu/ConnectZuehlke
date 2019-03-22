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
 * MarketingMaterial
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class MarketingMaterial {
    @JsonProperty("MarketingMaterialType")

    private MarketingMaterialTypeEnum marketingMaterialType = null;
    @JsonProperty("PictureId")

    private Long pictureId = null;
    @JsonProperty("MarketingMaterialTypeText")

    private String marketingMaterialTypeText = null;
    @JsonProperty("Id")

    private Long id = null;
    @JsonProperty("Url")

    private String url = null;
    @JsonProperty("Name")

    private String name = null;
    @JsonProperty("Type")

    private TypeEnum type = null;
    @JsonProperty("TypeText")

    private String typeText = null;
    @JsonProperty("Extension")

    private String extension = null;

    public MarketingMaterial marketingMaterialType(MarketingMaterialTypeEnum marketingMaterialType) {
        this.marketingMaterialType = marketingMaterialType;
        return this;
    }

    /**
     * Get marketingMaterialType
     *
     * @return marketingMaterialType
     **/
    @Schema(description = "")
    public MarketingMaterialTypeEnum getMarketingMaterialType() {
        return marketingMaterialType;
    }

    public void setMarketingMaterialType(MarketingMaterialTypeEnum marketingMaterialType) {
        this.marketingMaterialType = marketingMaterialType;
    }

    public MarketingMaterial pictureId(Long pictureId) {
        this.pictureId = pictureId;
        return this;
    }

    /**
     * Get pictureId
     *
     * @return pictureId
     **/
    @Schema(description = "")
    public Long getPictureId() {
        return pictureId;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }

    /**
     * Get marketingMaterialTypeText
     *
     * @return marketingMaterialTypeText
     **/
    @Schema(description = "")
    public String getMarketingMaterialTypeText() {
        return marketingMaterialTypeText;
    }

    public MarketingMaterial id(Long id) {
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

    public MarketingMaterial url(String url) {
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

    public MarketingMaterial name(String name) {
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

    public MarketingMaterial type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @Schema(description = "")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Get typeText
     *
     * @return typeText
     **/
    @Schema(description = "")
    public String getTypeText() {
        return typeText;
    }

    /**
     * Get extension
     *
     * @return extension
     **/
    @Schema(description = "")
    public String getExtension() {
        return extension;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MarketingMaterial marketingMaterial = (MarketingMaterial) o;
        return Objects.equals(this.marketingMaterialType, marketingMaterial.marketingMaterialType) &&
                Objects.equals(this.pictureId, marketingMaterial.pictureId) &&
                Objects.equals(this.marketingMaterialTypeText, marketingMaterial.marketingMaterialTypeText) &&
                Objects.equals(this.id, marketingMaterial.id) &&
                Objects.equals(this.url, marketingMaterial.url) &&
                Objects.equals(this.name, marketingMaterial.name) &&
                Objects.equals(this.type, marketingMaterial.type) &&
                Objects.equals(this.typeText, marketingMaterial.typeText) &&
                Objects.equals(this.extension, marketingMaterial.extension);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketingMaterialType, pictureId, marketingMaterialTypeText, id, url, name, type, typeText, extension);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarketingMaterial {\n");

        sb.append("    marketingMaterialType: ").append(toIndentedString(marketingMaterialType)).append("\n");
        sb.append("    pictureId: ").append(toIndentedString(pictureId)).append("\n");
        sb.append("    marketingMaterialTypeText: ").append(toIndentedString(marketingMaterialTypeText)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeText: ").append(toIndentedString(typeText)).append("\n");
        sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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
     * Gets or Sets marketingMaterialType
     */
    public enum MarketingMaterialTypeEnum {
        NUMBER_0(0),
        NUMBER_1(1),
        NUMBER_2(2),
        NUMBER_3(3);

        private Integer value;

        MarketingMaterialTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonCreator
        public static MarketingMaterialTypeEnum fromValue(String text) {
            for (MarketingMaterialTypeEnum b : MarketingMaterialTypeEnum.values()) {
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

    /**
     * Gets or Sets type
     */
    public enum TypeEnum {
        NUMBER_0(0),
        NUMBER_1(1),
        NUMBER_2(2),
        NUMBER_3(3),
        NUMBER_4(4),
        NUMBER_5(5),
        NUMBER_6(6),
        NUMBER_7(7),
        NUMBER_8(8),
        NUMBER_9(9),
        NUMBER_10(10),
        NUMBER_11(11),
        NUMBER_12(12);

        private Integer value;

        TypeEnum(Integer value) {
            this.value = value;
        }

        @JsonCreator
        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
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