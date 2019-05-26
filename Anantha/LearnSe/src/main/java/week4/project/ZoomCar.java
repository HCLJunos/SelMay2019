package week4.project;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ZoomCar {

	public static void main(String[] args) {
		// 
		// Launch facebook site using chrome
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				ChromeDriver driver = new ChromeDriver(options);
				
				//Launch zoomcar site (chennai)
				driver.get("https://www.zoomcar.com/chennai");
				driver.manage().window().maximize();
				
				//  3. Click on the Start your wonderful journey link
				driver.findElementByXPath("//a[text()='Start your wonderful journey']").click();
				driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
				
				
				//	4. In the Search page, Click on the any of the pick up point under POPULAR PICK-UP POINTS
				//List<WebElement> popularPickUpPoints = driver.findElementsByXPath("//div[@class='component-popular-locations']");
				driver.findElementByXPath("(//div[@class='items'])[1]").click();

				//	5. Click on the Next button
				driver.findElementByTagName("button").click();

				//	6. Specify the Start Date as tomorrow Date
				
				// Get the current date				
				Date date = new Date(); //import java.util.Date;

				//Get only the date (and not month, year, time etc)						
				DateFormat sdf = new SimpleDateFormat("dd");
				 
				// Get today's date						
				String today = sdf.format(date);

				// Convert to integer and add 1 to it				 
				int tomorrow = Integer.parseInt(today)+1;

				// Print tomorrow's date						
				System.out.println(tomorrow);
				
				 
				//div[contains(text(),"27")]
				driver.findElementByXPath("//div[contains(text(),'"+tomorrow+"')]").click();

				//	7. Click on the Next Button
				driver.findElementByTagName("button").click();

				//	8. Confirm the Start Date and Click on the Done button

				//	9. In the result page, capture the number of results displayed.

				//	10. Find the highest value and report the brand name.

				//	11. click on the Book Now button for it.

				//	12. Close the Browser.
				//driver.close();				

	}

}
