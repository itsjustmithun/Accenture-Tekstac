public class Main
{
    public static DisplayText welcomeMessage(){
        DisplayText d=(text)->{System.out.println("Welcome "+text);
        };
        return d;
    }
    public static void main(String args[])
    {
        DisplayText obj=welcomeMessage();
        String k=obj.getInput();
        obj.displayText(k);
    }
}