package oops.Basics.ClassWithAttributes;

public class Student {
    String name;
    int usn;
    static String college;

    Student(String n, int u){
        name=n;
        usn=u;
        college="Sapthagiri";

    }
    void printdetails(){
        System.out.println("Student Name: "+name);
        System.out.println("USN of student: "+usn);
        System.out.println(" college name: "+ college);

    }
}
class Driver{
    public static void main(String[] args) {
        Student s1=new Student("SUJITH",113);
        Student s2=new Student("SRUJAN",111);
        s1.printdetails();
        s2.printdetails();

    }

}
