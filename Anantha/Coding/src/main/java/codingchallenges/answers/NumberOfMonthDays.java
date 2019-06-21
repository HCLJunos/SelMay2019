package codingchallenges.answers;
import java.util.Calendar;

public class NumberOfMonthDays {

	public static Calendar calendar;
	public static void findMaxDaysofMonth(int month, int year) {
		// Here, we are pointing to day 1 of the month to find the total days available in the month
		int date = 1;	
		
		// Setting date calendar date format as yyyy-mm-dd
        calendar.set(year, month-1, date); // month in Java started from 0 instead of 1
        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Max Day in month "+Calendar.MONTH+" is: " + maxDay);
	}
	
	public static void main(String[] args) {
        // instance of calendar object
        calendar = Calendar.getInstance();        
        findMaxDaysofMonth(02,2016);
    }
}