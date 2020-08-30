using System;

public class Calculator      //Do not change the class name
{
    public static void Main(String[] args)
    {
        //Implement Code Here
        Calculator c =new Calculator();
        Console.WriteLine("Enter Num1");
        int num1=Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Enter Num2");
        int num2=Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Enter Operator");
        string op=Console.ReadLine();
        
        if(op.Equals("+")){
            Console.WriteLine(c.Addition(num1,num2));
        }
        else if(op.Equals("-")){
            Console.WriteLine(c.Subtraction(num1,num2));
        }
        else if(op.Equals("*")){
            Console.WriteLine(c.Multiply(num1,num2));
        }
        else if(op.Equals("/")){
            Console.WriteLine(c.Divide(num1,num2));
        }
        else{
            throw new InvalidOperatorException();
        }
    }
    public int Addition(int num1,int num2)
    {
        //Implement Code Here
        return num1+num2;
    }
    public int Subtraction(int num1,int num2)
    {
        //Implement Code Here
        return num1-num2;
    }
    public int Multiply(int num1,int num2)
    {
        //Implement Code Here
        return num1*num2;
    }
    public int Divide(int num1,int num2)
    {
        //Implement Code Here
        return num1/num2;
    }
}

//Implement class InvalidOperatorException of type 'Exception'
public class InvalidOperatorException : Exception{
    public override string ToString(){
        return "Invalid Operator";
    }
}