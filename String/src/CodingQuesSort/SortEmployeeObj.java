package CodingQuesSort;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;


public class SortEmployeeObj {
	
				public static int sortByName(Employee a,Employee b) {
					
					return a.geteName().compareToIgnoreCase(b.geteName());	
				}
				
				public static int sortByAge(Employee a,Employee b) {
					
					return Integer.valueOf(b.geteAge()).compareTo(Integer.valueOf(a.geteAge()));	
				}
				
				public static int sortByjoiningDate(Employee a,Employee b) {
					
					return a.getJoiningDate().compareTo(b.getJoiningDate());	
				}
				
				public static int sortBySal(Employee a,Employee b) {
					
					return Double.valueOf(b.getEsal()).compareTo(a.getEsal());	
				}
	
	public static void main(String[] args) {
		
		 List<Employee> empList=Arrays.asList(
				 	  new Employee("Ayesha", 44, 50000, LocalDate.of(2020, 05, 15)),
					  new Employee("Supriya", 25, 90000, LocalDate.of(2020,05, 02)),
					  new Employee("Zarren",30,85000,LocalDate.of(2020,07, 10))          
					  );
		
		Collections.sort(empList,SortEmployeeObj::sortByName);
		Collections.sort(empList, SortEmployeeObj::sortByAge);
		Collections.sort(empList, SortEmployeeObj::sortByjoiningDate);
		Collections.sort(empList, SortEmployeeObj::sortBySal);
		
		empList.forEach(System.out::println);
	
		
		//or 
		
		Consumer<Employee> eList = (e)-> System.out.println(e);
		empList.forEach(eList);
		
		
		
	}

}










class Employee{
	
	String eName;
	int eAge;
	double esal;
	LocalDate joiningDate;
	
	
	public Employee(String eName, int eAge, double esal, LocalDate joiningDate) {
		super();
		this.eName = eName;
		this.eAge = eAge;
		this.esal = esal;
		this.joiningDate = joiningDate;
	}
	
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteAge() {
		return eAge;
	}
	public void seteAge(int eAge) {
		this.eAge = eAge;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}


	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eAge=" + eAge + ", esal=" + esal + ", joiningDate=" + joiningDate + "]";
	}
	
	
	
	
}