package comTestng;

import org.testng.annotations.Test;

public class DependsOnMethodsDemo {
  @Test
  public void testcase1Method() {
	  System.out.println("test case1");
  }
  
  @Test
  public void testcase2Method() {
	  System.out.println("test case2");
  }
  
  
  @Test
  public void testcase3Method() {
	  System.out.println("test case3");
  }
}
