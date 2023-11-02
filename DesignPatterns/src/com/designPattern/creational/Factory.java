package com.designPattern.creational;

//client classes
abstract class Factory {
	public abstract double getSalary();

	public String toString() {
		return " is " + this.getSalary();
	}
}

class Employees extends Factory {
	private double salary;
	
	Employees(double salary){
		this.salary=salary;	
	}
	
	@Override
	public double getSalary() {
		return this.salary;
	}

}

class CEO extends Factory {
	private double salary;

	CEO(double salary){
		this.salary=salary;
	}
	
	@Override
	public double getSalary() {
		return this.salary;
	}

}

class Manager extends Factory {
	private double salary;
	
	Manager(double salary){
		this.salary=salary;
		
	}
	@Override
	public double getSalary() {
		return this.salary ;
	}

}

///Factory Static Method
class FactoryPattern{
	public static Factory getInstance( String type,Double sal) {
			if(type=="CEO") {
			return new CEO(sal);
			
		}else if(type=="Manager") {
			return new Manager(sal);
			
		}else {
			return new Employees(sal);
			
		}
	}
}

//

class Factorymain{
	
	
	public static void main(String[] args) {
		
		Factory emp=FactoryPattern.getInstance("CEO", 29000000.00);
		System.out.println(" Salary for CSEO"+emp);
		
	}
	
}


