package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import elementRepository.LoginElements;
import elementRepository.ManagePagesElements;
import utilityRepository.ExcelRead;

public class ManagePages extends BaseClass
{
	LoginElements loginObj;
	ExcelRead excelObj;
	ManagePagesElements managePageObj;
  @Test
  public void validateManagePagesSearchOptionWithPageName() throws Exception 
  {
	  loginObj = new LoginElements(driver);
	  excelObj = new ExcelRead();
	  managePageObj = new ManagePagesElements(driver);
	  
	  loginObj.loginMethod(Constants.username,Constants.password);
	  managePageObj.managePagesClickMethod();
	  
	  managePageObj.clickSearchbtn();
	  managePageObj.searchTextBoxEnterdata(excelObj.readingStringData(2, 3));
	  managePageObj.clickSubmitSearch();
	  
	  boolean actual = managePageObj.isDisplayedFlowers();
	  
	  Assert.assertTrue(actual);
	
	 
  }
}
