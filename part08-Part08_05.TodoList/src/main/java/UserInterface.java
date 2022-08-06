
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkazmierczak
 */
public class UserInterface {
    
    private TodoList todo = new TodoList();
    private Scanner scanner;

    public UserInterface(TodoList todo, Scanner scanner) {
        this.todo = todo;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String x = this.scanner.nextLine();
            if(x.equals("stop")){
                break;
            }
            if(x.equals("add")){
                System.out.println("To add: ");
                String add = this.scanner.nextLine();
                this.todo.add(add);
                
            }
            if(x.equals("list")){
                this.todo.print();
            }
            if(x.equals("remove")){
                System.out.println("Which one is removed?");
                int remove = Integer.valueOf(this.scanner.nextLine());
                this.todo.remove(remove);
            }
        }
    }
    
}
