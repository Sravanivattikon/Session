package task2.multilevel;

public class Student extends Department {
	
	int studentID;
	String StudentName;
	String studentAddress;
	
	public Student(int departmentId, String departmentName, int studentID, String studentName, String studentAddress) {
		super(departmentId, departmentName);
		this.studentID = studentID;
		StudentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	
	public String getStudentDetails() {
		return "Student [studentID=" + studentID + ", StudentName=" + StudentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student=new Student(1,"CSE",10,"John","Hyd");
		System.out.println(student.getStudentDetails());
		
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println(student.getDepartment());
		
        System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println(student.getCollegeDetails());
	}


}
