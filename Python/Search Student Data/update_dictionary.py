import sys
l=[]
l1=[]
n=int(input('Enter the no of student details to be created :'))
if(n<=0):
    print('Invalid Input')
    sys.exit(0)
else:
    for i in range(0,n):
        name=input('Name:')
        age=int(input('Age:'))
        if(age>=10 and age<=20):
            loc=input('Location:')
            d={'Name':name,'Age':age,'Location':loc}
            l.append(d)
        else:
            print('Invalid Input')
            sys.exit(0)
    
    print("Here's the list of student details :")
    for i in l:
        print(i)
        
        
    t=input('Enter the training location:')
    for i in l:
        if(i['Location'].casefold()==t.casefold()):
            l1.append(i['Name'])
    
    if len(l1)>0:
        print('Student(s) enrolled in this training location:')
        for i in l1:
            print(i)
    else:
        print('Invalid location')