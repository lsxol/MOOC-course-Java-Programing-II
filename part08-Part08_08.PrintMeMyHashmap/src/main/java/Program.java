
import java.util.ArrayList;
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    
    public static void printKeys(HashMap<String,String> hashmap){
        for(String hash:hashmap.keySet()){
            System.out.println(hash);
            
        }
    }
    
    
    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
        for(String hash:hashmap.keySet()){
            if(hash.contains(text)){
                System.out.println(hash);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        for(String hash:hashmap.keySet()){
            if(hash.contains(text)){
                System.out.println((hashmap.get(hash)));
            }
        }
        
        
        
    }
}
