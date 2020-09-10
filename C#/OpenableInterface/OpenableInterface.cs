using System;
interface IOpenable
{string OpenSesame();}
public class TreasureBox:IOpenable{
    public string OpenSesame(){
        return "Congratulations, Here is your lucky win";
    }
}
public class Parachute:IOpenable{
    public string OpenSesame(){
        return "Have a thrilling experience flying in air";
    }
}
public class Program{
    public static void Main(){
        Console.WriteLine("Enter the letter found in the paper");
        char c=Console.ReadLine()[0];
        if(c=='T' || c=='t')
            Console.WriteLine(new TreasureBox().OpenSesame());
        if(c=='P' || c=='p')
            Console.WriteLine(new Parachute().OpenSesame());
    }
}