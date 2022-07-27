package UtilityRepository;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityRepositoryClass 
{
	WebDriver driver;
	public WebDriver browserLaunch(String url,String browserName)
	{
		/*switch(browserName)
		{
		case "edge":
		
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
			break;
			
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			break;
		
		default:
			break;
		}
			*/
		
		
		if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
			
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
		return(driver);
	}
	//////////for page factory
	public void clickMethodUtility(By property)
	{
		driver.findElement(property).click();
		
	}
	
	public void sendkeysMethodUtility(By property,String text)
	{
		driver.findElement(property).sendKeys(text);
		
	}
	public void clearMethodUtility(By property)
	{
		driver.findElement(property).clear();
		
	}
	
	public void alertAccept() 
	{
		Alert objectalert = driver.switchTo().alert();
		objectalert.accept();
	}
	
		
	public void AlertDismiss() 
	{
		Alert objectalert = driver.switchTo().alert();
		objectalert.dismiss();
	}
	
	public void promptAlert(String text) 
	{
		 Alert objectalert = driver.switchTo().alert();
		 objectalert.sendKeys(text);
		 objectalert.accept();
	}
	
	public void scrollMethod(WebElement element)
	{
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].scrollIntoView()",element);
		
	}
	public void scrollByPixels(int x,int y)
	{
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(x,y)");
		
	}
	public void fullPageScroll()
	{
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	
	
}
