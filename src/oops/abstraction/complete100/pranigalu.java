package oops.abstraction.complete100;

public interface pranigalu {
    void eat();
    void run();
}
class Dog implements pranigalu{
    public void eat(){
        System.out.println("eating");
    }
    public void run(){
        System.out.println("running");

    }

}
class driver{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.run();
    }
}