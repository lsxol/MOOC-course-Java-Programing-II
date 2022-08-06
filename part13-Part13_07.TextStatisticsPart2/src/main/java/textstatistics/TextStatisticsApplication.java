package textstatistics;

import java.util.Arrays;
import javafx.scene.control.TextArea;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application {
    
    @Override
    public void start(Stage window){
        BorderPane layout = new BorderPane();
        
        TextArea text = new TextArea("");
        HBox labels = new HBox();
        labels.setSpacing(10);
        Label character = new Label("Letters: 0");
        Label word = new Label("Words: 0");
        Label longe = new Label("The longest word is: ");
        
        text.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            
            String longest = Arrays.stream(parts)
                    .sorted((s1,s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            
            character.setText("Letters: " + characters);
            word.setText("Words: " + words);
            longe.setText("The longest word is: " + longest);
            
        });
        
        labels.getChildren().add(character);
        labels.getChildren().add(word);
        labels.getChildren().add(longe); 
        
        layout.setBottom(labels);
        layout.setCenter(text);
        
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }


    
    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}