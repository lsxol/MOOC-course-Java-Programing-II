package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        try{
            if(name.isEmpty() || name.length() > 40){
                throw new IllegalArgumentException();
            }else{
                this.name = name;
            }
            if(age > 120 || age < 0){
                throw new IllegalArgumentException();
            }else{
                this.age = age;
            }
        }catch(Exception e){
            throw new IllegalArgumentException();
        }
        
        
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
