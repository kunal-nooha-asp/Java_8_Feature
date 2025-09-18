@FunctionalInterface
interface  Parent {
    public void sayHello();

    default void saybye(){
        System.out.println("Good Bye see you soon !");
    }
    static void greeting(){
        System.out.println("Good Morning Kunal");
    }
    
}

public class Myclass implements Parent{

    public void sayHello(){
            System.out.println("hello Good morning");
        }
    public static void main(String[] args)
    {
        Myclass obj = new Myclass();
        obj.sayHello();
        obj.saybye();
        Parent.greeting();


    }
}