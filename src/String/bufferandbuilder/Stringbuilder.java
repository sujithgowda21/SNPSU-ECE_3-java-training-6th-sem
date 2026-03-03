package String.bufferandbuilder;

public class Stringbuilder {
    static void stringAppend() {
        StringBuilder sbf = new StringBuilder("Hello");
        System.out.println(" original string is: " + sbf);
        sbf.append(" World");
        System.out.println(" New String is: " + sbf);
    }

    static void stringinsert() {
        StringBuilder sbf = new StringBuilder("Hello");
        System.out.println(" original string is: " + sbf);
        sbf.insert(3," world ");
        System.out.println(" New String is: " + sbf);
    }

    static void stringreverse() {
        StringBuilder sbf = new StringBuilder("Hello");
        System.out.println(" original string is: " + sbf);
        sbf.reverse();
        System.out.println(" New String is: " + sbf);
    }

    public static void main(String[] args) {
        stringAppend();
        stringinsert();
        stringreverse();
    }
}
