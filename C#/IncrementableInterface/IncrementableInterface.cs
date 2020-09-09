using System;
public abstract class Employee{
    protected String name;
    protected double salary;
    public Employee(string name, double salary){
        this.salary=salary;
        this.name=name;
    }
    public void Print(){
        Console.WriteLine("Name: {0}\nSalary: {1}",name,salary);
    }
}
public interface Incrementable{
    double Increment();
}
public class Programmer:Employee,Incrementable{
    protected string domain;
    public Programmer(String name,double salary,string domain):base(name,salary){
        this.domain=domain;
    }
    public double Increment(){
        salary=salary+(0.1*salary);
        return salary;
    }
}

public class Manager:Employee,Incrementable{
    private int teamId;
    public int TeamId{
        get{
            return teamId;
        }
        set{
            teamId=value;
        }
    }
    public Manager(string name, double salary,int teamId):base(name,salary){
        this.teamId=teamId;
    }
    public double Increment(){
        salary=salary+(0.5*salary);
        return salary;
    }
}

public class Program{
    public static void Main(string[] args){
        string s,dom;
        double sal,x,y;
        int id;
        Console.WriteLine("Enter the details of Manager");
        s=Console.ReadLine();
        sal=Convert.ToDouble(Console.ReadLine());
        id=Convert.ToInt32(Console.ReadLine());
        Manager m=new Manager(s,sal,id);
        Console.WriteLine("Enter the details of Programmer");
        s=Console.ReadLine();
        sal=Convert.ToDouble(Console.ReadLine());
        dom=Console.ReadLine();
        Programmer p=new Programmer(s,sal,dom);
        x=m.Increment();
        y=p.Increment();
        m.Print();
        p.Print();
    }
}