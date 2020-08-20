package myfiles;

public class Employee 
{

    private String empid;
    private String ename;
    private String phone;
    private String email;

	public Employee()
	{
    }

	/* TODO : WRITE YOUR CODE HERE .. CREATE SETTER AND GETTER METHODS */
	public String getEmpid(){
	    return empid;
	}
	public String getEname(){
	    return ename;
	}
	public String getPhone(){
	    return phone;
	}
	public String getEmail(){
	    return email;
	}
	public void setEmpid(String empid){
	    this.empid=empid;
	}
	public void setEname(String ename){
	    this.ename=ename;
	}
	public void setPhone(String phone){
	    this.phone=phone;
	}
	public void setEmail(String email){
	    this.email=email;
	}
    
}