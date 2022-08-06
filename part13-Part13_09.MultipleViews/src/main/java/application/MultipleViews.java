package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {
    
    @Override
    public void start(Stage window){
        BorderPane first = new BorderPane();
        VBox second = new VBox();
        GridPane third = new GridPane();
        
        first.setTop(new Label("First view!"));
        Button firstButton = new Button("To the second view!");
        first.setCenter(firstButton);
        
        Button secondButton = new Button("To the third view!");
        Label secondLabel = new Label("Second view");
        second.getChildren().addAll(secondButton,secondLabel);
        
        Button thirdButton = new Button("To the first view!");
        third.add(new Label("Third view!"), 0, 0);
        third.add(thirdButton, 1, 1);
        
        
        Scene firstScene = new Scene(first);
        Scene secondScene = new Scene(second);
        Scene thirdScene = new Scene(third);
        
        
        
       
        firstButton.setOnAction((event) -> {
            window.setScene(secondScene);
        });
        secondButton.setOnAction((event)->{
            window.setScene(thirdScene);
        });
        thirdButton.setOnAction((event) ->{
            window.setScene(firstScene);
        });
        
        window.setScene(firstScene);
        window.show();
        
        
    }

    
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(MultipleViews.class);
    }

}
