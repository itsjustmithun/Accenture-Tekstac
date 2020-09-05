import java.util.*;
class NumToMonth{
    public static void main(String args[]){
        String a[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        Scanner sc=new Scanner(System.in);
        int i;
        i=sc.nextInt();
        if(i>=1 && i<=12){
            System.out.println(a[i-1]);
        }
        else
            System.out.println("No month for the number "+i);
    }
}
