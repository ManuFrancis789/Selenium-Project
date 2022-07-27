package Samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommandsFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	      //  DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	        //capabilities.setCapability("marionette", true);
	        //WebDriver driver = new FirefoxDriver(capabilities);
	        WebDriver driver= new FirefoxDriver();
	/*System.setProperty("webdriver.firefox.bin",
				"C:\\Users\\91859\\Downloads\\FirefoxPortable\\Firefoxportable.exe");*/
		/////////
			WebDriverManager.firefoxdriver().setup();
	//	WebDriverManager.firefoxdriver().setup(); 
		//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	     
	//	WebDriver driver = new FirefoxDriver();
		
		//WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		//driver.navigate().to("https://www.facebook.com/");

	}

}
