import java.util.*;
class NumberRepetition{
    public static void main(String[] args){
        int n,d, c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        n=sc.nextInt();
        int temp = n;
        System.out.println("Enter the key digit ");
        d=sc.nextInt();
        while (n>0){
            if(n%10==d)
                c++;
            n=n/10;
        }
        System.out.println(d+" appears "+c+" times in "+temp);
    }
}