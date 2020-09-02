import java.util.*;
public class AccountDetails{
    public  static void main(String[] args){
        Account l = AccountDetails.getAccountDetails();
        int amount = AccountDetails.getWithdrawAmount();
        l.withdraw(amount);
    }
    public static Account getAccountDetails(){
        Scanner sc =new Scanner(System.in);
        Account obj = new Account();
        System.out.println("Enter account id:");
        int id=sc.nextInt();
        obj.setAccountId(id);
        System.out.println("Enter account type:");
        String type=sc.next();
        obj.setAccountType(type);
        boolean validBalance=false;
        int bal=0;
        while(!validBalance){
            System.out.println("Enter balance:");
            bal=sc.nextInt();
            if(bal<=0){
                System.out.println("Balance should be positive");
            }
            else{
                obj.setBalance(bal);
                validBalance=true;
            }
        }
        return obj;
    }
    public static int getWithdrawAmount(){
        Scanner sc=new Scanner(System.in);
        boolean validamt=false;
        int amt=0;
        while(!validamt){
            System.out.println("Enter amount to be withdrawn:");
            amt=sc.nextInt();
            if(amt<=0){
                System.out.println("Amount should be positive");
            }
            else{
                validamt=true;
            }
        }
        return amt;
    }
}