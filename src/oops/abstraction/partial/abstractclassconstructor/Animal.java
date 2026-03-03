package oops.abstraction.partial.abstractclassconstructor;
// It is possible for an abstract class also to have a constructor
abstract class Animal {
    Animal(){
        System.out.println("Animal constructor");
    }

}
class Dog extends Animal{
    Dog(){
        System.out.println("Dog constructor");
    }
}
class driver{
    public static void main(String[] args) {
        Dog d=new Dog();
    }
}
