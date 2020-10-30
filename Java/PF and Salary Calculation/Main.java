import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=sc.nextLine();
        System.out.println("Enter the salary:");
        float salary=sc.nextFloat();
        System.out.println("Enter the pfpercentage:");
        float per=sc.nextFloat();
        boolean d1=true;
        PermanentEmployee p1=new PermanentEmployee();
        p1.setName(name);
        p1.setSalary(salary);
        p1.setPfpercentage(per);
        d1=p1.validateInput();
        if(d1==true){
            p1.findNetSalary();
            System.out.println("Employee Name:"+p1.getName());
            System.out.println("PF Amount:"+String.format("%.2f",p1.getPfamount()));
            System.out.println("Netsalary:"+String.format("%.2f",p1.getNetsalary()));
        }
        else
            System.out.println("Error!!! Unable to calculate the NetSalary.");
    }
}