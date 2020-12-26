def is_leap(year):
    if(year%400==0 or year%4==0):
        x=1 
    else:
        x=0 
    return x 
    
def month_name(no):
    m=["January","February","March","April","May","June","July","August","September","October","November","December"]
    return m[no-1]
    
def days_in_month(month,year):
    if(month==2):
        if(year%4==0):
            return 29
        else:
            return 28
    else:
        check=[1,3,5,7,8,10,12]
        count=0 
        for i in range(len(check)):
            if(month==check[i]):
                count+=1 
                return 31
        if(count==0):
            return 30