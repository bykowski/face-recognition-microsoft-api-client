
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
    "eyeMakeup",
    "lipMakeup"
})
public class Makeup {

    @JsonProperty("eyeMakeup")
    private boolean eyeMakeup;
    @JsonProperty("lipMakeup")
    private boolean lipMakeup;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("eyeMakeup")
    public boolean isEyeMakeup() {
        return eyeMakeup;
    }

    @JsonProperty("eyeMakeup")
    public void setEyeMakeup(boolean eyeMakeup) {
        this.eyeMakeup = eyeMakeup;
    }

    @JsonProperty("lipMakeup")
    public boolean isLipMakeup() {
        return lipMakeup;
    }

    @JsonProperty("lipMakeup")
    public void setLipMakeup(boolean lipMakeup) {
        this.lipMakeup = lipMakeup;
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
