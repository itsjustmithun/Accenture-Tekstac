import java.util.*;
public class Authority{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Inmate's name:");
        String str=sc.nextLine();
        System.out.println("Inmate's father's name:");
        String str2=sc.nextLine();
        if(str.matches("^[a-zA-Z ]*$") && (!str.equals("")) && (str!=null) && str2.matches("^[a-zA-Z ]*$") && (!str2.equals("")) && (str!=null)){
            str=str.concat(" ");
            str=str.concat(str2);
            String fin=str.toUpperCase();
            System.out.println(fin);
        }
        else{
            System.out.println("Invalid name");
        }
    }
}