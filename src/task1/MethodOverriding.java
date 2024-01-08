package task1;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape shape = new Shape();
		System.out.println("In parent class Shape");
		shape.rotate();
		System.out.println("------------------------------");
		System.out.println("In child class Circle");
		Circle circle=new Circle();
		circle.rotate();
	}

}
