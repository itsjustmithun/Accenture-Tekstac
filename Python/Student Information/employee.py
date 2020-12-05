class Person:
    def __init__(self,name,age):
        self.name=name
        self.age=age 

class Student(Person):
    def __init__(self,name,age,regno,percentage):
        super().__init__(name,age)
        self.regno=regno
        self.percentage=percentage
    def display(self):
        print("Name:",self.name)
        print("Age:",self.age)
        print("Rollno:",self.regno)
        print("Percentage:",self.percentage)
        
print("Enter the student name:")
name=input()
print("Enter the student age:")
age=input()
print("Enter the student rollno:")
regno=input()
print("Enter the student percentage:")
percentage=input()
student_obj=Student(name,age,regno,percentage)
student_obj.display()