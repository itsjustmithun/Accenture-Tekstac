class Account:
    def __init__(self,accountNumber,holderName,balance):
        self.accountNumber =accountNumber
        self.holderName= holderName
        self.balance= balance

class SavingAccount(Account):
    def __init__(self,accountNumber,holderName,balance,availableBalance=None):
        super().__init__(accountNumber,holderName,balance)
        self.availableBalance=availableBalance
    def calculateBalance(self,withdrawlAmount):
        if withdrawlAmount < self.balance:
            if self.balance - withdrawlAmount >=500:
                self.availableBalance = self.balance - withdrawlAmount
            else:
                self.availableBalance=self.balance
                
class CurrentAccount(Account):
    def __init__(self,accountNumber,holderName,balance,availableBalance=None):
        super().__init__(accountNumber,holderName,balance)
        self.availableBalance=availableBalance
    def calculateBalance(self,withdrawlAmount):
        if self.balance > withdrawlAmount:
            if withdrawlAmount>30000:
                self.availableBalance=self.balance - 30000
            else:
                self.availableBalance=self.balance - withdrawlAmount
                
def printFormat(obj):
    print("Account Details\n{obj.accountNumber}\n{obj.holderName}\n{obj.availableBalance:.1f}")
    
if __name__=='__main__':
    print("1.Savings Account\n2.Current Account")
    choice=int(input("Enter the choice\n"))
    print("Enter the Details:")
    accountNumber=input("Account Number\n")
    holderName=input("Holder Name\n")
    balance=float(input("Balance\n"))
    withdrawlAmount=float(input("Withdrawl Amount\n"))
    
    if choice==1:
        s_account_obj=SavingAccount(accountNumber,holderName,balance)
        s_account_obj.calculateBalance(withdrawlAmount)
        printFormat(s_account_obj)
    elif choice==2:
        c_account_obj=CurrentAccount(accountNumber,holderName,balance)
        c_account_obj.calculateBalance(withdrawlAmount)
        printFormat(c_account_obj)