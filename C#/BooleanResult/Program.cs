using System;
class Program
{
    static void Main(string[] args)
    {
            Console.WriteLine("Enter the value for x");
            //Implement code here
            int x = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter the value for y");
            //Implement code here
            int y=Convert.ToInt32(Console.ReadLine());
            //Implement code here
            bool a =true;
            if(x<y){
                a=true;
                Console.WriteLine("x is less than y is "+a.ToString().ToLower());
            }
            else{
                a=false;
                Console.WriteLine("x is less than y is "+a.ToString().ToLower());
            }
            Console.ReadKey();
  
    }
}