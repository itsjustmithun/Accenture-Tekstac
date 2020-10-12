import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of passengers:");
        int num=sc.nextInt();
        String str="";
        for(int i=1;i<=num;i++){
            System.out.println("Passenger "+i);
            System.out.println("Enter the ticketid:");
            int ticketid=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the name:");
            String name=sc.nextLine();
            System.out.println("Enter the gender:");
            String gen=sc.nextLine();
            System.out.println("Enter the address:");
            String address=sc.nextLine();
            Passenger pass=new Passenger(ticketid,name,gen,address);
            str=str+pass.toString();
        }
        System.out.println(str);
    }
}