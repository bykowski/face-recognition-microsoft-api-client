package pl.bykowski.facedetector;

import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import pl.bykowski.facedetector.faceElements.Result;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class FaceApi {

    @Value("${subscriptionKey}")
    private String subscriptionKey;

    protected Result[] getFaceInfo(String imageUrl) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Result[]> exchange = null;
        try {
            exchange = restTemplate.exchange(
                    getURI(),
                    HttpMethod.POST,
                    getEntity(imageUrl),
                    Result[].class);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return exchange.getBody();
    }

    private URI getURI() throws URISyntaxException {
        String uriBase = "https://westcentralus.api.cognitive.microsoft.com/face/v1.0/detect";
        String faceAttributes = "age,gender,headPose,smile,facialHair,glasses,emotion,hair,makeup,occlusion,accessories,blur,exposure,noise";
        URIBuilder builder = new URIBuilder(uriBase);
        builder.setParameter("returnFaceId", "true");
        builder.setParameter("returnFaceLandmarks", "false");
        builder.setParameter("returnFaceAttributes", faceAttributes);
        return builder.build();
    }

    public HttpEntity getEntity(String imageUrl) {
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.add("Content-Type", "application/json");
        headers.add("Ocp-Apim-Subscription-Key", subscriptionKey);
        String imageWithFaces = "{\"url\":\"" + imageUrl + "\"}";
        HttpEntity<String> httpEntity = new HttpEntity<>(imageWithFaces, headers);
        return httpEntity;
    }
}
