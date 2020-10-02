import java.util.*;
public class InterchangeArray{
    public static void main(String[] args){
        int[] first=new int[20];
        int[] second=new int[20];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the first array :");
        int no=sc.nextInt();
        if(no<=0 ||no>20){
            System.out.println("Invalid range");
        }
        else if(no<=20){
            System.out.println("Enter the elements in the first array");
            for(int i=0;i<no;i++){
                first[i]=sc.nextInt();
            }
            System.out.println("Enter the number of elements in the second array :");
            int no1=sc.nextInt();
            if(no1<=0 || no1>20)
                System.out.println("Invalid range");
            else if(no1!=no)
                System.out.println("Unable to swap size differs");
            else{
                System.out.println("Enter the elements in the second array");
                for(int i=0;i<no1;i++){
                    second[i]=sc.nextInt();
                }
                for(int i=0;i<no;i++){
                    first[i]=first[i]+second[i];
                    second[i]=first[i]-second[i];
                    first[i]=first[i]-second[i];
                }
                System.out.println("The first array after swapping is :");
                for(int i=0;i<no;i++){
                    if(i==(no-1))
                        System.out.print(first[i]);
                    else
                        System.out.print(first[i]+" ");
                }
                System.out.println();
                System.out.println("The second array after swapping is :");
                for(int i=0;i<no1;i++){
                    if(i==(no1-1))
                        System.out.print(second[i]);
                    else    
                        System.out.print(second[i]+" ");
                }
            }
        }
    }
}