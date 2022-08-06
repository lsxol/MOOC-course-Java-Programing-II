
import java.util.ArrayList;
import javax.lang.model.SourceVersion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkazmierczak
 */
public class BoxWithMaxWeight extends Box{
    
    private int capacity;
    private ArrayList<Item> boxes;
    public BoxWithMaxWeight (int capacity){
        this.capacity = capacity;
        this.boxes = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        
        int weightAll = 0;
        for(Item it:this.boxes){
            weightAll = weightAll + it.getWeight();
        }
        
        if(weightAll + item.getWeight() > this.capacity){
            
        }else{
            weightAll = weightAll + item.getWeight();
            boxes.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for(Item it:this.boxes){
            if(it.equals(item)){
                return true;
            }
        }
        return false;
    }


    
}
