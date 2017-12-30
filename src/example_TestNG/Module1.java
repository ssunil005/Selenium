package example_TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import HRMPages.P101_Login;
import HRMPages.P102_Home;
import library.BaseClass;
import library.Util;

public class Module1 extends BaseClass 
{
  @Test(groups="smokesuite")
  public void TC101() 
  {
	  System.out.println("Started:Execution of TC101 ");
	  System.out.println("Executing TC101");
	  WebDriver driver = Util.launchBrowser("Firefox");
	  Util.launchApplication("http://testingmasters.com/hrm/symfony/web/index.php/dashboard/",driver);
	  boolean stepstatus;
	 stepstatus = Util.setText(P101_Login.Edt_UserName,Util.getData("UserName"),driver);
	 Util.logEvent(stepstatus,"Able to enter user name","Not able to enter username");
	 
	 stepstatus = Util.setText(P101_Login.Edt_Password,Util.getData("password"),driver);
	 Util.logEvent(stepstatus,"Able to enter password","Not able to enter password");
	 
	 stepstatus = Util.clickElement(P101_Login.Btn_Login,driver);
	 Util.logEvent(stepstatus,"Able to click on login button","Not able to click on  login button");
	 
	  stepstatus = Util.clickElement(P102_Home.Lnk_MyInfo,driver);
	  Util.logEvent(stepstatus,"Able to login","Not able to login");
	  
	  Util.quitbrowser(driver);
	  
	  /*driver.get("http://testingmasters.com/hrm/symfony/web/index.php/dashboard/");
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("ankit3");
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("abcd1234");
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	  driver.findElement(By.xpath("//b[text()='My Info']")).click();
	  driver.findElement(By.xpath("//a[text()='Dependents']")).click();
	  driver.quit();
*/	  System.out.println("Finished:Execution of TC101");
  }
  @Test(groups="DBsuite")
  public void TC102() 
  {
	  System.out.println("Started:Execution of TC102 ");
	  System.out.println("Executing TC102");
	  WebDriver driver = Util.launchBrowser("Firefox");
	  Util.launchApplication("http://testingmasters.com/hrm/symfony/web/index.php/dashboard/",driver);
	  
	  Util.setText(P101_Login.Edt_UserName,"ankit3",driver);
	  Util.setText(P101_Login.Edt_Password,"abcd1234",driver);
	  Util.clickElement(P101_Login.Btn_Login,driver);
	  Util.clickElement(P102_Home.Lnk_MyInfo,driver);
	  Util.quitbrowser(driver);
	  System.out.println("Finished:Execution of TC102");
  }
  @Test(groups="DBsuite")
  public void TC103() 
  {
	  System.out.println("Started:Execution of TC103 ");
	  System.out.println("Executing TC102");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://testingmasters.com/hrm/symfony/web/index.php/dashboard/");
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("ankit3");
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("abcd1234");
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	  driver.findElement(By.xpath("//b[text()='My Info']")).click();
	  driver.findElement(By.xpath("//a[text()='Dependents']")).click();
	  driver.quit();
	  System.out.println("Finished:Execution of TC103");
  }
}
