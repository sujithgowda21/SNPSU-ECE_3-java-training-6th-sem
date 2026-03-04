package ExceptionHandling;
//  custom runtime exception
public class InvalidAgeFunction extends RuntimeException {
    InvalidAgeFunction(String msg){
        super(msg);
    }
}

class Driver{
    static void checkAge(int age){
        if (age<18){
            throw new InvalidAgeFunction("Age must be over 18");
            // throw a new custom runtime exception
        }
        System.out.println(" He is eligible");
    }
    public static void main(String[] args) {
        checkAge(21);
    }
}
