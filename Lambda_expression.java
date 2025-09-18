import java.util.*;

public class Lambda_expression {
    private void add(int a, int b) {
        System.out.println("a+b :" + (a + b));
    }

    public static void main(String args[])
    {
        Lambda_expression l= new Lambda_expression();
        int a=10 , b=20;
        l.add(a, b);
        // Using with Functional Interfaces like Comparator 
     List<String> list =  Arrays.asList("apple","mango","cherry","banana");
     Collections.sort(list ,(x,y)-> x.compareTo(y));


    System.out.println(list);

    List<String> names= new ArrayList<>();
    names.add("kunal");
    names.add("sopan");
    names.add("kiran");
    names.add("kishor");
    names.add("Gopal");
    System.out.println("Name of all ");
    names.forEach(name->System.out.println(name));

    //using lambda expression to find nae starting with k
    System.out.println("\n Name starting with 'K' ");
    names.stream().filter(name->name.startsWith("k")).forEach(name->System.out.print(name+"   "));





    }

}