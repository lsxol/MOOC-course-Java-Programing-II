
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

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
        
        double average = list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        System.out.println("Average of the numbers: " + average);
    }
}
