import java.util.*;
public class Highestmark{
    public static void main(String[] args) throws Exception{
        int arr[]=new int[7];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=5;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<0){
                System.out.println("Invalid mark");
                System.exit(1);
            }
        }
        System.out.println("Highest mark is "+high(arr));
    }
    static int high(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
            if(arr[i]>max)
                max=arr[i];
       return max;
    }
}