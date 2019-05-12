package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//launching jqueryui.com/droppable
		driver.get("http://jqueryui.com/droppable/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//maximizing the browser window
		driver.manage().window().maximize();
		
		//Self Notes: next week class have to see about frame
		driver.switchTo().frame(0);		
		
		WebElement sourceElement = driver.findElementByXPath("//div[@id='draggable']/p");
		WebElement destinationElement = driver.findElementByXPath("//div[@id='droppable']/p");
		
		Actions builder = new Actions(driver);
		
		builder.dragAndDrop(sourceElement, destinationElement).perform();
		

	}

}
