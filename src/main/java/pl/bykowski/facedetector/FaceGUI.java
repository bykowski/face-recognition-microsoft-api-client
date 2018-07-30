package pl.bykowski.facedetector;

import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.components.grid.HeaderRow;
import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import pl.bykowski.facedetector.faceElements.Result;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;

@SpringUI
public class FaceGUI extends UI {

    private FaceApi faceApi;

    public FaceGUI(FaceApi faceApi) {
        this.faceApi = faceApi;
    }

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        VerticalLayout components = new VerticalLayout();
        TextField textFieldImageUrl = new TextField();
        Image image = new Image();
        Grid<Result> grid = new Grid<>();

        grid.addColumn(r -> r.getFaceAttributes().getAge()).setId("Age").setCaption("Age");
        grid.addColumn(r -> r.getFaceAttributes().getHair().getHairColor().stream().findFirst().get().getColor()).setId("Hair").setCaption("Hair");
        grid.addColumn(r -> r.getFaceAttributes().getEmotion()).setId("getEmotion").setCaption("getEmotion");
        grid.addColumn(r -> r.getFaceAttributes().getGender()).setId("getGender").setCaption("getGender");
        grid.addColumn(r -> r.getFaceAttributes().getMakeup().isEyeMakeup()).setId("isEyeMakeup").setCaption("isEyeMakeup");
        grid.addColumn(r -> r.getFaceAttributes().getMakeup().isLipMakeup()).setId("isLipMakeup").setCaption("isLipMakeup");
        grid.addColumn(r -> r.getFaceAttributes().getGlasses()).setId("getGlasses").setCaption("getGlasses");
        grid.setSizeFull();

        Button button = new Button("Show info about photo!");
        button.addClickListener(clickEvent -> {
            image.setSource(new ExternalResource(textFieldImageUrl.getValue()));
            image.setWidth(200, Unit.PIXELS);
            Result[] faceInfo = faceApi.getFaceInfo(textFieldImageUrl.getValue());
            ListDataProvider<Result> dataProvider = new ListDataProvider<Result>(Arrays.asList(faceInfo));
            grid.setDataProvider(dataProvider);
            components.addComponent(image);
            components.addComponent(grid);
        });
        components.addComponent(textFieldImageUrl);
        components.addComponent(button);
        setContent(components);
    }
}
