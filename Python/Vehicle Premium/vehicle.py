class Vehicle:
    def __init__(self,cost,type):
        self.__cost=cost
        self.__type=type
        self.__premium=None
    def calculate_premium(self):
        if self.__type==1:
            self.__premium=0.02*self.__cost
        elif self.__type==2:
            self.__premium=0.06*self.__cost
        elif self.__type==3:
            self.__premium=0.08*self.__cost
    def get_premium(self):
        return self.__premium

vehicle_cost=float(input("Enter the vehicle cost: "))
vehicle_type=int(input("Enter the type of the vehicles (1 for 2 wheeler, 2 for 4 wheeler and 3 for other types):"))
vehicle_obj=Vehicle(vehicle_cost,vehicle_type)
vehicle_obj.calculate_premium()
print("The premium amount is: ",vehicle_obj.get_premium())