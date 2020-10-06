import java.util.*;
class EvenNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size;
        String str="";
        System.out.println("Enter the size of an array:");
        size=sc.nextInt();
        if(size<=0){
            System.out.println("Invalid array size");
        }
        else{
            int arr[]=new int[size];
            //int rem;
            System.out.println("Enter the array elements:");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<size;i++){
                if(arr[i]<=9 && arr[i]>=0){
                    if(arr[i]%2==0){
                            str=str.concat(Integer.toString(arr[i]));
                    }
                }
            }
            if(str.equals(""))
                System.out.println("Single digit even number is not found in the array");
            else
                System.out.println(Integer.parseInt(str));
        }
    }
}