import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        FlightManagementSystem fms = new FlightManagementSystem();
        Flight f = fms.viewFlightById(id);
        if(f==null){
            System.out.println("Invalid Flight ID");
        }
        else{
            System.out.println("Flight ID : "+f.getFlightId()+"\nSource : "+f.getSource()+"\nDestination : "+f.getDestination()+"\nNo of seats : "+f.getNoOfSeats()+"\nFlight Fare : "+f.getFlightFare());
        }
    }
}