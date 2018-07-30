
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
    "pitch",
    "roll",
    "yaw"
})
public class HeadPose {

    @JsonProperty("pitch")
    private int pitch;
    @JsonProperty("roll")
    private double roll;
    @JsonProperty("yaw")
    private double yaw;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pitch")
    public int getPitch() {
        return pitch;
    }

    @JsonProperty("pitch")
    public void setPitch(int pitch) {
        this.pitch = pitch;
    }

    @JsonProperty("roll")
    public double getRoll() {
        return roll;
    }

    @JsonProperty("roll")
    public void setRoll(double roll) {
        this.roll = roll;
    }

    @JsonProperty("yaw")
    public double getYaw() {
        return yaw;
    }

    @JsonProperty("yaw")
    public void setYaw(double yaw) {
        this.yaw = yaw;
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
