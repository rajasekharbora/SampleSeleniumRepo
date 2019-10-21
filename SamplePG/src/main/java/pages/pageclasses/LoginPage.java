package pages.pageclasses;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import testcases.commontoall.CMT;

public class LoginPage extends CommonToAllPage
{
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor jsExecutor;
	Actions action;



	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 60);
		jsExecutor = (JavascriptExecutor)driver;
		action = new Actions(driver);
	}

	CMT objCommonPage = new CMT();



	/**
	 * @param sUsername
	 * @param sPassword
	 * @return boolean
	 * @throws InterruptedException
	 * First Check for the IE Security Alert popup message accept it, Clicks Continue and again security popup message accepts.
	 * @throws IOException 
	 * @throws InvalidFormatException 
	 * @throws EncryptedDocumentException 
	 */
	//Method to login to the application


}