package oops.abstraction.complete100.multipleinheritence;

interface Mom {
    void cook();
}
interface Dad{
    void cook();

}
class child implements Mom,Dad{
    public void cook(){
        System.out.println(" BIRIYANI ");

    }
}
class Driver{
    public static void main(String[] args) {
        child c=new child();
        c.cook();
    }
}
