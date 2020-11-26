class Member:
    def __init__(self,customerId,customerName,emailId):
        self.customerId=customerId
        self.customerName=customerName
        self.emailId=emailId
        
class GoldMember(Member):
    def __init__(self,customerId,customerName,emailId):
        super().__init__(customerId,customerName,emailId)
        self.discountAmount=0.0
        
    def calculateDiscount(self,purchaseAmount):
        discountAmount=0.1*purchaseAmount
        self.discountAmount=purchaseAmount- discountAmount
        
class DiamondMember(Member):
    def __init__(self,customerId,customerName,emailId):
        super().__init__(customerId,customerName,emailId)
        self.discountAmount=0.0
    def calculateDiscount(self,purchaseAmount):
        discountAmount=0.2 * purchaseAmount
        self.discountAmount = purchaseAmount- discountAmount
        
print("1.GoldMembership")
print("2.DiamondMembership")
print("Enter the choice")
choice=int(input())
print("Enter the Details:")
print("Customer Id")
customerId=input()
print("Customer Name")
customerName=input()
print("EmailId")
emailId=input()
print("Enter the Purchase Amount")
purchaseAmount=float(input())
print("Member Details")
if choice==1:
    g_account_obj=GoldMember(customerId,customerName,emailId)
    g_account_obj.calculateDiscount(purchaseAmount)
    print(g_account_obj.customerId,g_account_obj.customerName,g_account_obj.emailId,g_account_obj.discountAmount)
else:
    d_account_obj=DiamondMember(customerId,customerName,emailId)
    d_account_obj.calculateDiscount(purchaseAmount)
    print(d_account_obj.customerId,d_account_obj.customerName,d_account_obj.emailId,d_account_obj.discountAmount)