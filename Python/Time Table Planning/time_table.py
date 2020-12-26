import Dates
y=int(input("Enter year as 4 digits (e.g:2002):"))
m=int(input("Enter month number:"))
l=Dates.is_leap(y)
if(l==1):
    a="Leap Year"
else:
    a="Not Leap Year"
b=Dates.month_name(m)
c=Dates.days_in_month(m,y)
print("Year: "+a)
print("Month Name: "+b)
print("Days in month: ",c)