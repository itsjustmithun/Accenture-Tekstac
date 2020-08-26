using System;
public class Program{
    public static void Main(String[] args){
        Console.WriteLine("Enter account id");
        int id=Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Enter account type");
        string accountType=Console.ReadLine();
        Console.WriteLine("Enter account balance");
        double balance=Convert.ToDouble(Console.ReadLine());
        Accounts a2=new Accounts(id,accountType,balance);
        string str2=a2.GetDetails();
        Console.WriteLine(str2);
    }
}
public class Accounts{
    private int id;
    private string accountType;
    private double balance;
    public Accounts(){
        this.id=0;
        this.accountType=null;
        this.balance=0;
    }
    public Accounts(int id, string accountType,double balance){
        this.id=id;
        this.accountType=accountType;
        this.balance=balance;
    }
    public int Id{
        set{
            id=value;
        }
        get{
            return id;
        }
    }
    public string AccountType{
        set{
            accountType=value;
        }
        get{
            return accountType;
        }
    }
    public double Balance{
        set{
            if(value<0){
                balance=0;
            }
            else{
                balance=value;
            }
        }
        get{
            return balance;
        }
    }
    public bool Withdraw(double amount){
        if(balance>=amount){
            Balance=Balance-amount;
            return true;
        }
        else{
            return false;
        }
    }
    public string GetDetails(){
        string str=string.Format("Account Id: {0}\nAccount Type: {1}\nBalance: {2}",id,accountType,balance);
        return str;
    }
}