package week4.project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLikes {

	public static void main(String[] args) {
		// Launch facebook site using chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Enter facebook credentials and Login
		driver.findElementById("email").sendKeys("ananthamuruga@gmail.com");
		driver.findElementById("pass").sendKeys("SriKrishna_10");
		driver.findElementByXPath("//input[@value='Log In']").click();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		//Search for "TestLeaf" in search box and click on search icon
		driver.findElementByXPath("//input[@data-testid='search_input']").sendKeys("TestLeaf");
		driver.findElementByXPath("//button[@data-testid='facebar_search_button']").click();
		
		
		//Verify that testleaf is displayed in the result window under the places
		driver.findElementByLinkText("Places").click();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		//driver.findElementsByLinkText("TestLeaf");
		//List<WebElement> findElementsByLinkText = driver.findElementsByLinkText("TestLeaf");
		driver.findElementByXPath("//a[text()='TestLeaf']").click();
		
		
		//Capture the text of the Like button
		String likeButtonText = driver.findElementByXPath("//a[@data-testid='page_profile_liked_button_test_id']").getText();
		//System.out.println("likeButtonText: "+likeButtonText);
		
		//If the text is "Liked" then report it is already liked
		if (likeButtonText.equals("Liked")) {
			System.out.println("Already Liked");
		}		
		//Click on the Link Testleaf
		else {
			driver.findElementByXPath("//a[@data-testid='page_profile_liked_button_test_id']").click();
		}
		
		//Verify whether the title contains the text Testleaf
		System.out.println("Page Title: "+driver.getTitle());
		
		//Capture the number of Likes for the page
		String likeCount = driver.findElementByXPath("(//span[text()='Community'])[2]/following::div[contains(text(),'people like this')]").getText();
		System.out.println(likeCount);
		
		//Close the browser
		driver.close();
		

	}

}
