import java.util.*;
class Coins{
    public static void main(String[] args){
        int age, cube;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        age=sc.nextInt();
        if(age>10 || age<1){
            System.out.println("Invalid Age");
        }
        else{
            cube=age*age*age;
            System.out.println("Meenu gets "+cube+" coins");
        }
    }
}