
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while(true){
            String x = scanner.nextLine();
            if(x.isEmpty()){
                break;
                
            }
            list.add(x);
            
        }
        
        String values = list.stream()
                .reduce("", (previousString, value) -> previousString + value + "\n");
        System.out.println(values);       
    }
}
