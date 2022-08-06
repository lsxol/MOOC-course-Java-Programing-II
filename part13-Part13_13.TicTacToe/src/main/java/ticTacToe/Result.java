/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import java.util.ArrayList;
import javafx.scene.control.Button;

/**
 *
 * @author dkazmierczak
 */
public class Result {
    private ArrayList<Button> b;
    TextChange text;

    public Result(ArrayList<Button> b, TextChange text) {
        this.b = b;
        this.text = text;
    }
    public boolean allEmpty(){
        for(Button b:this.b){
            if(!b.getText().isEmpty()){
                return false;
            }
        }
        return true;
    }
    
    private boolean checkEquality(Button b1, Button b2, Button b3){
        String t1 = b1.getText();
        String t2 = b2.getText();
        String t3 = b3.getText();
        return t1.equals(t2) && t1.equals(t3) && t2.equals(t3) && !t1.isEmpty() && !t2.isEmpty() && !t3.isEmpty();
    }
    
    public boolean checkColumn(int n){
        return checkEquality(b.get(n),b.get(n+1),b.get(n+2));
    }
    public boolean checkRow(int n){
        return checkEquality(b.get(n),b.get(n+3),b.get(n+6));
    }
    
    public boolean checkDiagonal1(){
        return checkEquality(b.get(0),b.get(4),b.get(8));
    }
    public boolean checkDiagonal2(){
        return checkEquality(b.get(2),b.get(4),b.get(6));
    }
    
    public boolean allDisabled(){
        for(Button b: this.b){
            if(!b.isDisabled()){
                return false;
            }
        }
        return true;
    }
    
    public void disableAll(){
        for(Button b: this.b){
            b.setDisable(true);
        }
    }
}
