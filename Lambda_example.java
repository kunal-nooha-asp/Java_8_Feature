interface StringLength{
    int getlength(String s);
}
public class Lambda_example {
    
    public static void main(String[] args)
    {
        StringLength strlen = str->str.length();

        System.out.println("Length of Hello  : "+ strlen.getlength("Hello") );
        System.out.println("Length of Nooha-ASP  : "+ strlen.getlength("Nooha-ASP") );
    }
}
