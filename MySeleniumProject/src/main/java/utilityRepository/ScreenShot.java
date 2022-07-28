package utilityRepository;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot 
{
	
	public void screenshotMethod(String ResultName,WebDriver driver) throws Exception
	{
		
		  Date d = new Date();
		  String date = d.toString().replace(":", "_").replace(" ", "_") + ".png";
		  TakesScreenshot ts=(TakesScreenshot)driver;
		  File source=ts.getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(source, new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots\\"+ResultName +date));
		  System.out.println("Screenshot taken");
	}


}
