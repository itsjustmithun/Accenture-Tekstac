import java.util.*;
import java.sql.*;
public class FlightManagementSystem{
    public Flight viewFlightById(int flightId){
        DB db = new DB();
        Flight f=null;
        try{
            Connection con=db.getConnection();
            PreparedStatement p=con.prepareStatement("select * from Flight where flightId = ?");
            p.setInt(1,flightId);
            ResultSet rs=p.executeQuery();
            if(rs.next()){
                return new Flight(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getDouble(5));
            }
            con.close();
        }
        catch(SQLException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        return f;
    }
}