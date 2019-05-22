package week3.day1;

public class InterfaceClass implements LearnInterface{
	
	public static void main(String[] args) {

		//LearnInterface obj = new LearnInterface();
		LearnInterface obj = new InterfaceClass();
		//num = 10; // as 
		obj.sampleMethod();
		
		InterfaceClass obj1 = new InterfaceClass();
		obj1.sampleMethod1();

	}

	//num= 10;
	@Override
	public void sampleMethod() {
		// TODO Auto-generated method stub
		System.out.println("This is from sample method "+num);
	}
	public void sampleMethod1() {
		// TODO Auto-generated method stub
		System.out.println("This is from sample method 1");
	}

}
