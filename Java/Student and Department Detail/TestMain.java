import java.util.*;
public class TestMain{
    public static Student createStudent(){
        Scanner sc = new Scanner(System.in);
        Student s=new Student();
        Department d=new Department();
        System.out.println("Enter the Department id:");
        d.setDid(sc.nextInt());
        System.out.println("Enter the Department name:");
        d.setDname(sc.next());
        System.out.println("Enter the Student id:");
        s.setSid(sc.nextInt());
        System.out.println("Enter the Student name:");
        s.setSname(sc.next());
        s.setDepartment(d);
        return s;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Department d=new Department();
        Student obj;
        obj=createStudent();
        System.out.println("Department id:"+obj.getDepartment().getDid());
        System.out.println("Department name:"+obj.getDepartment().getDname());
        System.out.println("Student id:"+obj.getSid());
        System.out.println("Student name:"+obj.getSname());
    }
}