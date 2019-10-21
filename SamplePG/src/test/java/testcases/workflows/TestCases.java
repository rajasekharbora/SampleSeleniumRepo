package testcases.workflows;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import testcases.commontoall.CMT;

public class TestCases extends CMT 
{	
	@Test
	public void launchTestApp() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	{	
		CheckAndCreateBrowser();
		driver.get("http://thedemosite.co.uk/index.php");
		driver.quit();
	}

	
}
