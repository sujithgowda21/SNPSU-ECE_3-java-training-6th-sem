package ExceptionHandling;

public class E4 {
    public static void main(String[] args) {
        try {
            int bal = 2000;
            int withdraw = 3000;
            if (withdraw > bal) {
                throw new ArithmeticException(" Insufficient balnace ");
            }
            System.out.println(" withdraw successful");
        } catch (ArithmeticException a) {
            System.out.println(" Exception Caugtht: " + a.getMessage());
        }
    }
}
