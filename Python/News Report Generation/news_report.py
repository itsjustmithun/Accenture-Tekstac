d = int(input("Dead Count:"))
if(d<0):
    print ("Invalid input")
    exit(0)
i = int(input("Injured Count:"))
if(i<0):
    print("Invalid input")
    exit(0)
s = int(input("Safe Count:"))
if(s<0):
    print("Invalid input")
    exit(0)
print ("TSUNAMI REPORT OF JAPAN")
print ("The number of people")
print ("Dead:"+str(d));
print ("Injured:"+str(i))
print ("Safe:"+str(s))
print ("Please help the people who are suffering!!!")