//import the necessary packages if needed
     import java.util.*;
     import java.util.HashMap;
@SuppressWarnings("unchecked")//Do not delete this line
public class CountOfWords
{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Student's Article");
        String st = s.nextLine();
        String[] str=st.split("[,;:.?! ]+");
        
        HashMap<String, Integer> map=new HashMap();
        for(String w:str){
            w=w.toLowerCase();
            if(!map.containsKey(w)){
                map.put(w,1);
            }
            else{
                int count=(int)map.get(w);
                count++;
                map.put(w,count);
            }
        }
        System.out.println("Number of words "+str.length+"\nWords with the count");
        Set<String> key=map.keySet();
        List<String> keyList=new ArrayList<String>(key);
        Collections.sort(keyList);
        for(String e:keyList)
            System.out.println(e+": "+map.get(e));
    }
}