package ExceptionHandling;

public class E1 {
    public static void main(String[] args) {
        int i=0, j=5, k=0;
        try{
            k=i/j;
            System.out.println(k);
            int[] arr={1,2,3,4,5};
            System.out.println(arr[2]);
        }
        catch (ArithmeticException e){
            System.out.println(" you cant divide anything by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" GET LOST");
        }
        catch (Exception e){
            System.out.println("Unknown Exception ");
        }
        //finally{
          //  System.out.println("This block will get executed");
       // }
        System.out.println(" HEllO SUJITH ");
    }
}
