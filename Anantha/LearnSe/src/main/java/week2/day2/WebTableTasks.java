package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//launching Leaf Ground site
		driver.get("http://leafground.com");
		
		//Navigating to Table page
		driver.findElementByXPath("//img[@alt='Table']").click();
		
		//Table
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		//WebElement nRowCheckbox = checkBoxes.get(checkBoxes.size()-1);
		//nRowCheckbox.click();
		checkBoxes.get(checkBoxes.size()-1).click();
		
		//driver.findElementByXPath("(//input[@type='checkbox'])[3]").click();
		
		System.out.println();
		
	}

}
