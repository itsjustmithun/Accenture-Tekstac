import java.util.*;
public class StudentMain{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id:");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name:");
        String name=sc.nextLine();
        System.out.println("Enter the no of subjects:");
        int n=sc.nextInt();
        int marks[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the mark for subject "+(i+1)+":");
            marks[i]=sc.nextInt();
        }
        Student s=new Student();
        s.setName(name);
        s.setId(id);
        s.setMarks(marks);
        s.calculateAvg();
        s.findGrade();
        System.out.println("Id:"+s.getId());
        System.out.println("Name:"+s.getName());
        System.out.println("Average:"+s.getAverage());
        System.out.println("Grade:"+s.getGrade());
    }
}