package week1.day2;

public class CWDay2 {
	
	public static void greatestNum(int num1, int num2, int num3) {			
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1);				
		}
		else if (num2>num3) {
			System.out.println(num2);
		}
		else
		{
			System.out.println(num3);
		}
	}
	
	public static void sumOfOddNum() {
		int sum=0;
		for(int i=0;i<=20;i++) {
			if((i%2!=0)) {
				sum=sum+i;
		 }
		}
		System.out.println(sum);		
	}
	
	public static void primeNumCheck(int num) {
		
		if(num%2!=0 && num%num==0) {
			System.out.println("Yes. The provided number "+num+" is a prime number");
		}
		else {
			System.out.println("The provided number "+num+" is not a prime number");
		}
		
	}
	public static void main(String[] args) {
		
		//1. Print greatest of 3 numbers
		greatestNum(10,5,11);
		
		// 2. Sum of odd numbers upto 20
		sumOfOddNum();
		
		// 3. Print given number is prime or not
		primeNumCheck(15);
		
	}

}
