import java.util.*;
class Triangle{
    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for side1");
        a=sc.nextInt();
        System.out.println("Enter the value for side2");
        b=sc.nextInt();
        System.out.println("Enter the value for side3");
        c=sc.nextInt();
        if(a<=0 || b<=0 || c<=0){
            System.out.println("Invalid Input");
            return;
        }
        else{
            if((a+b)>c && (a+c)>b && (b+c)>a)
                System.out.println("Sides form a Triangle");
            else
                System.out.println("Sides does not form a Triangle");
        }
    }
}