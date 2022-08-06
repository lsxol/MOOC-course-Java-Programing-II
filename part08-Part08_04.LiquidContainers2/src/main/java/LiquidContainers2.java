
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first.contains() + "/100");
            System.out.println("Second: " + second.contains() + "/100");
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);
            if(command.equals("add")){
                first.add(value);
            }
            if(command.equals("move")){
                if(value > first.contains()){
                    second.add(first.contains());
                    first.remove(first.contains());
                }else{
                    second.add(value);
                    first.remove(value);
                }
            }
            if(command.equals("remove")){
                if(value > second.contains()){
                    second.remove(second.contains());
                }else{
                    second.remove(value);
                }
            }

        }
    }

}
