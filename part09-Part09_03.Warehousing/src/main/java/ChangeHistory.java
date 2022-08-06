
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkazmierczak
 */
public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status){
        this.history.add(status);
    }
    
    public void clear(){
        this.history.clear();
    }
    
    @Override
    public String toString(){
        return this.history.toString();
    }
    
    public double maxValue(){
        double ing = this.history.get(0);
        for(double doub:this.history){
            if(ing < doub){
                ing = doub;
            }
        }
        return ing;
    }
    
    public double minValue(){
        double ing = this.history.get(0);
        for(double doub:this.history){
            if(ing > doub){
                ing = doub;
            }
        }
        return ing;
    }
    
    public double average(){
        double ing = 0;
        for(double doub:this.history){
            ing = ing + doub;
        }
        if(ing > 0){
            return ing/this.history.size();
        }else{
            return 0;
        }
        
    }
    
    
            
}
