package testCases;

import org.testng.annotations.Test;

import constants.Constants;
import utilityRepository.GeneralUtilities;
import utilityRepository.ScreenShot;

import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
	WebDriver driver;
	GeneralUtilities  utilobj = new GeneralUtilities();
	ScreenShot sh = new ScreenShot();
	public static Properties po;
	public static void testBasic() throws Exception
	{
		po = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\Properties\\Configaration.properties");
		po.load(file);
	}
	/*
	@DataProvider(name ="manage pages")
	  public Object[][] dp() 
	  {
	    return new Object[][]
	    		{
	      new Object[] { Constants.addNewPageStringTitle,Constants.addNewPageStringTitle,Constants.addNewPageStringdescription },
	      new Object[] { Constants.addNewPageIntegerTitle,Constants.addNewPageIntegerName,Constants.addNewPageIntegerDescription},
	    
	    };
	  }
 */
  @BeforeMethod
  public void beforeMethod() 
  {
  }

  @AfterMethod
  public void afterMethod(ITestResult result) throws Exception 
  {
	  if(ITestResult.FAILURE==result.getStatus())
	  {
	  String resultName = result.getName(); 
	  sh.screenshotMethod(resultName,driver);
	  }
  }
  
 @Parameters({"browser"})
@BeforeClass
public void beforeClass(String browser) throws Exception
{
	  testBasic();
	  driver = utilobj.browserLaunch(po.getProperty("URL"), browser);
	}

 
 @AfterClass
 public void afterClass()
 {
	 utilobj.closeBrowser();
 }
  @BeforeTest
  public void beforeTest() 
  {
		
  }

  @AfterTest
  public void afterTest() 
  {
	  utilobj.quitBrowser();
  }

}
