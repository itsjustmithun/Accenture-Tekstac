import java.util.*;
import java.io.*;

class RegistrationDetails{
    public static void main(String[] args) throws IOException{
        String name, qual,email, ph;
        int age;
        float exp;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:");
        name=br.readLine();
        System.out.println("Enter your age:");
        age=Integer.parseInt(br.readLine());
        System.out.println("Enter your phoneno:");
        ph=br.readLine();
        System.out.println("Enter your qualification:");
        qual=br.readLine();
        System.out.println("Enter your email id[Please provide valid id, after registering your registration id will be mailed]:");
        email=br.readLine();
        System.out.println("Enter your noofexperience[if any]");
        exp = Float.parseFloat(br.readLine());
        System.out.println("Dear "+name+", Thanks for registering in our portal, registration id will be mailed to "+email+" within 2 working days");
        
    }
}