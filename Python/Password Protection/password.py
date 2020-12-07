import sys
n=int(input("Enter the total no.of plots: "))
if n>0 and n<=20:
    list=[]
    print("Enter the numbers of each plot:")
    for i in range(0,n):
        num=int(input())
        if num<=0:
            print("Invalid Input")
            sys.exit(0)
        else:
            list.append(num)
    
    sum=0 
    for i in range(0,n):
        sum=sum+list[i]
    ans=sum/2 
    print("The password for the file is: %.2f"%ans)
else:
    print("Invalid Input")
    sys.exit(0)