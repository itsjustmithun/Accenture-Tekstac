import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            FlightManagementSystem f=new FlightManagementSystem();
            System.out.println("Enter flight details");
            int id=sc.nextInt();
            sc.nextLine();
            String src=sc.nextLine();
            String dest=sc.nextLine();
            int seats=sc.nextInt();
            sc.nextLine();
            double fare=sc.nextDouble();
            Flight ff=new Flight(id, src, dest, seats, fare);
            boolean b=f.addFlight(ff);
            if(b){
                System.out.println("Flight details added successfully");
            }
            else{
                System.out.println("Addition not done");
            }
    }
}