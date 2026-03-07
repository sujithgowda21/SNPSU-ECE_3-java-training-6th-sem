package String.bufferandbuilder;

public class StringBufferandBuilder {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        StringBuffer sbf=new StringBuffer(" Hello ");
        for  (int i=0; i<1000000; i++){
            sbf.append(" world");
        }
        long stopTime=System.currentTimeMillis();
        System.out.println(" Time Taken by SBF: "+(stopTime-startTime)+"ms");

        startTime=System.currentTimeMillis();
        StringBuilder sbl=new StringBuilder(" hello");
        for (int i=0; i<1000000; i++){
            sbf.append(" world");
        }
        stopTime=System.currentTimeMillis();
        System.out.println(" Time Taken by SBF: "+(stopTime-startTime)+"ms");

    }

}
