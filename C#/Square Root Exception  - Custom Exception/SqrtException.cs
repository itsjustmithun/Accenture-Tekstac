using System;
using System.Text;
using System.Collections;

public class SqrtException
{
    
   public static void Main(string[] args)
   {
       //Implement your code here
       SqrtException s =new SqrtException();
       double number;
       double sqrt;
       try{
           Console.WriteLine("Input a number");
           number=Convert.ToDouble(Console.ReadLine());
           sqrt=s.FindSquareRoot(number);
           Console.WriteLine(sqrt);
       }
       catch(FormatException){
           Console.WriteLine("Input string was not in a correct format");
       }
       
   }
   
   //Implement your method here 
   public double FindSquareRoot(double Number){
       if(Number<0)
            throw new ApplicationException();
        return Math.Sqrt(Number);
   }
}
public class ApplicationException : Exception{
    public override string ToString(){
        return "Number can't be negative";
    }
}

//Implement your user defined exception class here 