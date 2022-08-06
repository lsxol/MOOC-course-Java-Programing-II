/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author dkazmierczak
 */
public class SaveableDictionary {
    private HashMap<String,String> dictionaryFinEng;
    private HashMap<String,String> dictionaryEngFin;
    private String fileName;

    public SaveableDictionary() {
        this.dictionaryFinEng = new HashMap<>();
        this.dictionaryEngFin = new HashMap<>();
    }
    
    public void add(String words, String translation){
       this.dictionaryEngFin.putIfAbsent(words, translation);
       this.dictionaryFinEng.putIfAbsent(translation, words);
    }
    
    public String translate(String word){
        if(this.dictionaryEngFin.containsKey(word)){
            return this.dictionaryEngFin.get(word);
        }
        if(this.dictionaryFinEng.containsKey(word)){
            return this.dictionaryFinEng.get(word);
        }
        return null;
    }
    
    public void delete(String word){
        String trans = this.translate(word);
        if(this.dictionaryEngFin.containsKey(word)){
            this.dictionaryEngFin.remove(word, trans);
            this.dictionaryFinEng.remove(trans, word);
            return;
        }
        
        if(this.dictionaryFinEng.containsKey(word)){
            this.dictionaryFinEng.remove(word, trans);
            this.dictionaryEngFin.remove(trans, word);
        }
        
        
    }
    
    public SaveableDictionary(String file){
        this.dictionaryFinEng = new HashMap<>();
        this.dictionaryEngFin = new HashMap<>();
        this.fileName = file;
    } 
    public boolean load(){
        try {

            Scanner sc = new Scanner(Paths.get(this.fileName));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(":");
            
                this.dictionaryEngFin.put(parts[0], parts[1]);
                this.dictionaryFinEng.put(parts[1], parts[0]);
            
            }
            return true;
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean save(){

        String textToWrite = "";
        try{
            PrintWriter writer = new PrintWriter(this.fileName);
            
            for(String key: this.dictionaryFinEng.keySet()){
                textToWrite = key + ":" + this.dictionaryFinEng.get(key);
                writer.println(textToWrite);
                textToWrite = "";
            }
            writer.flush();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
}
