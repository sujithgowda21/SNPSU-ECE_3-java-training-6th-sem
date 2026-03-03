package String;

public class StringImmutable {
    public static void main(String[] args) {
        String s1="Sujith";
        s1.concat("king");

        System.out.println(s1+ " GOWDA");

        String s2 =s1.concat(" Gowda");
        System.out.println(s2);
    }
}
