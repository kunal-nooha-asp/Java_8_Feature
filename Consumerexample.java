// 1. Consumer 
// The consumer interface of the functional interface is the one that accepts only one argument or 
// a gentrified argument. The consumer interface has no return value. 
// It returns nothing. There are also functional variants of the Consumer DoubleConsumer,
//  IntConsumer and LongConsumer. These variants accept primitive values as arguments.
//Syntax: Consumer<Integer> consumer = (value) -> System.out.println(value);

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.List;
public class Consumerexample
{
    public static void main(String[] args)
    {
        Consumer<String> printer= str->System.out.println("GOOD MORNING "+str);
        printer.accept("Kunal");

        List<String> name = Arrays.asList("kunal" , "sopan" , "kiran" , "kishor");
        Consumer<String> logger= s->System.out.println(s);

        name.forEach(logger);

    }
    
}