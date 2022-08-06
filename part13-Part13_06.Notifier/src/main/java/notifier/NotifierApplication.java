package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application {
    
    @Override
    public void start(Stage window){
        TextField text = new TextField();
        Label copied = new Label();
        Button button = new Button("Update");
        button.setOnAction((event)-> {
            copied.setText(text.getText());
        });
        VBox vBox = new VBox();
        vBox.setSpacing(5);
        vBox.getChildren().addAll(text,button,copied);
        
        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();
        
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
