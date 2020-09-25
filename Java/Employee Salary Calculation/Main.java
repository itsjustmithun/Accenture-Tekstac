import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Employee emp = getEmployeeDetails();
        int pfp=getPFPercentage();
        emp.calculateNetSalary(pfp);
        System.out.println("Id : "+emp.getEmployeeId());
        System.out.println("Name : "+emp.getEmployeeName());
        System.out.println("Salary : "+emp.getSalary());
        System.out.println("Net Salary : "+emp.getNetSalary());
    }
    public static Employee getEmployeeDetails(){
        Scanner sc=new Scanner(System.in);
        int id,pfp;
        String name;
        double sal;
        System.out.println("Enter Id:");
        id=sc.nextInt(); sc.nextLine();
        System.out.println("Enter Name:");
        name=sc.nextLine();
        System.out.println("Enter salary:");
        sal=sc.nextDouble();
        
        Employee emp=new Employee();
        emp.setEmployeeId(id);
        emp.setEmployeeName(name);
        emp.setSalary(sal);
        return emp;
    }
    public static int getPFPercentage(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter PF percentage:");
        int pfp=sc.nextInt();
        return pfp;
    }
}