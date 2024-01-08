package task3.abs;

public class Sample1 extends Sample {

	@Override
	public void move(){
		// TODO Auto-generated method stub
		
		System.out.println("Move to north direction and this is overrided method in subclass");
		
	}
	
	public static void main(String[] args) {
		Sample1 sample1=new Sample1();
		
		sample1.move();
		sample1.move1();
		

		
	}

}
