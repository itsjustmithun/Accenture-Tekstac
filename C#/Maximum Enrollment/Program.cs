using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProgFundamentals10           //DO NOT CHANGE the name of namespace
{
    public class Program              //DO NOT CHANGE the name of class 'Program'
    {
        public static void Main(string[] args)     //DO NOT CHANGE 'Main' Signature
        {
            
            //Implement your code here
            Console.WriteLine("Total students placed in CS : ");
            int cs=int.Parse(Console.ReadLine());
            Console.WriteLine("Total students placed in MECH : ");
            int mech=int.Parse(Console.ReadLine());
            Console.WriteLine("Total students placed in MET : ");
            int met=int.Parse(Console.ReadLine());
            
            if(cs>=mech && cs>=met){
                Console.WriteLine("Highest Placement CS");
            }
            if(mech>=cs &&mech>=met){
                Console.WriteLine("Highest Placement MECH");
            }
            if(met>=cs && met>=mech){
                Console.WriteLine("Highest Placement MET");
            }
        }
    }
}
