package comTestng;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;

public class ReporterDemo implements IReporter{
  @Test
  public void f() {
  }

@Override
public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
	for(ISuite s: suites) {
		Map<String, ISuiteResult> results=s.getResults();
		Set<String> keys=results.keySet();
		
		for(String k: keys) {
			ITestContext context= results.get(k).getTestContext();
			System.out.println("Suite Name: "+context.getName()
			+"::Report output Directory: "+context.getOutputDirectory()
			+"::Suite Name: "+context.getSuite().getName()
			+"::start date time for execution: "+context.getStartDate()
			+"::End date of execution: "+context.getEndDate());
			
			//Get Map for only failed test cases
			IResultMap resMap=context.getFailedTests();
			Collection<ITestNGMethod> failedMethods=resMap.getAllMethods();
			System.out.println("********************failed test cases****************");
			for(ITestNGMethod testngMethods: failedMethods) {
				System.out.println("test case name: "+testngMethods.getMethodName()+
						"\nDescription: "+testngMethods.getDescription()
						+"\nPriority: "+testngMethods.getPriority()
						+"\nDate: "+testngMethods.getDate());
			}
		}
	}
}
}
