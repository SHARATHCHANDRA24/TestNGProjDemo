package comTestng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(comTestng.ReportingDemo.class)
public class RealReportDemo {
  @Test
  public void testMethod1() {
	  Assert.assertTrue(true);
  }
  @Test
  public void testFail() {
	  Assert.assertTrue(false);
  }
  
  @Test(dependsOnMethods="testFail")
  public void method3() {
	  
  }
}
