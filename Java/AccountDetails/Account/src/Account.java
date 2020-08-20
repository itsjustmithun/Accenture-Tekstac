public class Account{
    private int accountId;
    private String accountType;
    private int balance;
    
    public Account(int accountId,String accountType,int balance){
        this.accountId=accountId;
        this.accountType=accountType;
        this.balance=balance;
    }
    
    public void setBalance(int amt){
        this.balance = amt;
    }
    
    public int getBalance(){
        return balance;
    }
    
    public boolean deposit(int amt){
        if(amt <= 0)
            return false;
        setBalance(getBalance()+amt);
        return true;
    }
    
    public boolean withdraw(int amt){
        int amount = getBalance() - amt;
        if(amt <= 0 || amt > getBalance())
            return false;
        setBalance(amount);
        return true;
        
    }
}