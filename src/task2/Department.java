package task2;

public class Department extends College {
	
	private int departmentId;
	private String departmentName;

	public Department(int departmentId,String departmentName){
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department department=new Department(1,"CSE");
		Department department1=new Department(2,"ECE");
		
		College college=new College();
		System.out.println(college.getCollegeDetails());
		
		System.out.println("-------------------------------------------------------------------------------");
	

		System.out.println(department.getDetails());
		System.out.println(department1.getDetails());
		
	}

	public String getDetails() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", collegeName="
				+ collegeName + ", collegeAddress=" + collegeAddress + ", CollegePincode=" + CollegePincode + "]";
	}



}
