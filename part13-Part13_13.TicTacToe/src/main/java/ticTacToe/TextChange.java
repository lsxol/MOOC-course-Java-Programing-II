/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import java.util.Objects;
import javafx.scene.control.Button;

/**
 *
 * @author dkazmierczak
 */
public class TextChange {
    private String text;

    public TextChange() {
        this.text = "X";
    }

    public String getText() {
        return text;
    }
    
    public void change(){
        if(this.text.equals("X")){
            this.text="O";
        }else{
            this.text="X";
        }
    }

    
    
    @Override
    public String toString() {
        return text;
    }

    
    
    
}
