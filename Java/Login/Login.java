import java.util.*;
public class Login{
    private String  userName;
    private String password;
    public Login(String u, String p){
        this.userName = u;
        this.password = p;
    }
    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }
    public boolean validate(){
        String u,p,j="john", a="123abc";
        u=getUserName();
        p=getPassword();
        if(u.equals(j) && p.equals(a))
         return true;
        else
            return false;
    }
    public static void main(String[] args){
        String u="", p="";
        boolean b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the username:");
        u=s.next();
        System.out.println("Enter the password:");
        p=s.next();
        Login l=new Login(u,p);
        b=l.validate();
        if(b==true){
            System.out.println("Valid user");
            return;
        }
        else{
            System.out.println("Invalid user");
            return;
        }
    }
}