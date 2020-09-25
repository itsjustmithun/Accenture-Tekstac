import java.util.*;
public class ReplaceWord{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean found;
        System.out.println("Enter the string:");
        String first=sc.nextLine();
        System.out.println("Enter the word to be searched");
        String word=sc.nextLine();
        System.out.println("Enter the word to be replaced");
        String rep=sc.nextLine();
        if(first.indexOf(word)!=-1){
            String fin=first.replace(word,rep);
            System.out.println(fin);
        }
        else
            System.out.println("The word "+word+" not found");
    }
}