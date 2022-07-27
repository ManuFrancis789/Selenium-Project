package Samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommands1Edge {

	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		/////////refresh with get
		driver.get("https://www.facebook.com/");
		driver.get("https://www.facebook.com/");
		
		////////refresh with navigate();
		
		driver.navigate().to("https://www.javatpoint.com/");
		driver.navigate().refresh();

	}

}
