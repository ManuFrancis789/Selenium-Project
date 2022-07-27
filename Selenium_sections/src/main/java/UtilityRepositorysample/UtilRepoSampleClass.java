package UtilityRepositorysample;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
//import org.testng.ITestResult;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilRepoSampleClass 
{
	WebDriver driver;
	
public WebDriver launchBrowserMethod(String url,String browserName)
{
	switch (browserName) 
	{
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	break;
	
	case "edge":
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	break;

	default:
		break;
	}
	driver.manage().window().maximize();
	driver.get(url);
	return(driver);
	}


public void screenshotMethod(String ResultName) throws Exception
{
	 Date d = new Date();
	  String date = d.toString().replace(":", "_").replace(" ", "_") + ".png";
	  TakesScreenshot ts=(TakesScreenshot)driver;
	  File source=ts.getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(source, new File("./Screenshots/"+ResultName +date));
	  System.out.println("Screenshot taken");
}

public void alertAccept() 
{
	Alert objectalert = driver.switchTo().alert();
	objectalert.accept();
}

}
