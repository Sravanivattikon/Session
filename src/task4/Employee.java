package task4;

public class Employee implements Cloneable{
	
	private int id; // used like Identification feature
	private String empName; // used like useful information feature
	private double empSalary;//used like comparison feature
	
	public Employee(int id, String empName, double empSalary) {
		super();
		this.id = id;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee(1,"John",30000.00);
		Employee e2=new Employee(2,"David",29000.00);
		Employee e3=new Employee(3,"John",40000.00);
		
		
		System.out.println(e1.equals(e3));
		System.out.println(e1.toString());
		System.out.println(e3.hashCode());
		
		//Using getClass()Method
		System.out.println(e1.getClass());
		System.out.println(e1.getClass().getName());
		
		//using clone() method
		Employee e4=(Employee) e1.clone();
		System.out.println("---------clone() method example--------------");
		
		System.out.println(e1.toString());
		System.out.println(e4.toString());
		

	}



	/**@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee employee=(Employee)obj;
		return this.empName==employee.empName;
	}
*/


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

}
