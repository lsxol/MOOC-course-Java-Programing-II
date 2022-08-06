package buttonandlabel;

import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndLabelApplication extends Application {
    
    @Override
    public void start(Stage window) {
        
        Button button = new Button("Button");
        Label label = new Label("Hello");
        FlowPane group = new FlowPane();
        
        group.getChildren().add(button);
        group.getChildren().add(label);
        Scene scene = new Scene(group);
        
        window.setScene(scene);
        window.show();
    }
    
    

    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

}
