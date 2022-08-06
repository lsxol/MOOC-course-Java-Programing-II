/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkazmierczak
 */
public class Hideout<T> {

    T hide;
    
    public Hideout() {
        
    }
    
    public void putIntoHideout(T toHide){
        this.hide = toHide;
    }
    public T takeFromHideout(){
        T obj = this.hide;
        this.hide = null;
        return obj;
    }
    public boolean isInHideout(){
        if(this.hide == null){
            return false;
        }else{
            return true;
        }
    }
            
}
