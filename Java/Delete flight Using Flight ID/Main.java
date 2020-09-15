import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        sc.nextLine();
        FlightManagementSystem fms=new FlightManagementSystem();
        boolean b=fms.deleteFlight(i);
        if(b){
            System.out.println("Flight Details deleted successfully");
        }
        else{
            System.out.println("Flight Not deleted. Check for the ID");
        }
    }
}