import sys
age=int(input("Enter the age:\n"))
if(age<18 or age>100):
    print("Invalid Age")
    sys.exit()
income=int(input("Enter the income:\n"))
if(income<0):
    print("Invalid Income")
    sys.exit()
    
if(age<=60 and income<=250000):
    tax=0 
elif(age<=60 and income>250000 and income<=500000):
    tax=income/10
elif(age<=60 and income>500000 and income<=1000000):
    tax=income*(20/100)
elif(age<=60 and income>1000000):
    tax=income*(30/100)
elif(age>60 and age<=80 and income<=300000):
    tax=0 
elif(age>60 and income>300000 and income<=500000):
    tax=income/10 
elif(age>60 and income>500000 and income<=1000000):
    tax=income*(20/100)
elif(age>60 and age<=80 and income>1000000):
    tax=income*(30/100)
elif(age>80 and income<=500000):
    tax=0 
elif(age>80 and income>500000 and income<=1000000):
    tax=income*(20/100)
elif(age>80 and age<=100 and income>1000000):
    tax=income*(30/100)
else:
    pass
tax1=float(tax)
print("The Tax amount is: %0.2f"%tax1)