
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<Literacy> list = new ArrayList<>();
        
        try{
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(parts -> new Literacy(parts[3],Integer.valueOf(parts[4]),parts[2].split(" ")[1].trim(),parts[5]))
                    .forEach(literacy -> list.add(literacy));
                            
                    
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
        list.stream().sorted((p1,p2) -> {
            return p1.getPercentage().compareTo(p2.getPercentage());
        }).forEach(literacy -> System.out.println(literacy));
        
        
    }
    
   
}
