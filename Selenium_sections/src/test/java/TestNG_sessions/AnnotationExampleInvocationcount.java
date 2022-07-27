package TestNG_sessions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AnnotationExampleInvocationcount {
  @Test(invocationCount=3,invocationTimeOut = 30,description="for testing invocation count")
  public void test() 
  {
	  System.out.println("test");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test");
  }

}
