package task4;

public class Tree {
	
	private String tName;
	private int tHeight;
	
	public Tree(String tName, int tHeight) {
		super();
		this.tName = tName;
		this.tHeight = tHeight;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree t1=new Tree("Neem",7);
		Tree t2 =new Tree("Neem",7);
		
		System.out.println(t1==t2);// Compares object address (Shallow comparision)(memory comparision-memory addresses)
		/**compares data inside the objects
		System.out.println(t1.tHeight==t2.tHeight);
		System.out.println(t1.tName==t2.tName);
		
		1.equals(t2) by which feature it compares? will compare with tname or theight? Since there is clarity
		 *  by programmer it will also compare by address. to over come this issue we need to override equals()method
		 */
		
		System.out.println(t1.equals(t2));

	}



	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Tree tree=(Tree)obj;
		return this.tHeight==tree.tHeight;
	}

}
