
package pl.bykowski.facedetector.faceElements;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "faceId",
    "faceRectangle",
    "faceAttributes"
})
public class Result {

    @JsonProperty("faceId")
    private String faceId;
    @JsonProperty("faceRectangle")
    private FaceRectangle faceRectangle;
    @JsonProperty("faceAttributes")
    private FaceAttributes faceAttributes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("faceId")
    public String getFaceId() {
        return faceId;
    }

    @JsonProperty("faceId")
    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    @JsonProperty("faceRectangle")
    public FaceRectangle getFaceRectangle() {
        return faceRectangle;
    }

    @JsonProperty("faceRectangle")
    public void setFaceRectangle(FaceRectangle faceRectangle) {
        this.faceRectangle = faceRectangle;
    }

    @JsonProperty("faceAttributes")
    public FaceAttributes getFaceAttributes() {
        return faceAttributes;
    }

    @JsonProperty("faceAttributes")
    public void setFaceAttributes(FaceAttributes faceAttributes) {
        this.faceAttributes = faceAttributes;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
