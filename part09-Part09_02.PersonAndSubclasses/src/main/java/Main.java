
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
       Person ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);   // ollie.toString() WORKS
    }
    
    
    public static void printPersons(ArrayList<Person> persons){
        for(Person person:persons){
            System.out.println(person);
        }
    }

}
