package com.accenture;

public class Starter {

	public static void main(String[] args) {
		/*Employee emp=new Employee();
		emp.login();
		Manager mgr=new Manager();
		mgr.numOfReportees=10;
		mgr.empId=110;
		mgr.salary=10000;
		mgr.empName="Sameer";
		mgr.login();
		mgr.approveLeaves();
		//Manager mgr1=new Employee();
		Employee e1=new Manager();
		*/
		Manager mgr=new Manager(110,"Sameer",15000,10);
		System.out.println(mgr.empId);
		System.out.println(mgr.empName);
		System.out.println(mgr.salary);
		System.out.println(mgr.numOfReportees);
		mgr.login();
		
		/*Constructor chaining->even though we are creating object of manager class 
		still employee class constructor is called first*/
	}

}
