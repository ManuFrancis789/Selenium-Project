package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import constants.Constants;
import elementRepository.LoginElements;
import elementRepository.ManagePagesElements;
import utilityRepository.ExcelRead;
import utilityRepository.UploadUtility;

public class ManagePages extends BaseClass
{
	LoginElements loginObj;
	ExcelRead excelObj;
	ManagePagesElements managePageObj;
	UploadUtility uploadObj;
  @Test(priority=1)
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
	  
	String actual = managePageObj.getSearchAttributeValue();
	String excpected = Constants.excpectedSearchflower;
	
	utilobj.back();
	utilobj.back();
	
	Assert.assertEquals(actual, excpected);
	  	 
  }
	
	
  
  @Test(dataProvider = "manage pages",priority=5)
  public void validateAddNewPageOption(String title,String name,String description) throws Exception 
  {
	  loginObj = new LoginElements(driver);
	  excelObj = new ExcelRead();
	  managePageObj = new ManagePagesElements(driver);
	  
	 	  
	  managePageObj.newBtnClick();
	  managePageObj.pageTitleSendKeys(title);
	  managePageObj.pageNameSendKeys(name);
	  managePageObj.pageDescriptionSendKeys(description);
	  managePageObj.uploadImage(Constants.uploadImagePath);
	  managePageObj.clickSaveEnterkey();
	  utilobj.back();
	  utilobj.refreshPage();
	  utilobj.back();
	  String actual = managePageObj.getPageTitle();
	  String excpected = Constants.addNewPageStringTitle;
	  managePageObj.clickDelete();
	  utilobj.alertAccept();
	  managePageObj.clickDeleteAlert();
	  
	  Assert.assertEquals(actual, excpected);
	  
	  	 
  }
  
  @DataProvider(name ="manage pages")
  public Object[][] dp() 
  {
    return new Object[][]
    		{
      new Object[] { Constants.addNewPageStringTitle,Constants.addNewPageStringTitle,Constants.addNewPageStringdescription },
        
    };
  }
  
  @Test(priority=2)
  public void validateTextBoxesinAddNewPageOption() throws Exception 
  {
	 
	  managePageObj = new ManagePagesElements(driver);
	  
	  managePageObj.managePagesClickMethod();
	  managePageObj.newBtnClick();
	  managePageObj.pageTitleSendKeys(Constants.addNewPageStringTitle);
	  managePageObj.pageNameSendKeys(Constants.addNewPageStringPageName);
	  managePageObj.pageDescriptionSendKeys(Constants.addNewPageStringdescription);
	  Assert.assertEquals(Constants.addNewPageStringTitle,managePageObj.getAddnewPageTitleAttributeValue());
	  Assert.assertEquals(Constants.addNewPageStringPageName,managePageObj.getAddnewPageNameAttributeValue()); 
	
  }
  @Test(priority=3)
  public void validateUploadImagesinAddNewPageOption() throws Exception 
  {
	
	  managePageObj = new ManagePagesElements(driver);
	  managePageObj.uploadImage(Constants.uploadImagePath);
	  Assert.assertFalse(managePageObj.isUploadImageValueAttributeEmpty());
	  utilobj.back();
  }
  
  @Test(priority=4)
  public void validateDeleteButton() throws Exception 
  {
	 
	  managePageObj = new ManagePagesElements(driver);
	  managePageObj.clickDelete();
	  utilobj.alertAccept();
	  String actual = managePageObj.getDeleteAlerttext();
	  String excpected = Constants.excpectedDelete;
	  
	  managePageObj.clickDeleteAlert();
	  
	  Assert.assertEquals(actual, excpected);
	
  }

  
}
