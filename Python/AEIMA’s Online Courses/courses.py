import sys
l=[]
d={}
x=int(input("Enter number of courses:"))
if(x<1):
    print("Invalid no. of courses")
    sys.exit(0)
else:
    for i in range(x):
        sub=input("Enter name of the subject and marks respectively:\n")
        marks=int(input())
        if(marks<0 or marks>100):
            print("Invalid mark")
            sys.exit(0)
        else:
            d.update({sub:marks})
            l.append(d)
            
    print("The courses you have cleared are:")
    for i,j in d.items():
        if j>=80:
            print(i,'\n',j)