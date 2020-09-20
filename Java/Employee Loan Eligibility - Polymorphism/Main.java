import java.util.Scanner;
public class Main{
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            Employee obj2=new PermanentEmployee(25,"bala",25000);
            Employee obj3=new TemporaryEmployee(25,"bala",1000,12);
            Loan lol=new Loan();
            obj2.calculateSalary();
            obj3.calculateSalary();
            double q=lol.calculateLoanAmount(obj2);
            double w=lol.calculateLoanAmount(obj3);
            System.out.println("p = "+obj2.getSalary()+" "+q);
            System.out.println("t = "+obj3.getSalary());
    }
    
}