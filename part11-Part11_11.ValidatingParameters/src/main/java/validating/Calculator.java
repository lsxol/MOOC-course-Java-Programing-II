package validating;

public class Calculator {

    public int factorial(int num) {
        try{
        if(num >= 0){
            int answer = 1;
            for (int i = 1; i <= num; i++) {
                answer *= i;
            }

            return answer;
        }else{
            throw new IllegalArgumentException();
        }
        
    }catch(Exception e){
            throw new IllegalArgumentException();
    }
    }
    public int binomialCoefficent(int setSize, int subsetSize) {
        try{
            if((setSize < 0 || subsetSize < 0) && subsetSize > setSize){
            throw new IllegalArgumentException();
        }else{
            int numerator = factorial(setSize);
            int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);
            return numerator / denominator;
        }
        }
        catch(Exception e){
                throw new IllegalArgumentException();
        }
        
        }
    }

