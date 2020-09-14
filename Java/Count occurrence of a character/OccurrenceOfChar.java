import java.util.*;

public class OccurrenceOfChar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=0, fromindex=0;
        System.out.println("Enter a word:");
        String word=sc.nextLine();
        //System.out.println("Enter the character:");
        //String ch=sc.nextLine();
        //if(word.indexOf(ch)!=-1){
        if(word.matches("^[a-zA-Z ]*$") && (!word.equals("")) && (word!=null)){
            System.out.println("Enter the character:");
            String ch=sc.nextLine();
            if(ch.matches("^[a-zA-Z ]*$") && (!ch.equals("")) && (ch!=null)){
                if(word.indexOf(ch)!=-1){
                    while((fromindex=word.indexOf(ch,fromindex))!=-1){
                        count++;
                        fromindex++;
                    }
                System.out.println("No of '"+ch+"' present in the given word is "+count+".");
                }
                else{
                    System.out.println("The given character '"+ch+"' not present in the given word.");
                }
            }
            else{
                System.out.println("Given character is not an alphabet");
            }
        }
        else{
            System.out.println("Not a valid string");
        }
    }
}