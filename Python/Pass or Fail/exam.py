import sys
n=int(input("Enter the no. of subjects: "))
lst=[]
passed,failed=0,0
if n<=0:
    print("Invalid no. of subjects")
    sys.exit(0)
else:
    print("Enter the marks:")
    for i in range(0,n):
        ele=int(input())
        if ele<0 or ele>100:
            print("Invalid mark")
            sys.exit(0)
        else:
            lst.append(ele)
    for j in lst:
        if j<=50:
            failed+=1 
        else:
            passed+=1 
    print("No. of subjects passed: "+str(passed))
    print("No. of subjects failed: "+str(failed))