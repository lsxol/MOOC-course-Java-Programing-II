
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
public class AddingView {
    
    private Dictionary dictionary;

    public AddingView(Dictionary dictionary) {
        this.dictionary = dictionary;
    }
    
    public Parent getView(){
        
        GridPane layout = new GridPane();
        
        Label wordInstruction = new Label("Give a word");
        TextField wordField = new TextField();
        Label transInstruction = new Label("Give a translation");
        TextField transField = new TextField();
        Button add = new Button("Add to dictionary");
        
        layout.setAlignment(Pos.CENTER);
        layout.setHgap(10);
        layout.setVgap(10);
        layout.setPadding(new Insets(10,10,10,10));
        
        layout.add(wordInstruction, 0, 0);
        layout.add(wordField, 2, 0);
        layout.add(transInstruction, 0, 1);
        layout.add(transField, 2, 1);
        layout.add(add, 1, 2);
        
        add.setOnMouseClicked((event) -> {
            String word = wordField.getText();
            String trans = transField.getText();
            
            dictionary.addWord(word, trans);
            
            wordField.clear();
            transField.clear();
            
        
        });
        
        return layout;
    }
    
}
