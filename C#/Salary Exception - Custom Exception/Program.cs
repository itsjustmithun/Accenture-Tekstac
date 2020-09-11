using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

public class Program         //Do not change the class name
{
        static void Main(string[] args)    //Do not change the method signature
        {
           //Impment code here
           Console.WriteLine("Enter Id:");
           int id=Convert.ToInt32(Console.ReadLine());
           Console.WriteLine("Enter name:");
           string name=Console.ReadLine();
           Console.WriteLine("Enter salary:");
           double sal=Convert.ToDouble(Console.ReadLine());
           Console.WriteLine("Enter the increment amount:");
           double inc=Convert.ToDouble(Console.ReadLine());
           Employee e=new Employee();;
           e.Id=id;
           e.Name=name;
           e.Salary=sal;
           double res=e.UpdateSalary(inc);
           
           {
               Console.WriteLine("Employee Details\nId : {0}\nName : {1}\nSalary : {2}",id,name,sal);
           }
        }
}
    
    
//Implement class 'ImproperSalaryUpdationException' of type 'Exception'
public class ImproperSalaryUpdationException : Exception{
    public override string ToString(){
        return "Modified salary should always be greater than the old salary";
    }
}