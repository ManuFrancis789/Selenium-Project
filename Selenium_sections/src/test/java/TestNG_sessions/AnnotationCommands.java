package TestNG_sessions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationCommands {
  @Test(priority = 5,description = "This test case has priority 5",groups = "Sanity")
  public void test1() 
  {
	  
	
  System.out.println("Test 1");
  }
  @Test(groups ="Sanity")
  public void test3() 
  {
  System.out.println("Test 3");
  }
  @Test(groups = "Sanity")
  public void test4() 
  {
  System.out.println("Test 4");
  }
  
  @Test(dependsOnMethods = "test2",alwaysRun = false)
  public void test5() 
  {
  System.out.println("Test 5");
  }
  
  @Test(dependsOnGroups = "Sanity" )
  public void test6() 
  {
  System.out.println("Test 6");
  }
  
  @Test(priority = 1)
  public void test2()
  {
	  String [] str = {"OBSQURA","JAVA","AUTOMATION","TEST"};
	  
	  for(int i=0;i<=str.length;i++)
	  {
		  System.out.println(str[i]);
		  
	  }
	  
	  System.out.println("Test 2");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(" Before method Test");
  }
 

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method Test");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println(" before class Test");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class Test");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite Test");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite Test");
  }

}
