package co.edureka.employee;

public class Employee {

	// Attributes
	int eid;
	String ename;
	int esalary;

	
	// constructor
	
	public Employee()
	{
		
	}
	
	public Employee(int eid, String ename, int esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	
	public void init(){
	      System.out.println("Bean is going through init.");
	   }
	   public void destroy() {
	      System.out.println("Bean will destroy now.");
	   }	
	
}
