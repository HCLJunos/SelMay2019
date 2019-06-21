package codingchallenges.answers;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NumberOfMonthDays {

	public static void findMaxDaysofMonth(int month, int year) {
		// Here, we are pointing to day 1 of the month to find the total days available in the month
		int date = 1;
		Format formatter = new SimpleDateFormat("MMMM");        
        String monthName = formatter.format(new Date(year, month-1, 01)); // month in Java started from 0 instead of 1
		
		// instance of calendar object
		Calendar calendar = Calendar.getInstance();
		
		if(month>-1 && month<12) {
			// Setting date calendar date format as yyyy-mm-dd
	        calendar.set(year, month-1, date); 
	        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	        System.out.println("Max Day in "+monthName+" month of year "+year+" is: " + maxDay);
		}
		else
		{
			System.out.println("Please provide Valid Number between 1 to 12");
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		int mm=02,year=2016;
		
        findMaxDaysofMonth(mm,year);  
    }
}