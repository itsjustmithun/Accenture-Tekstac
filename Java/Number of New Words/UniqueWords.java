//import the necessary packages if needed
import  java.util.*; 
@SuppressWarnings("unchecked")//Do not delete this line
public class UniqueWords
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student's Article");
        String str=sc.nextLine();
        String word[]=str.split("[\\s,;:.?!]+");
        TreeSet<String> set=new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        for(String w:word)
            set.add(w);
        System.out.println("Number of words "+word.length+"\nNumber of unique words "+set.size());
        System.out.println("The words are");
        int i=1;
        for(Object w:set){
            System.out.println(i+". "+w);
            i++;
        }
    }
}