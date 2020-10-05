import java.util.*;
public class FindLength{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int count=0;
        String str=sc.nextLine();
        if(str.matches("^[A-Za-z ]*$") && (!str.equals("")) && (str!=null)){
            for(int i=0;i<str.length();i++){
                count++;
            }
            System.out.println("No of characters is:"+count);
        }
        else
            System.out.println("Invalid String");
    }
}