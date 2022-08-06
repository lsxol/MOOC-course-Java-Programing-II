package dictionary;

public class Main {
    public static void main(String[] args) {
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        dictionary.load();
        System.out.println(dictionary.translate("noga"));    
        dictionary.add("trans1", "trans2");
        dictionary.add("trans3", "trans4");
        dictionary.delete("trans1");
        dictionary.save();
        
    }
}
