import java.util.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class FlightManagementSystem{
    public boolean deleteFlight(int flightId){
        DB db=new DB();
        try{
            Connection conn=db.getConnection();
            Statement st=conn.createStatement();
            String q="delete from flight where flightId="+flightId;
            int status=st.executeUpdate(q);
            if(status>0){
                return true;
            }
            else{
                return false;
            }
        }
        catch(SQLException e){
            System.out.println("SQL Exception");
            return false;
        }
        catch(Exception e){
            System.out.println("Error");
            return false;
        }
        
    }
}