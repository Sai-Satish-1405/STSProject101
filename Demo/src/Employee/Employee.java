package Employee;

public class Employee {
	int eId;
	String eName;
	String eJob;
	
	
	public Employee(int eId, String eName, String eJob) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eJob = eJob;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteJob() {
		return eJob;
	}
	public void seteJob(String eJob) {
		this.eJob = eJob;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eJob=" + eJob + "]";
	}
	
	
	

}
