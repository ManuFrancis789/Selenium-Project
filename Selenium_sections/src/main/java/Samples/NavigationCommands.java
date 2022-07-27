package Samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommands 
{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HELLO");

		
	WebDriverManager.chromedriver().setup();// instead of System.property()

	//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.co.in/");

	
	
	}

}
