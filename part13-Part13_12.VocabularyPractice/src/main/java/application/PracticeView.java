
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author dkazmierczak
 */
public class PracticeView {
    
    private Dictionary dictionary;
    private String word;

    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.word = dictionary.getRandomWord();
    }
    
    public Parent getView(){
        GridPane layout = new GridPane();
        
        Label instruction = new Label("Translate the word: " + this.word);
        TextField translation = new TextField();
        Button answered = new Button("Check!");
        Label answer = new Label("");
        
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        
        layout.add(instruction, 0, 0);
        layout.add(translation, 0, 1);
        layout.add(answered, 0, 2);
        layout.add(answer, 0, 3);
        
        answered.setOnMouseClicked((event) -> {
            String trans = translation.getText();
            
            if(this.dictionary.getTranslation(word).equals(trans)){
                answer.setText("Correct!");
            }else{
                answer.setText("Incorrect. The correct answer is: " + this.dictionary.getTranslation(word));
            }
            
            translation.clear();
            this.word = this.dictionary.getRandomWord();
            instruction.setText("Translate the word: " + this.word);
            
        });
        
        return layout;
    }
    
    
    
    
    
}
