package codingchallenges.answers;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FlipkartBookSelection {

	public static void main(String[] args) throws InterruptedException {
		
		String searchQuery = "books";
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(new FirefoxProfile());
		options.addPreference("dom.webnotifications.enabled", false);
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(searchQuery);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		
		// if no search results
		try {
			String noResults = driver.findElement(By.xpath("//div[@class='DUFPUZ']/text()")).getText();
			if (noResults.equals("Sorry, no results found!")){
				System.out.println(noResults+" for '"+searchQuery+"'");
			}
		}
		catch(Exception e) {
			System.out.println("Search Results found for '"+searchQuery+"'");
		}
		
		Thread.sleep(5000);	
		
		// clicking on first search result
		driver.findElement(By.xpath("(//div[@class='_3O0U0u'])[1]/div[1]")).click();
		
		//driver.close();
		driver.quit();
	}
}

//String results = driver.findElement(By.xpath("//div[@class='_1joEet']/following::span[@class='_2yAnYN']")).getText();
//System.out.println(results);
//if (results.contains("of")) 			//results more than one page
//{
//		//clicking on first search result from first results page
//		driver.findElement(By.xpath("(//div[@class='_3O0U0u'])[1]/div[1]")).click();			
//}
//clicking on first search result