import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;
public class AccountTest{
    static Account a=null;
    @org.junit.Test
    public void testwithdraw1(){
        a=new Account(1,"Saving",10000);
        boolean b=a.withdraw(5000);
        assertTrue(b);
    }
    @org.junit.Test
    public void testwithdraw2(){
        a=new Account(2,"Saving",0);
        boolean b=a.withdraw(500);
        assertFalse(b);
    }
    @org.junit.Test
    public void testwithdraw3(){
        a=new Account(3,"Saving",5000);
        boolean b=a.withdraw(6000);
        assertFalse(b);
    }
    @org.junit.Test
    public void testdeposit1(){
        a=new Account(4,"Saving",500);
        boolean b=a.deposit(500);
        assertTrue(b);
    }
    @org.junit.Test 
    public void testdeposit2(){
        a=new Account(5,"Saving",0);
        boolean b=a.deposit(-500);
        assertFalse(b);
    }
}