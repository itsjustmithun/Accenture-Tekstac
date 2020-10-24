public class Student{
    private int studentId;
    private String studentName, studentAddress, collegeName;
    public int getStudentId(){
        return studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public String getStudentAddress(){
        return studentAddress;
    }
    public String getCollegeName(){
        return collegeName;
    }
    public void setStudentId(int id){
        this.studentId=id;
    }
    public void setStudentName(String name){
        this.studentName = name;
    }
    public void setStudentAddress(String add){
        this.studentAddress=add;
    }
    public void setCollegeName(String col){
        this.collegeName=col;
    }
    public Student(int studentId, String studentName, String studentAddress, String collegeName){
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentAddress=studentAddress;
        this.collegeName=collegeName;
    }
    public Student(int studentId, String studentName, String studentAddress){
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentAddress=studentAddress;
        this.collegeName="NIT";
    }
}