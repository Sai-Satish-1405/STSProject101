package DI_Setter;

public class EmployeeBean {
	public String name;
	public EmployeeAddress addr;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EmployeeAddress getAddr() {
		return addr;
	}
	public void setAddr(EmployeeAddress addr) {
		this.addr = addr;
	}
	
	

}
