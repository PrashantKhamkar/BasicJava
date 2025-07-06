package Java8;

interface A{
    static void sayHello(){
        System.out.println("Hello...");
    }
}
public class StaticMethodInInterface implements A {
    public static void main(String[] args) {

//        StaticMethodInInterface.sayHello();//Not possible
        A.sayHello(); //Static method can be called using the interface Name , not the object
    }
}
