import java.util.*;
public class HighestMarkPerSem{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of semester:");
        int sem=sc.nextInt();
        sc.nextLine();
        int[] sem_arr=new int[sem];
        for(int j=0;j<sem;j++){
            System.out.println("Enter no of subjects in "+(j+1)+" semester:");
            sem_arr[j]=sc.nextInt();
            sc.nextLine();
        }
        int[][] mark=new int[sem][10];
        for(int k=0;k<sem_arr.length;k++){
            System.out.println("Marks obtained in semester "+(k+1)+":");
            for(int i=0;i<sem_arr[k];i++){
                int temp=sc.nextInt();
                sc.nextLine();
                if(temp>=0 && temp<=100){
                    mark[k][i]=temp;
                }
                else{
                    System.out.println("You have entered invalid mark.");
                    System.exit(0);
                }
            }
        } 
        int max=0;
        for(int l=0;l<sem;l++){
            Arrays.sort(mark[l]);
            System.out.println("Maximum mark in "+(l+1)+" semester:"+mark[l][9]);
        }
    }
}