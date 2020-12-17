class SavingAccount:
    balance=20000
    username='Admin'
    password=123
    def __init__(self,username,password):
        self.username=username
        self.password=password
        
    @classmethod
    def login(cls,username,password):
        if(username==cls.username and password==cls.password):
            return True
        else:
            return False
            
    @classmethod
    def withdraw(cls,amount):
        if(amount>cls.balance):
            print("In-sufficient funds to withdraw")
            return False
        elif(amount<cls.balance):
            cls.balance=cls.balance-amount
            return True
            
username=input("Enter your name to Login ")
password=int(input("Enter password "))

sobj=SavingAccount(username,password)
check=sobj.login(username,password)
if(check):
    amount=int(input("Enter amount to withdraw "))
    sobj.withdraw(amount)
    print(f'{amount} is withdraw')
    print(f'{SavingAccount.balance} balance amount')
else:
    print('Invalid Username or password')