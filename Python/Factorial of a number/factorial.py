fact=1
n=int(input("Enter a number\n"))
if n<0:
    print("Factorial does not exist for negative numbers")
    exit(0)
else:
    for i in range(1,n+1):
        fact*=i 
        
print("Factorial is ",fact)