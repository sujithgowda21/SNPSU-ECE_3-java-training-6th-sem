package String;

public class StringMethods {
    public static void main(String[] args) {
        String s1="Java Programing";
        String s2=new String("Java Programing");

        System.out.println("Original String: "+s1);

        //length()
        System.out.println("Length: "+s1.length());

        //charAt()
        System.out.println("Character At index 2: " + s1.charAt(3));

        //toupperCase() and tolowerCase()
        System.out.println("UpperCase: " + s1.toUpperCase());
        System.out.println("LowerCase: " + s1.toLowerCase());

        //equals() and ==
        System.out.println("Using == "+(s1==s2));
        System.out.println("Using equals(): "+ s1.equals(s2));

        //compareTo() -> lexicographical Comparision (ASCII) compare
        System.out.println("compareTo: "+s1.compareTo(s2));

        //substring()
        System.out.println("Substing 0 to 4: "+ s1.substring(0,4));

        //contain()
        System.out.println("Contains 'program':"+ s1.contains("ava"));

        //indexOf()
        System.out.println(" Index of p: "+ s1.indexOf('P'));

        //replace()
        System.out.println("Repalce Java to Sujith: "+ s1.replace("Java","Sujith"));

        //trip()
        String s3="      Hello World    ";
        System.out.println("Befor Trim: "+s3);
        System.out.println("After trim: " + s3.trim());

        //concat
        System.out.println("Concat: "+s1.concat(" Language"));

        //isEmpty
        String s4="";
        System.out.println("Is Empty: "+ s4.isEmpty());

        //split
        String Sentence =" Java is a Programing Language";
        String[] arr=Sentence.split(" ");

        for (String i : arr){
            System.out.println(i);
        }
    }
}
