package TestNG_sessions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AnnotationParametersExample {
  @Test
  public void test1() 
  {
String [] str = {"OBSQURA","JAVA","AUTOMATION","TEST"};
	  
	  for(int i=0;i<=str.length;i++)
	  {
		  System.out.println(str[i]);
		  
	  }
	  
	  System.out.println("Test 1");
	  
  }
  @Test(dependsOnMethods = "test1",alwaysRun = true)
  public void test2() 
  {
	  System.out.println("Method of Test 2");
  }
  @Test(dependsOnMethods = "test2")
  public void test3() 
  {
	  System.out.println("Method of Test 3");
  }
  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("Method of Before Test");
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("Method of after Test");
  }

}
