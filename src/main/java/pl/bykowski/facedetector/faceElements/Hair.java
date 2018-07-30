
package pl.bykowski.facedetector.faceElements;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bald",
    "invisible",
    "hairColor"
})
public class Hair {

    @JsonProperty("bald")
    private double bald;
    @JsonProperty("invisible")
    private boolean invisible;
    @JsonProperty("hairColor")
    private List<HairColor> hairColor = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("bald")
    public double getBald() {
        return bald;
    }

    @JsonProperty("bald")
    public void setBald(double bald) {
        this.bald = bald;
    }

    @JsonProperty("invisible")
    public boolean isInvisible() {
        return invisible;
    }

    @JsonProperty("invisible")
    public void setInvisible(boolean invisible) {
        this.invisible = invisible;
    }

    @JsonProperty("hairColor")
    public List<HairColor> getHairColor() {
        return hairColor;
    }

    @JsonProperty("hairColor")
    public void setHairColor(List<HairColor> hairColor) {
        this.hairColor = hairColor;
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
