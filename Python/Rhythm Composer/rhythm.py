import sys
def find_prime(start,end):
    count=0
    if start<0 or end<0 or start>end:
        print("Invalid range")
        sys.exit()
    elif start==end or start==0 or end==1:
        print("There is no prime numbers in this range")
        sys.exit()
    else:
        for num in range(start,end+1):
            if num>1:
                for i in range(2,num):
                    if(num%i==0):
                        break
                else:
                    print(num)
                    count+=1
                if(count==0):
                    print("There is no prime numbers in this range")
            
a=int(input())
b=int(input())
find_prime(a,b)