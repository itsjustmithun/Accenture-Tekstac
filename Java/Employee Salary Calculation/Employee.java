public class Employee{
    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;
    public void setEmployeeId(int id){
        this.employeeId=id;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeName(String name){
        this.employeeName=name;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public void setSalary(double sal){
        this.salary=sal;
    }
    public double getSalary(){
        return salary;
    }
    public void setNetSalary(double net){
        this.netSalary=net;
    }
    public void calculateNetSalary(int pfp){
        double netSalary=salary-(salary*pfp/100);
        setNetSalary(netSalary);
    }
    public double getNetSalary(){
        return netSalary;
    }
}