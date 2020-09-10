
using System;
using System.Collections.Generic;

/** DO NOT alter/delete this partial code snippet. This is given for your reference **/

public  class Customer
{
    int id;
    String name;
    String city;

    public int Id { get; set; }
    public String Name { get; set; }
    public String City { get; set; }

    public override string ToString()
    {
        return Id + " " + Name + " " + City;
    }

}

public class Program     //DO NOT change the class name
{
    
    public static void Main(string[] args)     //DO NOT change the 'Main' method signature
        {
            //code need to be written
            CustomerUtility cu=new CustomerUtility();
            int ch=0,id;
            List<Customer> l;
            while(ch!=5){
                Console.WriteLine("1. Add Customer\n2. Display Customer\n3. Search Customer\n4.Delete Customer\n5.Exit\nEnter Your Choice");
                ch=Convert.ToInt32(Console.ReadLine());
                switch(ch){
                    case 1:{
                        Customer obj=new Customer();
                        Console.WriteLine("Enter Customer id, name and city");
                        obj.Id=Convert.ToInt32(Console.ReadLine());
                        obj.Name=Console.ReadLine();
                        obj.City=Console.ReadLine();
                        l=cu.AddCustomer(obj);
                        break;
                    }
                    case 2:{
                        cu.DisplayAllCustomers();
                        break;
                    }
                    case 3: {
                        Console.WriteLine("Enter Customer Id");
                        id=Convert.ToInt32(Console.ReadLine());
                        Console.WriteLine(cu.SearchCustomerByID(id));
                        break;
                    }
                    case 4:{
                        id=Convert.ToInt32(Console.ReadLine());
                        cu.DeleteCustomer(id);
                        break;
                    }
                    case 5:break;
                }
            }
        }
}

//Implement the additional required code

public class CustomerUtility{
    private List<Customer> custList=new List<Customer>();
    public List<Customer> CustList{
        set{
            custList=value;
        }
        get{
            return custList;
        }
    }
    public List<Customer> AddCustomer(Customer c){
        custList.Add(c);
        return custList;
    }
    public Customer SearchCustomerByID(int id){
        Customer f=null;
        foreach(Customer x in custList){
            if(x.Id==id)
                f=x;
        }
        return f;
    }
    public void DisplayAllCustomers(){
        foreach(Customer o in custList)
            Console.WriteLine(o);
    }
    public void DeleteCustomer(int id){
        foreach(Customer o in custList){
            if(o.Id==id){
                custList.Remove(o);
                break;
            }
        }
    }
}
