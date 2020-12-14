no_of_residents=int(input("No of Residents :\n"))
if no_of_residents<1:
    print("Invalid")
    exit()
else:
    tuple_list=[]
    for i in range(0,no_of_residents):
        print("Resident "+str(i+1)+": ")
        name=input("Name :\n")
        age=int(input("Age :\n"))
        if age<21 or age>58:
            print("Invalid")
            exit()
        else:
            designation=input("Designation :\n")
            band=input("Band :\n")
            if(band !='A' and band!='B' and band!='C' and band!='D'):
                print("Invalid")
                exit()
            else:
                input_tuple=(name,age,designation,band)
                tuple_list.append(input_tuple)
                
    first_tuple=('NAME','AGE','DESIGNATION','BAND')
    print(first_tuple)
    for i in tuple_list:
        print(i)
    band_of_interest=input("Enter your band of interest :\n")
    if(band_of_interest!='A' and band_of_interest!='B' and band_of_interest!='C' and band_of_interest!='D'):
        print("Invalid")
        exit()
    else:
        print(first_tuple)
        final_tuple_list=[]
        for i in tuple_list:
            if(i[-1].casefold()==band_of_interest.casefold()):
                final_tuple_list.append(i)
        if(len(final_tuple_list)==0):
            print("No resident under this band")
            exit()
        else:
            for i in final_tuple_list:
                print(i)