import java.util.*;
public class NumberTypeUtility
{
   public static NumberType isOdd(){
       return(int a)->{
           if(a%2==0)
            return false;
            else
                return true;
       };
   }
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       NumberType nt =isOdd();
       if(!nt.checkNumberType(n))
            System.out.println(n+" is not odd");
        else
            System.out.println(n+" is odd");
   }
}