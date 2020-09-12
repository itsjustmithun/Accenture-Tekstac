using System;
class Program
    {
        static void Main(string[] args)
        {
            //Implement code here
            Console.WriteLine("Enter name");
            string name=Console.ReadLine();
            Console.WriteLine("Enter age");
            int age=System.Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter gender");
            char gender=System.Convert.ToChar(Console.ReadLine());
            Console.WriteLine("Enter city");
            string city=Console.ReadLine();
            Console.WriteLine("Enter mobile number");
            string ph=Console.ReadLine();
            Console.WriteLine("Enter pincode");
            string pin=Console.ReadLine();
            
            Console.WriteLine("Name : {0}",name);
            Console.WriteLine("Age : {0}",age);
            Console.WriteLine("Gender : {0}",gender);
            Console.WriteLine("City : {0}",city);
            Console.WriteLine("Mobile : {0}",ph);
            Console.WriteLine("Pincode : {0}",pin);
        }
                
    }

