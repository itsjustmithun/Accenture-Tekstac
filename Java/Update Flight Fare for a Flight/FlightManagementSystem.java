import java.sql.*;
import java.util.*;
public class FlightManagementSystem{
    List<Flight> l=new ArrayList<>();
    public boolean updateFlightFare(int flightId, double flightFare){
        DB db=new DB();
        /*
        try{
            Connection con=db.getConnection();
            Statement st=con.createStatement();
            
            int i=flightObj.getFlightId();
            String s=flightObj.getSource();
            String d=flightObj.getDestination();
            int n=flightObj.getNoOfSeats();
            double f=flightObj.getFlightFare();
            
            String q="insert into Flight values('"+i+"','"+s+"','"+d+"','"+n+"','"+f+"')";
            int status=st.executeUpdate(q);
            con.close();
            if(status>0){
                return true;
            }
            else
                return false;
        }
        */
        try{
            String query="update Flight set flightFare = "+flightFare+" where flightId ="+flightId;
            Connection con=db.getConnection();
            Statement stmt=con.createStatement();
            int status=stmt.executeUpdate(query);
            con.close();
            if(status>0)
                return true;
            else
                return false;
        }
        
        catch(ClassNotFoundException e){
            return false;
        }
        catch(InputMismatchException e){
            return false;
        }
        catch(SQLException e){
            return false;
        }
    }
}