package String.bufferandbuilder;

public class Stringbuffer {
    static void stringAppend() {
        StringBuffer sbf = new StringBuffer("Hello");
        System.out.println(" original string is: " + sbf);
        sbf.append(" World");
        System.out.println(" New String is: " + sbf);
    }

    static void stringinsert() {
        StringBuffer sbf = new StringBuffer("Hello");
        System.out.println(" original sytring is: " + sbf);
        sbf.insert(3," world");
        System.out.println(" New String is: " + sbf);
    }

    static void stringreverse() {
        StringBuffer sbf = new StringBuffer("Hello");
        System.out.println(" original sytring is: " + sbf);
        sbf.reverse();
        System.out.println(" New String is: " + sbf);
    }

    public static void main(String[] args) {
        stringAppend();
        stringinsert();
        stringreverse();
    }
}