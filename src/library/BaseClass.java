package library;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

public class BaseClass 
{
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Before suite");
		FrameworkVariables.reports = new ExtentReports("D:\\Results\\Summary.html",true);
	}
	
	@BeforeMethod
	public void BeforeMEthod(Method method)
	{
		String CurrentMethod = method.getName();
		System.out.println("BeforeMEthod");
		FrameworkVariables.test = FrameworkVariables.reports.startTest(CurrentMethod);
	}
	
	@AfterMethod
	public void AfterMEthod()
	{
		System.out.println("AfterMEthod");
		FrameworkVariables.reports.endTest(FrameworkVariables.test);
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite");
		FrameworkVariables.reports.close();
	}
}
