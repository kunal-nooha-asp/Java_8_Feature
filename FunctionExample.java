
//  Function
//  A function is a type of functional interface in Java that receives only a
//  single argument and returns a value after the required processing. 
//  Many different versions of the function interfaces are instrumental and
//   are commonly used in primitive types like double, int, long.

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
public class FunctionExample {
    public static void main(String[] args)
    {
        Function<Integer , Integer> square =x->x*x;

        System.out.println(square.apply(5));

        Function<String , Integer> strlen= str->str.length();
        System.out.println(strlen.apply("Kunal"));

        List<String > names =  Arrays.asList("kunal", "sopan " ,"kiran");
        Function<String , String> toupper=s-> s.toUpperCase();

        names.forEach(name -> System.out.print(toupper.apply(name) +" "));

        names.stream().map(toupper)
        .forEach(System.out::println);

        Function<Integer, String> intTostr=i->"Length is"+i;
        System.out.println(strlen.andThen(intTostr).apply("Intern"));

        Function<String , String> trimfun=  String::trim;
        System.out.println(strlen.compose(trimfun).apply("    Java   "));


    }
}
