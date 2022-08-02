package testCases;

import org.openqa.selenium.Keys;
import org.testng.Assert;
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
	  
	  String excpected = Constants.excpectedName;
	  String actual = delObj.getNameOfDeliveryBoy();
	  
	  Assert.assertEquals(actual, excpected);
	    
  }
  @Test(priority=2)
  public void validateSearchDeliveryBoyWithValidName() throws Exception 
  {
	  
	  excelObj = new ExcelRead();
	  delObj = new ManageDeliveryBoyElement(driver);
	  
	  delObj.clickSearchButton();
	  delObj.typeNameSearchTextBox(excelObj.readingStringData(6, 0));
	  delObj.clickSearchSubmitbutton();
		  
	  String excpected = Constants.excpectedName;
	  String actual = delObj.getNameOfDeliveryBoy();
	  
	  delObj.clickSearchResettbutton();
	  
	  Assert.assertEquals(actual, excpected);
		    
  }
  
  @Test(priority=3)
  public void validateSearchDeliveryBoyWithValidPhoneNumber() throws Exception 
  {
	  
	  excelObj = new ExcelRead();
	  delObj = new ManageDeliveryBoyElement(driver);
	  
	  delObj.clickSearchButton();
	  delObj.typePhoneNumberSearchTextBox(excelObj.readingIntegerData(8, 0));
	  delObj.clickSearchSubmitbutton();
	  
	  
	  String excpected = Constants.excpectedName;
	  String actual = delObj.getNameOfDeliveryBoy();
	  
	  delObj.clickSearchResettbutton();
	  Assert.assertEquals(actual, excpected);
		    
  }
  
  @Test(priority=4)
  public void validateSearchDeliveryBoyWithValidEmail() throws Exception 
  {
	  
	  excelObj = new ExcelRead();
	  delObj = new ManageDeliveryBoyElement(driver);
	  
	  delObj.clickSearchButton();
	  delObj.typeEmailSearchTextBox(excelObj.readingStringData(7, 0));
	  delObj.clickSearchSubmitbutton();
	 
	  
	  String excpected = Constants.excpectedName;
	  String actual = delObj.getNameOfDeliveryBoy();
	  
	  delObj.clickSearchResettbutton();
	  Assert.assertEquals(actual, excpected);
		    
  }
  @Test(priority=5)
  public void validateSearchDeliveryBoyWithInvalidName() throws Exception 
  {
	  
	  excelObj = new ExcelRead();
	  delObj = new ManageDeliveryBoyElement(driver);
	  
	  delObj.clickSearchButton();
	  delObj.typeNameSearchTextBox(Constants.searchName);
	  delObj.clickSearchSubmitbutton();
	 
	  
	  String excpected = Constants.excpectedSearchNameNotInList;
	  String actual = delObj.getNameOfDeliveryBoy();
	  
	  delObj.clickSearchResettbutton();
	  Assert.assertEquals(actual, excpected);
		    
  }
  
  @Test(priority=6)
  public void validateSearchDeliveryBoyWithInvalidPhoneNumber() throws Exception 
  {
	  
	  excelObj = new ExcelRead();
	  delObj = new ManageDeliveryBoyElement(driver);
	  
	  delObj.clickSearchButton();
	  delObj.typePhoneNumberSearchTextBox(Constants.searchPhoneNumber);
	  delObj.clickSearchSubmitbutton();
	 
	  
	  String excpected = Constants.excpectedSearchNameNotInList;
	  String actual = delObj.getNameOfDeliveryBoy();
	  
	  delObj.clickSearchResettbutton();
	  
	  Assert.assertEquals(actual, excpected);
		    
  }
  
  @Test(priority=7)
  public void validateSearchDeliveryBoyWithInvalidEmail() throws Exception 
  {
	  
	  excelObj = new ExcelRead();
	  delObj = new ManageDeliveryBoyElement(driver);
	  
	  delObj.clickSearchButton();
	  delObj.typeEmailSearchTextBox(Constants.searchEmail);
	  delObj.clickSearchSubmitbutton();
	 
	  
	  String excpected = Constants.excpectedSearchNameNotInList;
	  String actual = delObj.getNameOfDeliveryBoy();
	  
	  delObj.clickSearchResettbutton();
	  
	  Assert.assertEquals(actual, excpected);
		    
  }
  
  @Test(priority=9)
  public void validateDeleteDeliveryBoy() throws Exception 
  {
	  
	  delObj = new ManageDeliveryBoyElement(driver);
	  
	  delObj.clickDeleteButton();
	  utilobj.alertAccept();
	  delObj.clickAlert();
		    
  }
  
  @Test(priority=8)
  public void validateUpdateDeliveryBoy() throws Exception 
  {
	  
	  excelObj = new ExcelRead();
	  delObj = new ManageDeliveryBoyElement(driver);
	  delObj.clickUpdateButton();
	  delObj.typeName(excelObj.readingStringData(6, 4));
	  delObj.emailTextBoxClear();
	  delObj.typeEmail(excelObj.readingStringData(7, 4));
	  delObj.typePhoneNumber(excelObj.readingIntegerData(8, 4));
	  delObj.typeAddress(excelObj.readingStringData(9, 4));
	  delObj.typeUsername(excelObj.readingStringData(10, 4));
	  delObj.typePassword(excelObj.readingStringData(11, 4));
	  delObj.clickSaveUpdateButton();
	  
	 
		    
  }
  
  @Test(priority=9)
  public void validateActiveButtonStatusOfDeliveryBoy() 
  {
	  delObj = new ManageDeliveryBoyElement(driver);
	  
	  if(delObj.getActiveBtnStatus()==Constants.activeBtn)
	  {
		  delObj.clickActiveBtn();
		  delObj.clickAlert();
		  
		  String excpected = Constants.inactiveBtn;
		  String actual = delObj.getActiveBtnStatus();
		  
		  Assert.assertEquals(actual, excpected);
	  }
	  
	  else if(delObj.getActiveBtnStatus()==Constants.inactiveBtn)
	  {
		  delObj.clickActiveBtn();
		  delObj.clickAlert();
		  
		  String excpected = Constants.activeBtn;
		  String actual = delObj.getActiveBtnStatus();
		  
		  Assert.assertEquals(actual, excpected); 
	  }
	  	    
  }
  
}
