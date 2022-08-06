
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        
        Random numberRandom = new Random();
        int counter = 0;
        while(counter < 7){
            int random = numberRandom.nextInt(40)+1;
            if(!containsNumber(random)){
                this.numbers.add(random);
                counter++;
            }
        }
    }

    public boolean containsNumber(int number) {
        if(this.numbers.contains(number)){
            return true;
        }
        return false;
    }
}

