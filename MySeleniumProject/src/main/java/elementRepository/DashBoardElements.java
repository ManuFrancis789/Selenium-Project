package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilityRepository.GeneralUtilities;

public class DashBoardElements 
{
	WebDriver driver;
	GeneralUtilities utilobj = new GeneralUtilities();

	
	
	public DashBoardElements(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
}
