//THIS IS FOR REFERENCE ONLY. YOU ARE NOT REQUIRED TO MAKE ANY CHANGES HERE

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DelegateTemplate
{
    public class Employee
    {
        public int id { get; set; }
        public String ename { get; set; }
        public String designation { get; set; }
        public String empType { get; set; }

        public Employee() { }
        public Employee(int id,String ename,String designation, String empType) {
            this.id = id;
            this.ename = ename;
            this.designation = designation;
            this.empType = empType;
        }
    }
}
