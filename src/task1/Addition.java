package task1;

public class Addition {
	
	public void add(int i,int j) {
		System.out.println(i+j);
	}
	public void add(int i,int j,int k) {
		System.out.println(i+j+k);
	}
	public void add(double i,double j,int k) {
		System.out.println(i+j+k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition addition = new Addition();
		addition.add(5,5);
		addition.add(10,20,30);
		addition.add(5.5,5.5,5);

	}

}
