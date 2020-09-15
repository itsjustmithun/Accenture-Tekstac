import java.util.*;
class AsciValue{
    public static void main(String[] args){
        int n=4;
        //char ch=char(num);
        int num[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digits");
        for(int i=1;i<=n;i++){
            num[i]=sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            System.out.println(num[i]+"-"+(char)num[i]);
        }
    }
}