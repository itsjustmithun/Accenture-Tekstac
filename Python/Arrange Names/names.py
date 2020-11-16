def take(elem):
    return elem[0]
names=int(input("Enter the number of names:"))
if(names<=0):exit("Invalid Input")
list1=[]
print("\nEnter the names:")
for i in range(0,names):
    list1.append(input(""))
list1=sorted(list1,key=take)
list2=sorted(list1,key=len)
list2.reverse()
print("\nThe sorted name list is:")
for i in list2:
    print(i)