import static org.junit.Assert.*;
import org.junit.*;

public class EmployeeTest{
    Employee e=null;
    @org.junit.Test
    public void testCalNetPay1() {
        e=new Employee(1,"Tushar",45000.0,2.0);
        assertEquals(45000.0,e.calNetPay(),0);
    }
    @org.junit.Test
    public void testCalNetPay2(){
        e=new Employee(2,"RAHSUT",10000.0,10.0);
        assertEquals(9000.0,e.calNetPay(),0);
    }
}