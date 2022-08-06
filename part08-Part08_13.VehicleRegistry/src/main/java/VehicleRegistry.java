
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
public class VehicleRegistry {
    private HashMap<LicensePlate,String> licenses = new HashMap<>();
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(!this.licenses.containsKey(licensePlate)){
            this.licenses.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    public String get(LicensePlate licensePlate){
        if(this.licenses.get(licensePlate)!=null){
            return this.licenses.get(licensePlate);
        }
        return null;
    }
    public boolean remove(LicensePlate licensePlate){
        if(this.licenses.get(licensePlate)!=null){
            this.licenses.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates(){
        for(LicensePlate license:this.licenses.keySet()){
            System.out.println(license.toString());
        }
    }
    
    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();
        for(String owner: this.licenses.values()){
            if(!owners.contains(owner)){
                System.out.println(owner);
                owners.add(owner);
            }
        }
    }
}
