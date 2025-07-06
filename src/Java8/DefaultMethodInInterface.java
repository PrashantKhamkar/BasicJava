package Java8;

interface Parent{
    default void sayHello(){
        System.out.println("Hii...");
    }
}
class Chiled implements Parent{

    @Override
    public void sayHello(){
        System.out.println("Jay Ho...");
    }
}
public class DefaultMethodInInterface {

    public static void main(String[] args) {

        Parent p = new Chiled();
        Chiled c = new Chiled();

        p.sayHello();
        c.sayHello();
    }
}
