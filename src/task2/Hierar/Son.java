package task2.Hierar;

public class Son extends Father {
	
	private String home;
	
	  public Son(String assets, String home) {
		super(assets);
		this.home = home;
	}

	public String getSonDetails() {
		return "Son [home=" + home + "]";
	}
	

}
