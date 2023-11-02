package DI_Constructor;

public class EmployeeBean {
	public String name;
	public EmployeeAddress add;
	
	public EmployeeBean(String name,EmployeeAddress add) {
		super();
		this.add=add;
		this.name=name;
	}
	

}
