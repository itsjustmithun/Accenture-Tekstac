import java.util.*;
public class ValidateUtility
{
    public static void main(String args[])
    {
        //fill code here
        Scanner sc=new Scanner(System.in);
        String empName=sc.nextLine();
        String prodName=sc.nextLine();
        Validate ob1=validateEmployeeName();
        if(ob1.validateName(empName))
            System.out.println("Employee name is valid");
        else
            System.out.println("Employee name is invalid");
            
        Validate ob2=validateProductName();
        if(ob2.validateName(prodName))
            System.out.println("Product name is valid");
        else
            System.out.println("Product name is invalid");
    }
    
    public static Validate validateEmployeeName() 
    {
        //fill code here
       Validate validate_name=(name)->{
            if(name.matches("[a-zA-Z ]{5,20}"))
                return true;
            return false;
        };
        return validate_name;
        
        /*return (s)->{
            if(s.matches(".{5,21}") && s.matches("[a-zA-Z ]")
        }
        */
    }
    
    public static Validate validateProductName() 
    {
        //fill code here
        Validate validate_product=(name)->{
            if(name.matches("[a-zA-Z][0-9]{5}"))
                return true;
            return false;
        };
        return validate_product;
    }
}