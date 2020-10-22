public class Student{
    private int sid;
    private String sname;
    private Department department;
    public int getSid(){
        return this.sid;
    }
    public String getSname(){
        return this.sname;
    }
    public Department getDepartment(){
        return this.department;
    }
    public void setSid(int sid){
        this.sid=sid;
    }
    public void setSname(String sname){
        this.sname=sname;
    }
    public void setDepartment(Department department){
        this.department=department;
    }
}