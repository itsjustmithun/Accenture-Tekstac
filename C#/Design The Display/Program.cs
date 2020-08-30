using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FunctionEx1              //DO NOT Change the namespace name
{
    public class Program           //DO NOT Change the class 'Program' name
    {
                                       
        public static void Main(string[] args)  //DO NOT Change 'Main' method signature
        {
            //Implement the code here
            Console.WriteLine("Enter the Company Name");
            string cname=Console.ReadLine();
            Console.WriteLine("Enter the Employee Name");
            string ename=Console.ReadLine();
            Console.WriteLine("Enter the Project Name");
            string pname=Console.ReadLine();
            Console.WriteLine("Enter the Year");
            int y=Convert.ToInt32(Console.ReadLine());
            headerMessage(cname);
            Console.WriteLine(ename);
            Console.WriteLine(pname);
            footerMessage(y);

        }

        //Implement the required methods. Keep ALL the methods 'public' and 'static'
        public static void headerMessage(string company){
            Console.WriteLine("{0} Employee Information",company);
        }
        public static void footerMessage(int year){
            Console.WriteLine("CopyRight {0}.\nAll Rights Reserved",year);
        }
        public static void entireMessage(string company,string name,string pname,int year){
            Console.WriteLine("{0} Employee Information",company);
            Console.WriteLine(name);
            Console.WriteLine(pname);
            Console.WriteLine("CopyRight {0}.\nAll Rights Reserved",year);
        }
    }
}
