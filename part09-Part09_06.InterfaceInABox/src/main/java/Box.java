
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
public class Box implements Packable{
    
    private ArrayList<Packable> items;
    private double capacity;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    
    
    @Override
    public double weight() {
        double weight = 0;
        for(Packable it:this.items){
            weight = it.weight() + weight;
        }
        return weight;
    }
    
    public void add(Packable item){
        
        if(item.weight() + this.weight() > this.capacity){
            
        }else{
            this.items.add(item);
        }
        
    }
    
    @Override
    public String toString(){
        return "Box: " + this.items.size() + " items, " + "total weight " 
                + this.weight() + " kg";
    }
    
}
