package task3.abs.inter;

public class Example implements Demo,Demo1 {
	
	@Override
	public void move2() {
		// TODO Auto-generated method stub
		System.out.println("Move north, this is overrided from Demo1 Interface");
		
	}

	@Override
	public void move1() {
		// TODO Auto-generated method stub
		System.out.println("Move South, this is overrided from Demo1Interface");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example example=new Example();
		example.move1();
		example.move2();

	}


}
