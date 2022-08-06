/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkazmierczak
 */
public class Container {
    private int value;
    
    public Container(){
        this.value = 0;
    }

    public int contains() {
        return value;
    }
    
    
    
    public void add(int add){
        if(add >= 0){
            this.value = this.value + add;
        }
        if(this.value > 100){
            this.value = 100;
        }
    }
    
    public void remove(int remove){
        if (remove >= 0){
            this.value = this.value - remove;
        }
        if (this.value < 0){
            this.value = 0;
        }
    }
    @Override
    public String toString(){
        return this.value + "/100";
    }
}
