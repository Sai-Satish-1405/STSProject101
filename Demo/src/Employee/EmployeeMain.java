package Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1=new Employee(100, "Sai", "Dev");
		Employee e2=new Employee(101, "Sai S", "BA");
		Employee e3=new Employee(102, "Sai P", "BA");
		Employee e4=new Employee(103, "Sai Satish", "Dev");
		Employee e5=new Employee(103, "Sai Satish Pallapolu", "BA");
		Employee e6=new Employee(103, "Sai Satish P", "Dev");
		
		List<Employee> emp=Arrays.asList(e1,e2,e3,e4,e5,e6);
//		
//		emp.stream().collect(Collectors.groupingBy(Employee::geteJob)).entrySet().forEach(x->{
//			
//			System.out.println(x.getKey() + "=");
//			System.out.println(x.getValue().stream().map(Employee::geteName).collect(Collectors.joining(",")));
//			
//			
//		});
		
		
	emp.stream().collect(Collectors.groupingBy(Employee::geteJob)).entrySet().forEach(x->{
		
		System.out.print(x.getKey()+"=");
		System.out.println(x.getValue().stream().map(Employee::geteName).collect(Collectors.joining(",")));
		
	});		
			
	
					  	
		
	}

}
