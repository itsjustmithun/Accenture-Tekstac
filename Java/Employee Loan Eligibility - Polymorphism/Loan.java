
public class Loan {
	
	//Implement the below method 
	public double loan;
	public double calculateLoanAmount(Employee employeeObj) {
		if(employeeObj instanceof PermanentEmployee){
		    loan=(employeeObj.getSalary()*15)/100;
		}
		else{
		    if(employeeObj instanceof TemporaryEmployee){
		        loan=(employeeObj.getSalary()*10)/100;
		    }
		}
		return loan;
	}

}
