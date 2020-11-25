class Employee:
    def __init__(self,employee_id,employee_name,basic_pay):
        self.employee_id=employee_id
        self.employee_name=employee_name
        self.basic_pay=basic_pay
    def calculate_net_salary(self):
        da=self.basic_pay*10/100
        ta=self.basic_pay*5/100
        hra=self.basic_pay*8/100
        pf=self.basic_pay*10/100
        net_sal=(self.basic_pay+da+ta+hra)-pf
        return net_sal

eid=input("Enter the employee id:")
ename=input("Enter the employee name:")
basic_pay=float(input("Enter the basic pay:"))
emp_obj=Employee(eid,ename,basic_pay)
print("\nEmployee Id:",emp_obj.employee_id)
print("Employee Name:",emp_obj.employee_name)
net_salary=emp_obj.calculate_net_salary()
print("Net Salary :%.2f" %net_salary)