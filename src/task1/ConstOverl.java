package task1;

public class ConstOverl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankDetails details1=new BankDetails("123abc","John");
		BankDetails details2=new BankDetails("456def","David",23500.67);
		
		System.out.println(details1.getBankDetails());
				
		System.out.println(details2.getBankDetails());
		

	}

}
