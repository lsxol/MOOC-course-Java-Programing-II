
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkazmierczak
 */
public class IOU {
    
    private HashMap<String, Double> iOweYou;
    
    public IOU(){
        this.iOweYou = new HashMap<>();
    }
 
    public void setSum(String toWhom, double amount){
        this.iOweYou.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        if(this.iOweYou.containsKey(toWhom)){
            return this.iOweYou.get(toWhom);
        }
        return 0;
    }
}
