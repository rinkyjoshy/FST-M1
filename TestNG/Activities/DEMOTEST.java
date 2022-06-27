package TestNGActivities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DEMOTEST {
  @Test
  public void f() {
	  
	  System.out.println("hey guys");
  }
  
  @Test
  public void r() {
	  
	  int i = 9/0;
  }
  
  @BeforeMethod
  public void a() {
	  
	  System.out.println("before method");
  }
  
  @AfterMethod
public void b() {
	  
	  System.out.println("after method");
  }
}
