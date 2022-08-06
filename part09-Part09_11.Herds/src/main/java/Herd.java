
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
public class Herd implements Movable{
    
    private ArrayList<Movable> herds;
    
    public Herd (){
        this.herds = new ArrayList<>();
    }
    @Override
    public String toString(){
        String all = "";
        for(Movable org:herds){
            all = all + org.toString() +"\n";
        }
        return all;
    }
    
    
    public void addToHerd(Movable movable){
        this.herds.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable org: herds){
            org.move(dx, dy);
        }
    }
    
}
