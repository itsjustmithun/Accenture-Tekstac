import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        FlightManagementSystem f=new FlightManagementSystem();
        System.out.println("Enter flight details ");
        int flightId=sc.nextInt();
        sc.nextLine();
        
        //String src=sc.nextLine();
        //String dest=sc.nextLine();
        //int seats=sc.nextInt();
        //sc.nextLine();
        
        double flightFare=sc.nextDouble();
        boolean fl=f.updateFlightFare(flightId,flightFare);
        //boolean b=f.updateFlightFare(fl);
        if(fl==true)
            System.out.println("Flight details updated successfully");
        else
            System.out.println("Flight fare not updated. Check for the ID");
    }
}