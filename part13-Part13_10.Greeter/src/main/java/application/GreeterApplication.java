package application;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application{
    
    @Override
    public void start(Stage window){
        
        
        Label nameLabel = new Label("Enter your name and start");
        TextField nameField = new TextField("");
        Button startButton = new Button("Start");
        GridPane layout = new GridPane();
        layout.add(nameLabel, 0, 0);
        layout.add(nameField,0,1);
        layout.add(startButton, 0, 2);
        
        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20,20,20,20));
        
        
        Scene first = new Scene(layout);
        
        Label greetingLabel = new Label("");
        
        BorderPane secondLayout = new BorderPane();
        secondLayout.setCenter(greetingLabel);
        Scene second = new Scene(secondLayout);
        secondLayout.setPrefSize(300,180);
        startButton.setOnAction((event) -> {
            String name = nameField.getText();
            greetingLabel.setText("Welcome " + name);
            window.setScene(second);
        });
        window.setMinHeight(400);
        window.setMinWidth(400);
        window.setScene(first);
        window.show();
        
    }
    

    public static void main(String[] args) {
        System.out.println("Hellow world! :3");
        launch(GreeterApplication.class);
    }
}
