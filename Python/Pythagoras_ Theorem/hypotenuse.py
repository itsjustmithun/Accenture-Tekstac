from math import sqrt
def hypotenuse(t1,t2):
    return sqrt(t2 ** 2 + t1 **2)
a=int(input("Enter the triangle side 1: "))
b=int(input("Enter the triangle side 2: "))
if a<1 or b<1:
    print("Invalid input")
    exit()
print("Hypotenuse =",int(hypotenuse(a,b)))