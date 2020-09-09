using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DelegateTemplate          //Do not change the namespace name
{
    public class DelegateDriver    //Do not change the class name
    {
        //Do not change this static variable 
        static List<Employee> empList = new List<Employee>() {  new Employee{ Id = 101, Name = "Amanda", Level = "L2", Dept = "Admin" },
                                                                new Employee { Id = 102, Name = "Patrick", Level = "L1", Dept = "Products" },
                                                                new Employee { Id = 103, Name = "Tracy", Level = "L3", Dept = "Network" },
                                                                new Employee { Id = 104, Name = "Wilson", Level = "L4", Dept = "Integration" },
                                                                new Employee { Id = 105, Name = "Harry", Level = "L4", Dept = "Foundation" }};
        
        //Declare  'findEmployee' of type Predicate Delegate with 'String' generics type HERE.
        Predicate<String> findEmployee = findMatch;
        
        static void Main(string[] args)
        {
            DelegateDriver pd = new DelegateDriver();
            
           //Implement ANY required code here 
           Console.WriteLine("Enter Employee Level");
           string level=Console.ReadLine();
           if(pd.findEmployee(level))
                Console.WriteLine("true");
            else
                Console.WriteLine("false");
        }

        // Implement the handler method
        public static bool findMatch(string level){
            foreach(var a in empList){
                if(level.Equals(a.Level))
                    return true;
            }
            return false;
        }
    }
}
