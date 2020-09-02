public class Account{
    private int accountId;
    private String accountType;
    private int balance;
    
    public int getAccountId(){
        return this.accountId;
    }
    public void setAccountId(int accountid){
        this.accountId=accountid;
    }
    public String getAccountType(){
        return this.accountType;
    }
    public void setAccountType(String accountType){
        this.accountType=accountType;
    }
    public int getBalance(){
        return this.balance;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public boolean withdraw(int amt){
        if(balance>=amt){
            balance=balance-amt;;
            System.out.println("Balance amount after withdraw: "+balance);
            return true;
        }
        else{
            System.out.println("Sorry!!! No enough balance");
            return false;
        }
    }
}