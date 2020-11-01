import java.util.*;
class Palindrome{
    public static void main(String[] args){
        int n,r, sum=0,temp;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        if(n<0){
            System.out.println("Invalid Input");
        }
        else{
            temp=n;
            while(n>0){
                r=n%10;
                sum=(sum*10)+r;
                n=n/10;
            }
            if(temp==sum)
                System.out.println("Palindrome");
            else
                System.out.println("Not a Palindrome");
        }
    }
}