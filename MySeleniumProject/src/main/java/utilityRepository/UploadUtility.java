package utilityRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadUtility
{
	WebDriver driver;
	 public void uploadMethod(By properties,String chooseFile,String path) 
	  {
		   WebElement upload = driver.findElement(properties);
		   upload.sendKeys(path);
				   
	  }
}
