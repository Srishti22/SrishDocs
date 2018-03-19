package com.accenture;

public class Starter {

	public static void main(String[] args) {
		//int a[]=new int[10];
		int i=0;
		Employee [] emp=new Employee[4];
		emp[0]=new Employee(100,"sameer");
		emp[1]=new Employee(101,"Sam");
		emp[2]=new Employee(102,"Ritu");
		emp[3]=new Employee(103,"Smita");
		for(i=0;i<4;i++)
		{
			System.out.println("empid:"+emp[i].getEmpId());
			System.out.println("empname:"+emp[i].getEmpName());
		}
		/*for(Employee e:emp)
		{
			System.out.println(e.getEmpId());
			System.out.println(e.getEmpName());
		}*/
		

	}

}
