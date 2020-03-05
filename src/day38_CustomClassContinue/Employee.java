package day38_CustomClassContinue;

public class Employee {

	String name;
	String ID;
	int age;
	int SSN;
	String jobtitle;
	double salary;
	
	
	// we must give this
	public Employee() {
	}
	
	public Employee(String name, String ID, int age, int SSN, String jobtitle, double salary) {
		this.name = name;
		this.ID = ID;
		this.age = age;
		this.SSN = SSN;
		this.jobtitle = jobtitle;
		this.salary = salary;
		
		
	}
	
	public void getInfo() {
		
		System.out.println("Employee name is: "+name);
		System.out.println("SSN "+ SSN);
		System.out.println("Age is: "+age);
		System.out.println("Job title is: "+jobtitle);
		System.out.println("Salary $"+salary);
		System.out.println("ID: "+ID);
		
		
	}
	
	
	
	
	
}
