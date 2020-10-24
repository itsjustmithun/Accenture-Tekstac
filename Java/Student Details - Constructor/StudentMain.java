import java.util.*;
public class StudentMain{
    public static void main(String args[]){
        int id=0,fid;
        String name="",addr="",col="",nit,fname,faddr,fcol;
        Scanner s = new Scanner(System.in);
        Student a = new Student(id,name,addr,col);
        Student b = new Student(id,name,addr);
        System.out.println("Enter Student's Id:");
        id = s.nextInt();
        a.setStudentId(id);
        b.setStudentId(id);
        System.out.println("Enter Student's Name:");
        name = s.next();
        a.setStudentName(name);
        b.setStudentName(name);
        System.out.println("Enter Student's address:");
        addr=s.next();
        a.setStudentAddress(addr);
        b.setStudentAddress(addr);
        System.out.println("Whether the student is from NIT(Yes/No):");
        nit=s.next();
        if(nit == "No" || nit == "NO" || nit == "no"){
            System.out.println("Enter the college name:");
            col=s.next();
            a.setCollegeName(col);
            fid=a.getStudentId();
            fname = a.getStudentName();
            faddr=a.getStudentAddress();
            fcol=a.getCollegeName();
            System.out.println("Student id:"+fid);
            System.out.println("Student name:"+fname);
            System.out.println("Address:"+faddr);
            System.out.println("College name"+fcol);
        }
        else if(nit == "Yes" || nit=="YES" || nit=="yes"){
            fid=b.getStudentId();
            fname=b.getStudentName();
            faddr=b.getStudentAddress();
            System.out.println("Student id:"+fid);
            System.out.println("Student name:"+fname);
            System.out.println("Address:"+faddr);
        }
        else
            System.out.println("Wrong Input");
    }
}