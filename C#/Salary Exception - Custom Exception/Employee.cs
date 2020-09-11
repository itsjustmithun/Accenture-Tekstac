using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

public class Employee      //Do not change the class name
{
        //fields
        private int id;
        private String name;
        private double salary;
        
        //properties
        public int Id{
            get { return id; }
            set { id = value; }
        }   
        public String Name{
            get { return name; }
            set { name = value; }
        }
        public double Salary{
            get { return salary; }
            set { salary = value; }
        }
    
    
    public double UpdateSalary(double increment)
    {
        //Impment code here. Throw the required exception.
        double total=Salary+increment;
        if(total!=Salary)
            return total;
        else
            throw new ImproperSalaryUpdationException();
    }
    
}	 	  	      	    	  	        	 	
    
