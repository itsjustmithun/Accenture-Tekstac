import java.util.*;
public class Division{
    public String divideTwoNumbers(int num1, int num2){
        int quot=-1;
        try{
            quot=num1/num2;
        }
        catch(ArithmeticException e){
        }finally{
            if(quot!=-1)
                return ("The answer is "+quot+". Thanks for using the application.");
            else
                return ("Division by zero is not possible. Thanks for using the application.");
        }
    }
    public static void main(String[] args){
        Division div=new Division();
        System.out.println("Enter the numbers");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        try{
            System.out.println(div.divideTwoNumbers(num1,num2));
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}