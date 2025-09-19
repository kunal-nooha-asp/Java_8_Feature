// 2. Predicate 
// The Predicate interface represents a boolean-valued function of one argument. 
// It is commonly used for filtering operations in streams. Just like the Consumer functional interface,
//  Predicate functional interface also has some extensions. These are IntPredicate, 
//  DoublePredicate and LongPredicate. These types of predicate functional interfaces
//   accept only primitive data types or values as arguments.  

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Pricator {
    
    public static void main(String[] args)
    {
        Predicate<Integer> isEven= num->num%2 ==0;
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(9));

        List<Integer>number = Arrays.asList(5,10,15,23,25);
        Predicate<Integer> greateThan10=num->num>10;
        number.stream().filter(greateThan10)
        .forEach(System.out ::println);

    }
}

