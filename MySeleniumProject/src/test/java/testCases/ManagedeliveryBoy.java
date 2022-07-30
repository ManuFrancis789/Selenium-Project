package testCases;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import constants.Constants;
import elementRepository.LoginElements;
import elementRepository.ManageDeliveryBoyElement;
import utilityRepository.ExcelRead;

public class ManagedeliveryBoy extends BaseClass
{
	LoginElements loginObj;
	ExcelRead excelObj;
	ManageDeliveryBoyElement delObj;
	
  @Test(priority=1)
  public void validateAddNewDeliveryBoy() throws Exception 
  {
	  loginObj = new LoginElements(driver);
	  excelObj = new ExcelRead();
	  delObj = new ManageDeliveryBoyElement(driver);
	  
	  loginObj.loginMethod(Constants.username, Constants.password);
	  delObj.clickManageDeliveryBoy();
	  
	  delObj.clickNewButton();
	  delObj.typeName(excelObj.readingStringData(6, 0));
	  delObj.typeEmail(excelObj.readingStringData(7, 0));
	  delObj.typePhoneNumber(excelObj.readingIntegerData(8, 0));
	  delObj.typeAddress(excelObj.readingStringData(9, 0)+Keys.ENTER +
			  excelObj.readingStringData(9, 1)+ Keys.ENTER +
			  excelObj.readingIntegerData(9, 3));
	  delObj.typeUsername(excelObj.readingStringData(10, 0));
	  delObj.typePassword(excelObj.readingStringData(11, 0));
	  delObj.clicksave();
	
	    
  }
  @Test(priority=2)
  public void validateSearchDeliveryBoyWithValidName() throws Exception 
  {
	  
	  excelObj = new ExcelRead();
	  delObj = new ManageDeliveryBoyElement(driver);
	  
	  delObj.clickSearchButton();
	  delObj.typeNameSearchTextBox(excelObj.readingStringData(6, 0));
	  delObj.clickSearchSubmitbutton();
	  delObj.clickSearchResettbutton();
		    
  }
  
  @Test(priority=3)
  public void validateSearchDeliveryBoyWithValidPhoneNumber() throws Exception 
  {
	  
	  excelObj = new ExcelRead();
	  delObj = new ManageDeliveryBoyElement(driver);
	  
	  delObj.clickSearchButton();
	  delObj.typePhoneNumberSearchTextBox(excelObj.readingIntegerData(8, 0));
	  delObj.clickSearchSubmitbutton();
	  delObj.clickSearchResettbutton();
		    
  }
  
  @Test(priority=4)
  public void validateSearchDeliveryBoyWithValidEmail() throws Exception 
  {
	  
	  excelObj = new ExcelRead();
	  delObj = new ManageDeliveryBoyElement(driver);
	  
	  delObj.clickSearchButton();
	  delObj.typeEmailSearchTextBox(excelObj.readingStringData(7, 0));
	  delObj.clickSearchSubmitbutton();
	  delObj.clickSearchResettbutton();
		    
  }
  @Test(priority=5)
  public void validateSearchDeliveryBoyWithInvalidName() throws Exception 
  {
	  
	  excelObj = new ExcelRead();
	  delObj = new ManageDeliveryBoyElement(driver);
	  
	  delObj.clickSearchButton();
	  delObj.typeNameSearchTextBox(Constants.searchName);
	  delObj.clickSearchSubmitbutton();
	  delObj.clickSearchResettbutton();
		    
  }
  
  @Test(priority=6)
  public void validateSearchDeliveryBoyWithInvalidPhoneNumber() throws Exception 
  {
	  
	  excelObj = new ExcelRead();
	  delObj = new ManageDeliveryBoyElement(driver);
	  
	  delObj.clickSearchButton();
	  delObj.typePhoneNumberSearchTextBox(Constants.searchPhoneNumber);
	  delObj.clickSearchSubmitbutton();
	  delObj.clickSearchResettbutton();
		    
  }
  
  @Test(priority=7)
  public void validateSearchDeliveryBoyWithInvalidEmail() throws Exception 
  {
	  
	  excelObj = new ExcelRead();
	  delObj = new ManageDeliveryBoyElement(driver);
	  
	  delObj.clickSearchButton();
	  delObj.typeEmailSearchTextBox(Constants.searchEmail);
	  delObj.clickSearchSubmitbutton();
	  delObj.clickSearchResettbutton();
		    
  }
  
  @Test(priority=8)
  public void validateDeleteDeliveryBoy() throws Exception 
  {
	  
	  excelObj = new ExcelRead();
	  delObj = new ManageDeliveryBoyElement(driver);
	  
	  delObj.clickDeleteButton();
	  utilobj.alertAccept();
	  delObj.clickAlert();
		    
  }
  
}
