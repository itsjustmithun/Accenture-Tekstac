import java.util.*;
public interface DisplayText
{
    public abstract void displayText(String text);
    public default String getInput(){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        return s;
    }
}