class Person:
    def __init__(self,name,age,dept):
        self.name=name
        self.age=age
        self.dept=dept
        
class Student:
    def __init__(self,sid):
        self.sid=sid
        
class Faculty:
    def __init__(self,fid):
        self.fid=fid
        
class StudentMember(Person,Student):
    def __init__(self,name,age,dept,sid):
        Person.__init__(self,name,age,dept)
        Student.__init__(self,sid)
        
    def display(self):
        print('Student Details\n{self.name}\n{self.age}\n{self.dept}\n{self.sid}')
        
class FacultyMember(Person,Faculty):
    def __init__(self,name,age,dept,fid):
        Person.__init__(self,name,age,dept)
        Faculty.__init__(self,fid)
        
    def display(self):
        print('Faculty Details\n{self.name}\n{self.age}\n{self.dept}\n{self.fid}')

print("1.Student member\n2.Faculty member")
choice=int(input("Enter the choice\n"))
print("Enter the Details:")
name=input("Name\n")
age=input("Age\n")
dept=input("Department\n")
id=input("Id\n")

if choice==1:
    s_account_obj=StudentMember(name,age,dept,id)
    s_account_obj.display()
elif choice==2:
    f_account_obj=FacultyMember(name,age,dept,id)
    f_account_obj.display()