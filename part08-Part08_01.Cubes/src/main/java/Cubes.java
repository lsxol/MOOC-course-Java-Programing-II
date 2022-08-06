
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            
            String x = scanner.nextLine();
            if(x.equals("end")){
                break;
            }
            int z = Integer.valueOf(x);
            System.out.println(z*z*z);
        }
        
    }
}
