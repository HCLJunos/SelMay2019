package week3.day1;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Mobile {

	public void sendSMS() {
		System.out.println("Message delivered");
	}
	
	public void answerCall() {
		System.out.println("call attended");
	}
	
	public void playMusic() {
		System.out.println("playing music using system player");
	}
	
	public static void main(String[] args) {
		AndroidMobile android = new AndroidMobile();
		AppleMobile iPhone = new AppleMobile();
		
		android.playMusic();
		iPhone.playMusic();
		iPhone.answerCall();	
		
//		ChromeDriver driver = new ChromeDriver();
//		WebDriver webDriver = new ChromerDriver();
//		driver.close();
//		webDriver.
	
	}

}
