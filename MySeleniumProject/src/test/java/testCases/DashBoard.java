package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import elementRepository.AdminUsersElements;
import elementRepository.DashBoardElements;
import elementRepository.LoginElements;
import utilityRepository.ExcelRead;

public class DashBoard extends BaseClass
{
	LoginElements loginObj;
	ExcelRead excelObj;
	DashBoardElements dashObj;
  @Test
  public void validate() throws Exception 
  {
	  loginObj = new LoginElements(driver);
	  excelObj = new ExcelRead();
	  dashObj = new DashBoardElements(driver);
	  loginObj.loginMethod(Constants.username,Constants.password);
	  
  }
}
