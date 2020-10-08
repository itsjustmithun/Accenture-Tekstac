import java.util.*;
public class Numerology{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n[][]={{'A',1},{'B',2},{'C',3},{'D',4},{'E',5},{'F',8},{'G',3},{'H',5},{'I',1},{'J',1},{'K',2},{'L',3},{'M',4},{'N',5},{'O',7},{'P',8},{'Q',1},{'R',2},{'S',3},{'T',4},{'U',6},{'V',6},{'W',6},{'X',5},{'Y',1},{'Z',7}};
        System.out.println("Enter your name:");
        String str=sc.nextLine();
        int len=str.length();
        for(int i=0;i<len;i++){
            char c=str.charAt(i);
            if(!Character.isUpperCase(c)){
                System.out.println("Invalid name");
                System.exit(0);
            }
        }
        int sum=0;
        for(int i=0;i<len;i++){
            char c=str.charAt(i);
            int x=(int)c - 65;
            sum=sum+n[x][1];
        }
        System.out.println("Your numerology no is:"+sum);
    }
}