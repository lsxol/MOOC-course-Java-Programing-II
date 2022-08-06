
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while(true){
            String x = scanner.nextLine();
            if(x.equals("end")){
                break;
            }
            list.add(x);
        }
        
        String decision = scanner.nextLine();
        if(decision.equals("n")){
            double average = list.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        }
        if(decision.equals("p")){
            double average = list.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number >= 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        }

    }
}
