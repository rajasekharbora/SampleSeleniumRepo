package testcases.commontoall;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CMT {


	public static WebDriver driver = null;

	
	
	public void CheckAndCreateBrowser() throws InterruptedException {
		try {
			if(driver==null || driver.toString().contains("null")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\rbora\\workspace\\SamplePG\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}
		} catch(Exception eee) {
			System.out.println("While creating driver or page objects, exception is occured.");
		}
	}
	


}
