package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		
		WebElement we = driver.findElementById("iframeResult");
		driver.switchTo().frame(we);
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		//WebElement we = driver.findElementByXPath("//button[text()='Prompt Box']")
		Alert myPromptAlert = driver.switchTo().alert();
		String message = "This is test message";
		myPromptAlert.sendKeys(message);
		myPromptAlert.accept();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(we);
		//String testMessage = driver.findElementById("demo").getText();
		//System.out.println(testMessage);
		//if (testMessage.contains(message)) {
		
		if (driver.findElementById("demo").getText().contains(message)) {
			System.out.println("Yes. It contains our test message");
		}
		else{
			System.out.println("Sorry. It does not contains our test message");
		}
		
		driver.close();
	}
}
