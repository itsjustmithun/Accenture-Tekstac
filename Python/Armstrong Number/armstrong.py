l,u=list(map(int,input("Enter the starting and ending numbers:\n").split()))
counter=0
if l<0 or u<0:
    print("Starting and ending numbers must be greater than or equal to zero")
elif l>u:
    print("Invalid input!! Ending number should be greater than starting number")
else:
    print("Armstrong numbers between "+str(l)+" and "+str(u)+" are:")
    for num in range(l,u+1):
        temp = [int(d)**3 for d in str(num)] #single line of code using list comprehension instead of using while loop
        if num==sum:
            print(num)
            counter+=1
    if counter==0:
        print("There is no Armstrong number between these numbers")
