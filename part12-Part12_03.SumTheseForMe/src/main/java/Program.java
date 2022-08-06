

public class Program {

    public static void main(String[] args) {
        int[] numbers = {8, -2, 3, 1, 1, 1, 2, 3};
        System.out.println(sum(numbers, 5, numbers.length, 0, 999));

    }
    
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest){
        int sum = 0;
        int down = 0;
        int up = array.length;
        
        if(fromWhere < 0){
            down = 0;
        }else{
            down = fromWhere;
        }
        if(toWhere > up){
            up = array.length;
        }else{
            up = toWhere;
        }
        
        for(int i = down; i < up; i++){
            if(array[i]>=smallest && array[i]<=largest){
                sum = sum + array[i];
            }
        }
        
        
        return sum;
    }

}
