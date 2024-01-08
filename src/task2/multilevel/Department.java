package task2.multilevel;

public class Department extends College {
	
	private int departmentId;
	private String departmentName;

	public Department(int departmentId,String departmentName){
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		
	}

	
	public String getDepartment() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", collegeName="
				+ collegeName + ", collegeAddress=" + collegeAddress + ", CollegePincode=" + CollegePincode + "]";
	}
	



}
