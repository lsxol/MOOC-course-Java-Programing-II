
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
public class Pipe<T> {
    
    ArrayList<T> pipe;

    public Pipe() {
        this.pipe = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        pipe.add(value);
    }
    
    public T takeFromPipe(){
        T obj;
        if(pipe.isEmpty()){
            return null;
        }else{
            obj = pipe.get(pipe.size() - 1);
            pipe.remove(pipe.size() - 1);
            return obj;
        }
    }
    
    public boolean isInPipe(){
        if(pipe.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
}
