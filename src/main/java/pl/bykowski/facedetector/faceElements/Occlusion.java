
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
    "foreheadOccluded",
    "eyeOccluded",
    "mouthOccluded"
})
public class Occlusion {

    @JsonProperty("foreheadOccluded")
    private boolean foreheadOccluded;
    @JsonProperty("eyeOccluded")
    private boolean eyeOccluded;
    @JsonProperty("mouthOccluded")
    private boolean mouthOccluded;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("foreheadOccluded")
    public boolean isForeheadOccluded() {
        return foreheadOccluded;
    }

    @JsonProperty("foreheadOccluded")
    public void setForeheadOccluded(boolean foreheadOccluded) {
        this.foreheadOccluded = foreheadOccluded;
    }

    @JsonProperty("eyeOccluded")
    public boolean isEyeOccluded() {
        return eyeOccluded;
    }

    @JsonProperty("eyeOccluded")
    public void setEyeOccluded(boolean eyeOccluded) {
        this.eyeOccluded = eyeOccluded;
    }

    @JsonProperty("mouthOccluded")
    public boolean isMouthOccluded() {
        return mouthOccluded;
    }

    @JsonProperty("mouthOccluded")
    public void setMouthOccluded(boolean mouthOccluded) {
        this.mouthOccluded = mouthOccluded;
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
