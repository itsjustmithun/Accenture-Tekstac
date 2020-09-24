import java.util.*;

public class FirstOccurence{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String text=sc.nextLine();
        System.out.println("Enter the character to be searched:");
        String f=sc.nextLine();
        System.out.println("Enter the character to replace:");
        String rep=sc.nextLine();
        if(text.indexOf(f)!=-1){
            String fin=text.replaceFirst(f,rep);
            System.out.println(fin);
        }
        else
            System.out.println("character not found");
    }
}