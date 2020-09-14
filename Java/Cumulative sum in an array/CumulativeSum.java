import java.util.*;
class CumulativeSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[20];
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("Invalid Range");
        }
        else{
            System.out.println("Enter the elements");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                //System.out.println(a[i]);
            }
            //for(int j=0;j<n;j++)
            //    System.out.println(a[j]);
            int[] out=new int[n];
            out[0]=a[0];
            for(int i=1;i<out.length;i++)
                out[i]=out[i-1]+a[i];
            for(int i=0;i<out.length;i++)
                System.out.print(out[i]+" ");
        }
    }
}