weight=float(input("Enter the weight of the person(kg):"))
height=float(input("Enter the height of the person(m):"))
if height<=0 or weight<=0:
    print("Provide a valid input")
else:
    bmi=weight/(height*height)
    if bmi>27.5:
        print("Your BMI is "+"{:.1f}".format(bmi)+" (High Risk).")
    elif bmi>23 and bmi<=27.4:
        print("Your BMI is "+"{:.1f}".format(bmi)+" (Moderate Risk).")
    elif bmi>18.5 and bmi<=22.9:
        print("Your BMI is "+"{:.1f}".format(bmi)+" (Low Risk).")
    else:
        print("Your BMI is "+"{:.1f}".format(bmi)+" (Risk of nutritional deficiency diseases).")