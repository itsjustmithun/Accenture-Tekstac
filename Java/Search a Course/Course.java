import java.util.*;
public class Course{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String[] name=new String[20];
        System.out.println("Enter no of course:");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("Invalid Range");
        }
        else{
            System.out.println("Enter course names:");
            for(int i=0;i<=n;i++){
                name[i]=sc.nextLine();
            }
            System.out.println("Enter the course to be searched:");
            String key=sc.nextLine();
            if(check(name,key)==true){
                System.out.println(key+" course is available");
            }
            else{
                System.out.println(key+" course is not available");
            }
        }
    }
    public static boolean check(String[] name, String key){
            //boolean found=Arrays.stream(name).anyMatch(t -> t.equals(key));
            return Arrays.asList(name).contains(key);
        }
}
    