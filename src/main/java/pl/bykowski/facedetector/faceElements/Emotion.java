
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
    "anger",
    "contempt",
    "disgust",
    "fear",
    "happiness",
    "neutral",
    "sadness",
    "surprise"
})
public class Emotion {

    @JsonProperty("anger")
    private int anger;
    @JsonProperty("contempt")
    private int contempt;
    @JsonProperty("disgust")
    private int disgust;
    @JsonProperty("fear")
    private int fear;
    @JsonProperty("happiness")
    private double happiness;
    @JsonProperty("neutral")
    private double neutral;
    @JsonProperty("sadness")
    private int sadness;
    @JsonProperty("surprise")
    private int surprise;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("anger")
    public int getAnger() {
        return anger;
    }

    @JsonProperty("anger")
    public void setAnger(int anger) {
        this.anger = anger;
    }

    @JsonProperty("contempt")
    public int getContempt() {
        return contempt;
    }

    @JsonProperty("contempt")
    public void setContempt(int contempt) {
        this.contempt = contempt;
    }

    @JsonProperty("disgust")
    public int getDisgust() {
        return disgust;
    }

    @JsonProperty("disgust")
    public void setDisgust(int disgust) {
        this.disgust = disgust;
    }

    @JsonProperty("fear")
    public int getFear() {
        return fear;
    }

    @JsonProperty("fear")
    public void setFear(int fear) {
        this.fear = fear;
    }

    @JsonProperty("happiness")
    public double getHappiness() {
        return happiness;
    }

    @JsonProperty("happiness")
    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }

    @JsonProperty("neutral")
    public double getNeutral() {
        return neutral;
    }

    @JsonProperty("neutral")
    public void setNeutral(double neutral) {
        this.neutral = neutral;
    }

    @JsonProperty("sadness")
    public int getSadness() {
        return sadness;
    }

    @JsonProperty("sadness")
    public void setSadness(int sadness) {
        this.sadness = sadness;
    }

    @JsonProperty("surprise")
    public int getSurprise() {
        return surprise;
    }

    @JsonProperty("surprise")
    public void setSurprise(int surprise) {
        this.surprise = surprise;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


    @Override
    public String toString() {
        return "Emotion{" +
                "anger=" + anger +
                ", contempt=" + contempt +
                ", disgust=" + disgust +
                ", fear=" + fear +
                ", happiness=" + happiness +
                ", neutral=" + neutral +
                ", sadness=" + sadness +
                ", surprise=" + surprise +
                '}';
    }
}
