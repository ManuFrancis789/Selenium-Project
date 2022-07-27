package TestNG_sessions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AnnotationExampleEnabled {
  @Test(enabled = true)
  public void test1() 
  {
	  System.out.println("test1");
	  
  }
  
  @Test(enabled = false)
  public void test2() 
  {
	  System.out.println("test2"); 
  }
  
  @Test
  public void test3() 
  {
	  System.out.println("test3");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

}
