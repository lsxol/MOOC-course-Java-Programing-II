
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true){
            System.out.println("Input the name of the book, empty stops: ");
            String x = scanner.nextLine();
            if(x.isEmpty()){
                break;
            }
            System.out.println("Input the age recommendation: ");
            int z = Integer.valueOf(scanner.nextLine());
            books.add(new Book(x,z));
            
        }
        System.out.println(books.size() + " books in total.");
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        Collections.sort(books, comparator);
        
        books.stream()
                .forEach(book -> System.out.println(book));
                
    }

}
