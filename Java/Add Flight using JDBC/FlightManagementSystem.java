import java.sql.*;
public class FlightManagementSystem{
    public boolean addFlight(Flight flightObj){
        DB db=new DB();
        try{
            Connection con=db.getConnection();
            Statement st=con.createStatement();
            
            int i=flightObj.getFlightId();
            String s=flightObj.getSource();
            String d=flightObj.getDestination();
            int n=flightObj.getNoOfSeats();
            double f=flightObj.getFlightFare();
            
            String q="insert into Flight values("+i+",'"+s+"','"+d+"',"+n+","+f+")";
            int status=st.executeUpdate(q);
            con.close();
            if(status>0){
                System.out.println("Done");
                return true;
            }
            else
                return false;
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
            return false;
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}