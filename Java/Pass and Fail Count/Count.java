import java.util.*;
public class Count{
    public static void main(String[] args){
        int c=0,f=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of subjects:");
        int n=sc.nextInt();
        int arr[]=new int[20];
        if(n>0){
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                if(arr[i]>=50){
                    c+=1;
                }
                if(arr[i]<50){
                    f++;
                }
            }
            if(c==n)
                System.out.println("Ram passed in all subjects");
            else if(f==n)
                System.out.println("Ram failed in all subjects");
            else
                System.out.println("Ram passed in "+c+" subjects and failed in "+f+" subjects");
        }
        else{
            System.out.println("Invalid input range");
        }
    }
}