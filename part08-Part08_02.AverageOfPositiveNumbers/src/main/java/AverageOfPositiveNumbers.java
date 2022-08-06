
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while(true){
            int x = Integer.valueOf(scanner.nextLine());
            if(x == 0){
                break;
            }
            if(x > 0) {
                sum = sum + x;
                count++;
            }
            
        }
        
        if(count <= 0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println(1.0*sum/count);
        }
    }
}
