package comTestng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value=comTestng.ReportingDemo.class)
public class ForReporterDemo {
  @Test(priority=0,description="first method")
  public void methodOne() {
	  Assert.assertTrue(true);
  }
  
  @Test(priority=1,description="second method")
  public void methodTwo(){
	  Assert.assertTrue(false);
  }
}
