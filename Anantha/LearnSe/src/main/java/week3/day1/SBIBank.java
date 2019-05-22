package week3.day1;

public class SBIBank implements RBI, CIBIL{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBIBank sbi = new SBIBank();
		sbi.SetTransLimit();
		sbi.getCreditScore();
	}

	@Override
	public void getCreditScore() {
		System.out.println("Your CIBIL score is above 750");
		
	}

	@Override
	public void SetTransLimit() {
		System.out.println("TransLimit per day is 200000");
		
	}

}
