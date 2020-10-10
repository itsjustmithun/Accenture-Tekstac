import java.util.*;
import java.lang.*;

public class Palindrome{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the word :");
        String word = s.nextLine();
        boolean has=false;
        for(int i=0;i<word.length();i++){
            if(!Character.isLetter(word.charAt(i))){
                has=true;
            }
        }
        if(has){
            System.out.println("Invalid Input");
            return;
        }
        else{
            StringBuffer sb=new StringBuffer(word);
            if(word.equalsIgnoreCase(sb.reverse().toString()))
            System.out.println(word+" is a Palindrome");
             else
            System.out.println(word+" is not a Palindrome");
    }
}
}