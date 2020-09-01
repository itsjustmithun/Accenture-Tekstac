import java.util.*;
public class CompatibleArrays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a1[]=new int[100];
        int a2[]=new int[100];
        boolean equal=true;
        System.out.println("Enter the size for First array:");
        int n1=sc.nextInt();
        if(n1<=0){
            System.out.println("Invalid array size");
        }
        else{
            System.out.println("Enter the elements for First array:");
            for(int i=0;i<n1;i++){
                a1[i]=sc.nextInt();
            }
            System.out.println("Enter the size for Second array:");
            int n2=sc.nextInt();
            if(n2<=0){
                System.out.println("Invalid array size");
                System.exit(1);
            }
            System.out.println("Enter the elements for Second array:");
            for(int j=0;j<n2;j++){
                a2[j]=sc.nextInt();
            }
            if(n1==n2){
                for(int i=0;i<n1;i++){
                    if(a1[i]<a2[i]){
                        equal=false;
                    }
                }
            }
            else{
                equal=false;
            }
            if(equal){
                System.out.println("Arrays are Compatible");
            }
            else{
                System.out.println("Arrays are Not Compatible");
            }
        }
    }
}