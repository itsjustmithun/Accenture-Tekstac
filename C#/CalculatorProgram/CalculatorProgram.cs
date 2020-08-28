using System;
class CalculatorProgram{
    public int Addition(int a,int b){
        return a+b;
    }
    public int Subtraction(int a,int b){
        return a-b;
    }
    public int Multiplication(int a, int b){
        return a*b;
    }
    public double Division(int a,int b,out double remainder){
        remainder=a%b;
        return a/b;
    }
}
class Program{
    public static void Main(){
        Console.WriteLine("Enter the operator");
        char op=Convert.ToChar(Console.ReadLine());
        Console.WriteLine("Enter the operands");
        int a=Convert.ToInt32(Console.ReadLine());
        int b=Convert.ToInt32(Console.ReadLine());
        CalculatorProgram cp=new CalculatorProgram();
        double rem;
        switch(op){
            case '+':Console.WriteLine("Result of {0} {1} {2} is {3}",a,op,b,cp.Addition(a,b));
                    break;
            case '-':Console.WriteLine("Result of {0} {1} {2} is {3}",a,op,b,cp.Subtraction(a,b));
                    break;
            case '*':Console.WriteLine("Result of {0} {1} {2} is {3}",a,op,b,cp.Multiplication(a,b));
                    break;
            case '/':Console.WriteLine("Result of {0} {1} {2} is {3}",a,op,b,cp.Division(a,b,out rem));
                    Console.WriteLine("Remainder ="+rem);
                    break;
           default:Console.WriteLine("Invalid Operator");
                    break;
        }
    }
}