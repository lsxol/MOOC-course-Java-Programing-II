package ticTacToe;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class TicTacToeApplication extends Application{
    
    
    
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();
        TextChange text = new TextChange();
        
        ArrayList<Button> buttonArray = new ArrayList<>();
        Result result = new Result(buttonArray,text);
        
        HBox menu = new HBox();
        menu.setSpacing(20);
        menu.setPadding(new Insets(10,10,10,10));
        Label turn = new Label("Turn: ");
        turn.setFont(new Font("Arial", 30));
        Label sign = new Label();
        sign.setFont(new Font("Arial", 30));
        menu.getChildren().addAll(turn, sign);
        
        
        Font font = new Font("Monospaced", 30);
        Rectangle square = new Rectangle(100,100);
        GridPane buttons = new GridPane();
        buttons.setPadding(new Insets(10,10,10,10));
        
        
        for (int x = 1; x <= 9; x++) {
                Button add = new Button();
                add.setMinWidth(80);
                add.setMaxWidth(80);
                add.setPrefWidth(80);

                add.setMinHeight(80);
                add.setMaxHeight(80);
                add.setPrefHeight(80);
                add.setFont(font);
                buttonArray.add(add);    
        }
        
        buttons.addColumn(0, buttonArray.get(0),buttonArray.get(1),buttonArray.get(2));
        buttons.addColumn(1, buttonArray.get(3),buttonArray.get(4),buttonArray.get(5));
        buttons.addColumn(2, buttonArray.get(6),buttonArray.get(7),buttonArray.get(8));
        
        layout.setTop(menu);
        layout.setCenter(buttons);

        
        for(Button b:buttonArray){
            b.setOnMouseClicked((event) -> {
                boolean winner = false;
                b.setText(text.toString());
                b.setDisable(true);
                text.change();
                turn.setText("Turn: " + text.toString());
                
                if((result.checkColumn(0) 
                    || result.checkColumn(3)||result.checkColumn(6)
                    ||result.checkDiagonal1()||result.checkDiagonal2()
                    ||result.checkRow(0)||result.checkRow(1)||result.checkRow(2))
                        && !result.allEmpty()
                ){  
                    text.change();
                    turn.setText(text.getText() + " wins");
                    winner = true;
                }
                
                if(winner == true){
                    result.disableAll();
                }
        
                if(result.allDisabled() && winner == false){
                    turn.setText("Noone wins");
                }
            });
 
        }
        boolean winner=false;
        
        
        
        
        
        
        Scene view = new Scene(layout, 270, 315);
        
        stage.setScene(view);
        stage.show();
        
        
        
    }


    public static void main(String[] args) {
        ArrayList<Button> buttonArray = new ArrayList<>();
        TextChange text = new TextChange();

        launch(TicTacToeApplication.class);
    }

    
}
