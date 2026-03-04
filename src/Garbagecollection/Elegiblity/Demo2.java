package Garbagecollection.Elegiblity;

public class Demo2 {
    // This Finalize function only get called when System.gc(); is called

    public void finalize(){
        System.out.println("Garbage collection");
    }
    public static void main(String[] args) {
        for (int i=0; i<10000; i++) {
            Demo2 obj = new Demo2();
            obj = null;
        }
        System.gc(); // Call Garbage Collector
    }
}
