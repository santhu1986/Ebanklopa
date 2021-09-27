package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Rolec 
{

	WebDriver driver;
	
@Given("^Tester on Ranford Home page$")
public void tester_on_Ranford_Home_page() throws Throwable
   {
	 driver=new FirefoxDriver();
		
		//Maximise
		
		driver.manage().window().maximize();
		
		//URL
		
		driver.get("http://122.175.8.158/ranford2");
  
	
   }

@When("^Tester enters Uname and Password$")
public void tester_enters_Uname_and_Password() throws Throwable 
{
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("Testing@");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
}

@Then("^Tester clicks on Role Button$")
public void tester_clicks_on_Role_Button() throws Throwable 
{
	Thread.sleep(4000);
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
}

@When("^Tester click on New Role and enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void tester_click_on_New_Role_and_enter_and(String Rname, String Rty) throws Throwable
{
	driver.findElement(By.xpath(".//*[@id='btnRoles']")).click();
	driver.findElement(By.id("txtRname")).sendKeys(Rname);
	driver.findElement(By.id("lstRtypeN")).click();
	driver.findElement(By.id("lstRtypeN")).sendKeys(Rty);
	driver.findElement(By.xpath(".//*[@id='btninsert']")).click();
	Thread.sleep(4000);
	//String Actval=driver.switchTo().alert().getText();
	
//	System.out.println(Actval);
	
	
      driver.switchTo().alert().accept();

}

@Then("^Tester close the application$")
public void tester_close_the_application() throws Throwable 
{
    driver.close();
}

}
