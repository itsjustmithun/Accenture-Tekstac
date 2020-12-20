lucky=lambda n: 1 if(sum(int(d) for d in str(n))%2==0) else 0
num=int(input("Enter the Number:"))
if(num<=0):
    exit("Invalid Number")
if(lucky(num)==1):
    print("{} is lucky".format(num))
else:
    print("{} is not lucky".format(num))