import java.util.*;

public class Count{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter your name:");
        String str=sc.nextLine();
        if(str.matches("^[A-Za-z ]*$") && (!str.equals("")) && (str!=null)){
            for(int i=0;i<str.length();i++){
                count++;
            }
            System.out.println(str+" has "+count+" characters");
        }
        else
            System.out.println("Invalid input");
    }
}