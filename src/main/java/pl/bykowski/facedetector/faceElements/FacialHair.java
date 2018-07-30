
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
    "moustache",
    "beard",
    "sideburns"
})
public class FacialHair {

    @JsonProperty("moustache")
    private double moustache;
    @JsonProperty("beard")
    private double beard;
    @JsonProperty("sideburns")
    private double sideburns;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("moustache")
    public double getMoustache() {
        return moustache;
    }

    @JsonProperty("moustache")
    public void setMoustache(double moustache) {
        this.moustache = moustache;
    }

    @JsonProperty("beard")
    public double getBeard() {
        return beard;
    }

    @JsonProperty("beard")
    public void setBeard(double beard) {
        this.beard = beard;
    }

    @JsonProperty("sideburns")
    public double getSideburns() {
        return sideburns;
    }

    @JsonProperty("sideburns")
    public void setSideburns(double sideburns) {
        this.sideburns = sideburns;
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
