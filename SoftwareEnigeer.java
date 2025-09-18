 interface Employee {
public String getName();
    
}
public class SoftwareEnigeer {
    
    public static void main(String[] args)
    {

        Employee emp = ()->"Software Engineer";

        System.out.println(emp.getName());

    }
    
}
