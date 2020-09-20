import java.util.*;
import java.util.regex.*;
public class UserMain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your ID");
        String s=sc.nextLine();
        Pattern pat=Pattern.compile("GBL/[0-9]{3}/[0-9]{4}");
        Matcher i=pat.matcher(s);
        if(i.matches()){
            System.out.println("Login success");
        }
        else
        System.out.println("Incorrect ID");
    }
}