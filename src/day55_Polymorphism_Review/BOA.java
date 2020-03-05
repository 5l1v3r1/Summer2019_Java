package day55_Polymorphism_Review;

/*
  1. create an abstract class called ScrumTeam
            Data: Name
                  JobTitile
                  Salary
            Actions: DailyStandUp();
                     Demo();
    2. Create the following sub classes of ScrumTeam:
                1. Testers:
                        Actions: FindBug
                2. Developers:
                        Actions: FixBug

 
  3. Create a class called BOF
       create Array of Testers named sdets, at leats store two objects
       create array of Developers named dev, at least store three objects
       create ArrayList of ScrumTeam:
               store all the developer' and testers' objects
*/

abstract class ScrumTeam {
	public String name, jobtitle;
	public double salary;
	
	public abstract void dailystandup();
	public abstract void demo();
	
	public void getEmployeeInfo() {
		System.out.println();
		System.out.println("===Information of Employee===");
		System.out.println("Employee name "+name);
		System.out.println("Job title "+jobtitle);
		System.out.println("Salary $"+salary);
		System.out.println("=============================");
	}
}

class Testers extends ScrumTeam {
	
	public Testers(String name, double salary, String jobtitle) {
		this.name = name;
		this.salary = salary;
		this.jobtitle = jobtitle;
	}
	
	@Override
	public void dailystandup() {
		System.out.println(jobtitle+" "+name+" is talking");
	}
	
	@Override
	public void demo() {
		System.out.println(jobtitle+" "+name+" is doing demo");
	}
	
}



public class BOA {
	public static void main(String[] args) {
		ScrumTeam esmira = new Testers("Esmira", 900000, "tester");
		esmira.dailystandup();
		esmira.demo();
		esmira.getEmployeeInfo();
		
		ScrumTeam don = new Testers("donatan", 40000, "doncu");
		
		ScrumTeam[] testers = {esmira, don};
		for(ScrumTeam each : testers) {
			each.getEmployeeInfo();
		}
	}
	
}
