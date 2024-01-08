package task2.Hierar;

public class Daughter extends Father {
	
	private String home1;
	
	public Daughter(String assets, String home1) {
		super(assets);
		this.home1 = home1;
	}
	

	public String getDaughterDetails() {
		return "Daughter [home1=" + home1 + "]";
	}
	
	

}
