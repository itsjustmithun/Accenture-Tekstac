public class Student{
    protected int studentId;
    protected String name;
    protected int departmentId;
    protected String gender;
    protected String phone;
    public int getStudentId(){
        return this.studentId;
    }
    public void setStudentId(int studentId){
        this.studentId=studentId;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getDepartmentId(){
        return this.departmentId;
    }
    public void setDepartmentId(int departmentId){
        this.departmentId=departmentId;
    }
    public String getGender(){
        return this.gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
}