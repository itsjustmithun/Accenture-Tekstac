import java.util.*;
public class Calculator
{
    public static Calculate performAddition(){
        Calculate cal=(a,b)->(float)a+(float)b;
        return cal;
    }
    public static Calculate performSubtraction(){
        Calculate cal=(a,b)->(float)a-(float)b;
        return cal;
    }
    public static Calculate performProduct(){
        Calculate cal=(a,b)->(float)a*(float)b;
        return cal;
    }
    public static Calculate performDivision(){
        Calculate cal=(a,b)->{if(b==0) return 0;
        else
        return (float)a/(float)b;
        };
        return cal;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(); sc.nextLine();
        int b=sc.nextInt(); sc.nextLine();
        Calculate add=performAddition();
        float f1=add.performCalculation(a,b);
        System.out.println("The sum is "+f1);
        Calculate sub=performSubtraction();
        float f2=sub.performCalculation(a,b);
        System.out.println("The difference is "+f2);
        Calculate mul=performProduct();;
        float f3=mul.performCalculation(a,b);
        System.out.println("The product is "+f3);
        Calculate div=performDivision();
        float f4=div.performCalculation(a,b);
        System.out.println("The division value is "+f4);
    }
}