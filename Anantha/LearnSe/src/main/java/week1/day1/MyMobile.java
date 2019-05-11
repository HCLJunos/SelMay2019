package week1.day1;

public class MyMobile {

	public static void main(String[] args) {

		Mobile m = new Mobile();
		
		String mobileModel = m.printMobileModel("iPhone");
		
		System.out.println("Mobile Model: "+mobileModel+"\nActive Sims: "+m.activeSims()+"\n"+m.callNumber("9894691648"));
		//String callingNumber = m.callNumber("9894691648");
		System.out.println("\nMobile number "+"+919876543210"+" belongs to "+m.saveContact("+919876543210"));
		System.out.println("\nMobile number "+"+9101234567890"+" belongs to "+m.saveContactSwitch("+9101234567890"));
	}
}
