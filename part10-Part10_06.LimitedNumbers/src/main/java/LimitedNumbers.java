
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while(true){
            String x = scanner.nextLine();
            if(Integer.valueOf(x) < 0){
                break;
            }
            list.add(x);
        }
        
        list.stream()
                .mapToInt(value -> Integer.valueOf(value))
                .filter(value -> value > 0 && value < 6)
                .forEach(value -> System.out.println(value));
                
    }
}
