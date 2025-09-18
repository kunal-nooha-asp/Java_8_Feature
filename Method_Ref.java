import java.util.*;

public class Method_Ref {
    
    public static void main(String[] args)
    {
        List<String> names =Arrays.asList("kunal" , "sopan" , "kishor" , "kiran");

        List<String> uname = names.stream().map(name -> name.toUpperCase()).toList();

        System.out.println(uname);

        List<String> uname1 = names.stream().map( String :: toUpperCase).toList();
        uname1.forEach(System.out :: println);
    }

}
