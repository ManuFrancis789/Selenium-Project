package Samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommandsSample {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php\r\n");
		driver.manage().window().maximize();  // for maximize the window
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());   // for get CurrentURL
		
		driver.findElement(By.linkText("Click Here")).click();
		
		//System.out.println(driver.getPageSource());   //for get page source code

		//driver.close();   // 
		//driver.navigate().to("https://www.google.com\r\n");
		//driver.get("http://demo.guru99.com/popup.php\r\n");
		//driver.manage().window().maximize();
		////driver.manage().window().minimize();  //For minimizing the window
		//driver.close();
		driver.quit();
	}

}
