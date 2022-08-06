
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
public class OneItemBox extends Box {
    
    private int capacity;
    private ArrayList<Item> boxes;
    public OneItemBox(){
        this.capacity = 1;
        this.boxes = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(this.boxes.isEmpty()){
            this.boxes.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if(this.boxes.contains(item)){
            return true;
        }
        return false;
    }
    
    
}
