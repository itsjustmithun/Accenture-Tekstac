import java.util.*;
class Sum{
    static int getMin(int arr[], int n){
        int res=arr[0];
        for(int i=1;i<n;i++)
            res=Math.min(res,arr[i]);
        return res;
    }
    static int getMax(int arr[],int n){
        int res=arr[0];
        for(int i=1;i<n;i++)
            res=Math.max(res,arr[i]);
        return res;
    }
    static int findSum(int arr[],int n){
        int min=getMin(arr,n);
        int max=getMax(arr,n);
        return min+max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[100];
        System.out.println("Enter the size of an array:");
        int n=sc.nextInt();
        if(n>0){
            System.out.println("Enter the elements:");
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
            }
            System.out.println(findSum(a,n));
        }
        else{
            System.out.println("Invalid Array Size");
        }
    }
}