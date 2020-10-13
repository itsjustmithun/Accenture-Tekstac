import java.util.*;
import java.util.regex.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Generate your Security Code");
        String ip=s.next();
        Pattern pattern=Pattern.compile("((?=.*[a-z])(?=.*[A-Z])(?=.*[@*#]).{8,})");
        Matcher m=pattern.matcher(ip);
        if(m.matches()){
            System.out.println("Security Code Generated Successfully");
        }
        else{
            System.out.println("Invalid Security Code, Try Again!");
        }
    }
}