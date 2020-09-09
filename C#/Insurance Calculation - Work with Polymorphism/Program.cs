using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;
namespace InsuranceDetails //DO NOT Change namespace name
    {
     public class Program      //DO NOT Change class 'Program' name
        {
            public static void Main(string[] args)
            {
               Console.Write("Insurance Number : ");
               string no=Console.ReadLine();
               Console.WriteLine();
              Console.Write("Insurance Name : ");
               string name=Console.ReadLine();
               Console.WriteLine();
               Console.Write("Amount Covered : ");
               double a=Convert.ToDouble(Console.ReadLine());
               Console.WriteLine();
               Program pr=new Program();
               double premiun=0.0;
               Insurance ob;
               Console.WriteLine("Select");
               Console.WriteLine("1.Life Insurance");
               Console.Write("2.Motor Insurance : ");
               int ch=Convert.ToInt32(Console.ReadLine());
               Console.WriteLine();
               switch(ch){
                   case 1:Console.Write("Policy Term : ");
                  int p=Convert.ToInt32(Console.ReadLine());
                   Console.WriteLine();
                 Console.Write("Benefit Percent : ");
              float n=float.Parse(Console.ReadLine());
               Console.WriteLine();
                ob=new LifeInsurance();
                ob.InsuranceNo=no;
               ob.InsuranceName=name;
               ob.AmountCovered=a;
               ((LifeInsurance)ob).PolicyTerm=p;
               ((LifeInsurance)ob).BenefitPercent=n;
             premiun=pr.addPolicy(ob,ch);
             break;
             case 2:Console.Write("Depreciation Percent : ");
                   float d=float.Parse(Console.ReadLine());
                   Console.WriteLine();
               ob=new MotorInsurance();
                ob.InsuranceNo=no;
               ob.InsuranceName=name;
               ob.AmountCovered=a;
               ((MotorInsurance)ob).Idv=0;
               ((MotorInsurance)ob).DepPercent=d;
             premiun=pr.addPolicy(ob,ch);
            break;
             }
             Console.WriteLine("Calculated Premium : "+premiun);
              
           }
          public double addPolicy(Insurance ins,int opt){
              if(opt==1)
             return ((LifeInsurance)ins).calculatePremium();
              else
              return ((MotorInsurance)ins).calculatePremium();
              }
               
        }
   }