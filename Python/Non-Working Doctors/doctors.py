n1=int(input())
if(n1<1):
    print("Invalid list size")
    exit()
l1=[]
for i in range(0,n1):
    inp=int(input())
    if(inp<1):
        print("Invalid Id")
        exit()
    l1.append(inp)
n1=int(input())
if(n1<1):
    print("Invalid list size")
    exit()
for i in range(0,n1):
    inp=int(input())
    if(inp<1):
        print("Invalid Id")
        exit()
    l1=list(filter((inp).__ne__,l1))
    
print("Not Working Doctors' IDs are:")
for x in l1:
    print(x,end=" ")