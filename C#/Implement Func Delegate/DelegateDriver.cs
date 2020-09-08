using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DelegateTemplate  //DO NOT change the namespace name
{
    public class DelegateDriver   //DO NOT change the class name
    {
       
        public Func<int, Employee> findEmployee = checkList;//Complete the declaration

        static List<Employee> permEmpList = new List<Employee> { new Employee(101, "Kevin", "Manager", "Permanent"),
                                                          new Employee(102, "Prestine", "IT Support", "Permanent"),
                                                          new Employee(103, "Bishop", "Front Desk", "Permanent"),
                                                          new Employee(104, "Nancy", "Developer", "Permanent")};

        static List<Employee> tempEmpList = new List<Employee> { new Employee(501, "William", "Architect", "Temporary"),
                                                          new Employee(502, "Alan", "Tester", "Temporary"),
                                                          new Employee(503, "Grace", "Designer", "Temporary"),
                                                          new Employee(504, "Watson", "Designer", "Temporary")};
       
       
        public static void Main(string[] args)   //DO NOT change the 'Main' method signature
        {
            //Fill code here
            Employee newEmployee =checkList(101);
        }

        /*** Methods for Func ****/
        public static Employee checkList(int id) 
        {
            //Fill code here
            Employee newEmployee=null;
            foreach(Employee permanentEmployee in permEmpList){
                if(id.Equals(permanentEmployee.id)){
                    newEmployee=permanentEmployee;
                    break;
                }
            }
            foreach(Employee temporaryEmployee in tempEmpList){
                if(id.Equals(temporaryEmployee.id)){
                    newEmployee=temporaryEmployee;
                    break;
                }
            }
            return newEmployee;
        }
        /***** End of Func methods ******/

    }
}
