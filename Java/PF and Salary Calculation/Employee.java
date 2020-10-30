public class Employee{
    private String name;
    private float salary;
    private float netsalary;
    public void setName(String a){
        name=a;
    }
    public void setSalary(float b){
        this.salary=b;
    }
    public void setNetsalary(float c){
        this.netsalary=c;
    }
    public String getName(){
        return name;
    }
    public float getSalary(){
        return salary;
    }
    public float getNetsalary(){
        return netsalary;
    }
}