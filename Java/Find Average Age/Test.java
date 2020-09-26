import java.util.*;
public class Test{
    public static void main(String[] args){
        int num;
        Scanner s=new Scanner(System.in);;
        System.out.println("Enter total no.of employees:");
        num=s.nextInt();
        if(num>1){
            double temp=0.0;
            int i=0,avg=0,count=0;
            int[] arr=new int[num];
            System.out.println("Enter the age for "+num+" employees:");
            for(i=0;i<num;i++){
                arr[i]=s.nextInt();
                if(arr[i]>=28 && arr[i]<=40){
                    temp=temp+arr[i];
                }
                else if(arr[i]<28 || arr[i]>40){
                    count++;
                    break;
                }
            }
            if(count!=1){
                temp=temp/num;
                System.out.println("The average age is "+String.format("%.02f",temp));
            }
            else{
                System.out.println("Invalid age encountered!");
            }
        }
        else{
            System.out.println("Please enter a valid employee count");
        }
    }
}