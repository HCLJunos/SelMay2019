package codingchallenges.answers;

public class NumberOfMonthDaysTraditionalWay {
	public static int number_Of_DaysInMonth=0;
	public static void findNumberOfDaysInMonth(int month, int year) {
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
		{
			number_Of_DaysInMonth = 31; 	
		}
		else if ( month == 4 || month == 6 || month == 9 || month == 11 )
		{
			number_Of_DaysInMonth = 30;	
		}  
		else if (month==2) // If the month is February
		{
			// Finding if the year provided is a leap year or not
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
	            number_Of_DaysInMonth = 29;
	        } else {
	            number_Of_DaysInMonth = 28;
	        }
		}			
		else {
			System.out.println("Please provide Valid Number between 1 to 12");
			System.exit(0);
		}		
	}
	
	public static void main(String[] args) {
		int mm=0, year =2016;
		findNumberOfDaysInMonth(mm,year);
		System.out.println("Number of days in "+mm+" is: "+number_Of_DaysInMonth);
	}
}
