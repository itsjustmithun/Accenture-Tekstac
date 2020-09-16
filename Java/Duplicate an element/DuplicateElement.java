import java.util.*;
public class DuplicateElement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        System.out.println();
        int size=sc.nextInt();
        if(size<=0){
            System.out.println();
            System.out.println("Invalid array size");
            System.exit(0);
        }
        System.out.println();
        int array[]=new int[size+1];
        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++){
            System.out.println();
            array[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("Enter the position of the element to be replicated:");
        System.out.println();
        int rep=sc.nextInt();
        if(rep>=size){
            System.out.println();
            System.out.println("Position is greater than the size of an array");
            System.exit(0);
        }
        array[size]=array[rep];
        for(int i=0;i<size+1;i++){
            System.out.println();
            System.out.println(array[i]);
        }
    }
}