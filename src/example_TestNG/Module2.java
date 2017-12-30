package example_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import library.BaseClass;

public class Module2 extends BaseClass
{
  @Test(groups="DBsuite")
  public void TC201()
  {
	  System.out.println("Started:Execution of TC201 ");
	  System.out.println("Executing TC201");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://testingmasters.com/hrm/symfony/web/index.php/dashboard/");
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("ankit3");
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("abcd1234");
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	  driver.findElement(By.xpath("//b[text()='My Info']")).click();
	  driver.findElement(By.xpath("//a[text()='Dependents']")).click();
	  driver.quit();
	  System.out.println("Finished:Execution of TC201");
  }
  @Test(groups="smokesuite")
  public void TC202()
  {
	  System.out.println("Started:Execution of TC202 ");
	  System.out.println("Executing TC202");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://testingmasters.com/hrm/symfony/web/index.php/dashboard/");
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("ankit3");
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("abcd1234");
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	  driver.findElement(By.xpath("//b[text()='My Info']")).click();
	  driver.findElement(By.xpath("//a[text()='Dependents']")).click();
	  driver.quit();
	  System.out.println("Finished:Execution of TC202");
  }
  @Test(groups= {"smokesuite","DBsuite"})
  public void TC203()
  {
	  System.out.println("Started:Execution of TC203 ");
	  System.out.println("Executing TC203");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://testingmasters.com/hrm/symfony/web/index.php/dashboard/");
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("ankit3");
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("abcd1234");
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	  driver.findElement(By.xpath("//b[text()='My Info']")).click();
	  driver.findElement(By.xpath("//a[text()='Dependents']")).click();
	  driver.quit();
	  System.out.println("Finished:Execution of TC203");
  }
  @Test
  public void TC204()
  {
	  System.out.println("Started:Execution of TC204 ");	
	  System.out.println("Executing TC204");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://testingmasters.com/hrm/symfony/web/index.php/dashboard/");
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("ankit3");
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("abcd1234");
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	  driver.findElement(By.xpath("//b[text()='My Info']")).click();
	  driver.findElement(By.xpath("//a[text()='Dependents']")).click();
	  driver.quit();
	  System.out.println("Finished:Execution of TC204");
  }
  @Test(groups="DBsuite")
  public void TC205()
  {
	  System.out.println("Started:Execution of TC205 ");
	  System.out.println("Executing TC205");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://testingmasters.com/hrm/symfony/web/index.php/dashboard/");
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("ankit3");
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("abcd1234");
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	  driver.findElement(By.xpath("//b[text()='My Info']")).click();
	  driver.findElement(By.xpath("//a[text()='Dependents']")).click();
	  driver.quit();
	  System.out.println("Finished:Execution of TC205");
  }
}
