import java.util.*;
import java.util.regex.*;
public class UserMain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your PAN number");
        String s=sc.nextLine();
        Pattern pat=Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]");
        Matcher i = pat.matcher(s);
        if(i.matches()){
            System.out.println("Valid PAN number");
        }
        else{
            System.out.println("Invalid PAN number");
        }
    }
}