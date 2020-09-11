using System;

public class Register           //Do not change the class name
{
    public static void Main(String[] args)       //Do not change the method signature
    {
        //Implement code here
        Register r=new Register();
        Console.WriteLine("Enter Name");
        String name=Console.ReadLine();
        Console.WriteLine("Enter Age");
        int age=Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Enter Phone");
        long ph=Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Enter City");
        String city=Console.ReadLine();
        
        r.RegisterUser(name,age,ph,city);
        
    }
    public void RegisterUser(String name,int age,long phone,String city)         //Do not change the method signature
    {
        //Implement code here
        if(age<18 || age>60){
            throw new RegisterException();   
        }
        else{
            Console.WriteLine("User Registered");
        }
    }
    
}

//Implemnt class 'RegisterException' of type Exception
public class RegisterException : Exception{
    public override string ToString(){
        return "Sorry. You Cannot Participate";
    }
}