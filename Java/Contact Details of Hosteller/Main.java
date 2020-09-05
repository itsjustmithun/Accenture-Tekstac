import java.util.*;
import java.lang.String;
public class Main{
    public static Hosteller getHostellerDetails(){
        Hosteller h=new Hosteller();
        Scanner sc=new Scanner(System.in);
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Details");
        System.out.println("Student Id");
        int studentId=sc.nextInt();
        System.out.println("Student Name");
        String name=in.nextLine();
        System.out.println("Department Id");
        int departmentId=sc.nextInt();
        System.out.println("Gender");
        String gender=sc.next();
        sc.nextLine();
        System.out.println("Phone Number");
        String phone=sc.nextLine();
        System.out.println("Hostel name");
        String hostelName=sc.next();
        System.out.println("Room Number");
        int roomNumber=sc.nextInt();
        h.setStudentId(studentId);
        h.setName(name);
        h.setDepartmentId(departmentId);
        h.setGender(gender);
        h.setPhone(phone);
        h.setHostelName(hostelName);
        h.setRoomNumber(roomNumber);
        return h;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Hosteller t=getHostellerDetails();
        System.out.println("Modify Room Number(Y/N");
        char i=sc.next().charAt(0);
        if(i=='Y'){
            System.out.println("New Room Number");
            int roomNumber=sc.nextInt();
            t.setRoomNumber(roomNumber);
        }
        System.out.println("Modify Phone Number(Y/N)");
        char j=sc.next().charAt(0);
        if(j=='Y'){
            System.out.println("New Phone Number");
            String phone=sc.next();
            t.setPhone(phone);
        }
        System.out.println();
        System.out.println("The Students Details");
        System.out.println(t.studentId+" "+t.name+" "+t.departmentId+" "+t.gender+" "+t.phone+" "+t.getHostelName()+" "+t.getRoomNumber());
        
    }
}