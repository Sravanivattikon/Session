package task2.Hierar;

public class Hierara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son son=new Son("Apartment","Villa");
		System.out.println("Son can access his own villa "+son.getSonDetails());
		System.out.println("Son can access his fathers asset also "+son.getFatherDetails());
		
		System.out.println("----------------------------------------------");
		
		Daughter daughter=new Daughter("Apartment","Duplex");
		System.out.println("Daughter can acces his own duplex house "+daughter.getDaughterDetails());
		System.out.println("Daughter cal also access his fathers assets "+daughter.getFatherDetails());	

	}

}
