import java.util.*;
public class ArrayException{
    public String getPriceDetails(){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter the number of elements in the array");
            int n=sc.nextInt();
            int a[]=new int[n];
            System.out.println("Enter the price details");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("Enter the index of the array element you want to access");
            int s=sc.nextInt();
            return "The array element is "+a[s];
        }
        catch(ArrayIndexOutOfBoundsException e){
            return "Array index is out of range";
        }
        catch(InputMismatchException e){
            return "Input was not in the correct format";
        }
    }
    public static void main(String[] args){
        ArrayException a=new ArrayException();
        a.getPriceDetails();
    }
}