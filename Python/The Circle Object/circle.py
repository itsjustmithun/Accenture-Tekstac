my_radius=float(input("Enter the radius of the circle:"))
my_color=input("Enter the color of the circle:")
class Circle:
    def __init__(self,radius,color):
        self.__radius=radius 
        self.__color=color 
    def get_radius(self):
        return self.__radius 
    def set_radius(self,radius):
        self.__radius=radius
    def get_color(self):
        return self.__color
    def set_color(self,color):
        self.__color=color
    def calculate_area(self):
        return 3.14*self.__radius*self.__radius
    def calculate_perimeter(self):
        return 2*3.14*self.__radius
        
def check_validity(my_radius,my_color):
    if(my_radius<=0):
        print("Invalid Radius")
        return False
    else:
        return Circle(my_radius,my_color)
        
circle_obj=check_validity(my_radius,my_color)
if(circle_obj!=False):
    area=circle_obj.calculate_area()
    perimeter=circle_obj.calculate_perimeter()
    print("Area is:%.2f"%area)
    print("Perimeter is:%.2f"%perimeter)