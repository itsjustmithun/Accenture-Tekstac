public class Employee {

	private int eid;

	private String name;

	private double salary;

	private double pfper;

	public Employee(int eid, String name, double salary, double pfper) {

		super();

		this.eid = eid;

		this.name = name;

		this.salary = salary;

		this.pfper = pfper;

	}

	public double calNetPay(){

		if(pfper <= 5){

			return salary;

		} else {

			return salary-salary*(pfper/100);

		}

	}

}