package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import elementRepository.LoginElements;
import elementRepository.ManageDeliveryBoyElement;
import utilityRepository.ExcelRead;
import elementRepository.ManageLocationsElements;

public class ManageLocations extends BaseClass 
{
	  LoginElements loginObj;
	  ExcelRead excelObj;
	  ManageLocationsElements locationObj;
	
  @Test(priority =1)
  public void validateAddNewLocation() throws Exception 
  {
	  loginObj = new LoginElements(driver);
	  excelObj = new ExcelRead();
	  locationObj = new ManageLocationsElements(driver);
	  
	  loginObj.loginMethod(Constants.username,Constants.password);
	  locationObj.clickManageLocation();
	  locationObj.clicknewBtn();
	  locationObj.selectCountry(excelObj.readingStringData(15, 0));
	  locationObj.selectState(excelObj.readingStringData(16, 0));
	  locationObj.typedeliveryLocation(excelObj.readingStringData(17, 0));
	  locationObj.typedeliveryCharge(excelObj.readingIntegerData(18, 0));
	  
	  locationObj.clickSaveBtn();
	  locationObj.clickManageLocationTab();
	  
	  String actual=locationObj.getLocationName();
	  String excpected = Constants.locationName;
	  
	  Assert.assertEquals(actual, excpected, "location not added");  
  }
  @Test(priority =2)
  public void validateSearchWithCountryAndLocation() throws Exception
  {
	 
	  locationObj = new ManageLocationsElements(driver);
	  
	  locationObj.clickSearch();
	  locationObj.selectCountry(excelObj.readingStringData(15, 0));
	  locationObj.typedeliveryLocationSearch(excelObj.readingStringData(17, 0));
	  locationObj.clickSearchButton();
	  
	  String actual=locationObj.getLocationName();
	  String excpected = Constants.locationName;
	  
	  Assert.assertEquals(actual, excpected); 
	   
  }
  
  @Test(priority =3)
  public void validateSearchWithCountryAlone() throws Exception
  {
	  
	  locationObj = new ManageLocationsElements(driver);
	  
	  locationObj.clickSearch();
	  locationObj.selectCountry(excelObj.readingStringData(15, 0));
	  locationObj.clickSearchButton();
	  
	  String actual=locationObj.getCountryName();
	  String excpected = excelObj.readingStringData(15, 0);
	  
	  Assert.assertEquals(actual, excpected); 
	   
  }
  
  @Test(priority =4)
  public void validateDeleteLocation() throws Exception
  {
	  
	  locationObj = new ManageLocationsElements(driver);
	  
	  locationObj.clickdelete();
	  utilobj.alertAccept();
	  
	  String actual = locationObj.getAlertText();
	  String excpected = Constants.expectedClickAlert;
	  
	  locationObj.clickAlert();
	  
	  Assert.assertEquals(actual, excpected);
	 	 	   
  }
  
  @Test(priority=5)
  public void validateActiveButtonStatus() 
  {
	  locationObj = new ManageLocationsElements(driver);
	  
	  if(locationObj.getActiveBtnStatus()==Constants.activeBtn)
	  {
		  locationObj.clickActiveBtn();
		  locationObj.clickAlert();
		  
		  String excpected = Constants.inactiveBtn;
		  String actual = locationObj.getActiveBtnStatus();
		  
		  Assert.assertEquals(actual, excpected);
	  }
	  
	  else if(locationObj.getActiveBtnStatus()==Constants.inactiveBtn)
	  {
		  locationObj.clickActiveBtn();
		  locationObj.clickAlert();
		  
		  String excpected = Constants.activeBtn;
		  String actual = locationObj.getActiveBtnStatus();
		  
		  Assert.assertEquals(actual, excpected); 
	  }
  }
  
}
