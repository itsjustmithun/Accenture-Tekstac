import java.util.*;
public class PanCard{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the PAN no:");
        String s1=sc.next();
        getValues(s1);
    }
    public static void getValues(String s1){
        if(s1.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")){
            System.out.println("Valid PAN no");
        }
        else
            System.out.println("Invalid PAN no");
    }
}