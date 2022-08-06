
import java.util.ArrayList;
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
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility(){
        this.storage = new HashMap<>();
        
    }
    
    public void add(String unit, String item){
        this.storage.putIfAbsent(unit, new ArrayList<String>());
        this.storage.get(unit).add(item);
    }
    public ArrayList<String> contents(String storageUnit){
        for(String txt:this.storage.keySet()){
            if(txt.equals(storageUnit)){
                if(this.storage.get(storageUnit).isEmpty()){
                    return new ArrayList<>();
                }
                return this.storage.get(storageUnit);
            }
        }
        return new ArrayList<>();
    }
    
    public void remove(String storageUnit, String item){
           
        if(this.storage.get(storageUnit).contains(item)){
            this.storage.get(storageUnit).remove(item);
        }
        if(this.storage.get(storageUnit).isEmpty()){
            this.storage.remove(storageUnit);
        }

    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> storageNames = new ArrayList<>();
        for(String txt:this.storage.keySet()){
            if(!this.storage.get(txt).isEmpty()){
                storageNames.add(txt);
            }
        }
        return storageNames;

    }
}
