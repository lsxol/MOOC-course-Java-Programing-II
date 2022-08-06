/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkazmierczak
 */
public class CD implements Packable {
    private String artist;
    private String cdName;
    private int year;

    public CD(String artist, String cdName, int year) {
        this.artist = artist;
        this.cdName = cdName;
        this.year = year;
    }

    @Override
    public double weight() {
       return 0.1;
    }
    @Override
    public String toString(){
        return this.artist + ": " + this.cdName + " (" + this.year + ")";
    }
    
    
    
    
    
}
