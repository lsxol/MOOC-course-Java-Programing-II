
package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 *
 * @author dkazmierczak
 */
public class Dictionary {
    
    private List<String> words;
    private HashMap<String, String> translations;

    public Dictionary() {
        this.words = new ArrayList<>();
        this.translations = new HashMap<>();
        
        addWord("Polska", "Poland");
    }
    
    public void addWord(String word, String translation){
        if(!this.translations.containsKey(word)){
            this.words.add(word);
            this.translations.put(word, translation);
        }

    }
    
    public String getTranslation(String word){
        
        return this.translations.get(word);
        
    }
    
    public String getRandomWord(){
        Random random = new Random();
        return this.words.get(random.nextInt(this.words.size()));   
    }
    
    

    
    
}
