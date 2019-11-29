package com.accenture.lecture18;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;

	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return firstName + lastName;
	}

	public int getAnnualSalary() {
		return salary * 12;
	}

	public double raiseSalary(int percent) {
		return this.salary * percent / 100.0;
	}

	@Override
	public String toString() {
		return "Employees Salary is = " + getSalary() + ", ID = " + getId()
				+ ", Name is = " + getName() + "";
	}

	public static void main(String[] args) {
		Employee janis = new Employee(1234, "Janis", " Berzins", 1500);
		System.out.println(janis);
		janis.raiseSalary(20);
		System.out.println("The salary raise will be: " + janis.raiseSalary(20));
		
		Employee andris = new Employee(2736, "Andris", " Ozols", 2000); 
		System.out.println(andris);
		andris.raiseSalary(33); 
		System.out.println("The salary raise will be: " + andris.raiseSalary(33)); 

	}

}
