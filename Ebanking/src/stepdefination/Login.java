package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login 
{
       WebDriver driver;
       
	@Given("^User Should On Ranford Home Page$")
	public void user_Should_On_Ranford_Home_Page() throws Throwable
	{
         driver=new FirefoxDriver();
		
		//Maximise
		
		driver.manage().window().maximize();
		
		//URL
		
		driver.get("http://122.175.8.158/ranford2");
	}

	@When("^User Enters \"(.*)\" and \"(.*)\" and click on login$")
	public void user_Enters_Un_and_Pwd_and_click_on_login(String Un,String Pwd) throws Throwable 
	{
		driver.findElement(By.id("txtuId")).sendKeys(Un);
		driver.findElement(By.id("txtPword")).sendKeys(Pwd);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	}

	@Then("^User Validates Admin login Functionality$")
	public void user_Validates_Admin_login_Functionality() throws Throwable 
	{
         String	Expval="Welcome to Admin";
         
       String Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
 		
 		//Comparision
 		
 		if (Expval.equalsIgnoreCase(Actval))
 		{
 		System.out.println("Admin Login Succ");	
 		}
 		else
 		{
 			System.out.println("Admin Login Failed");
 		}
 	}

	@Then("^User Logout from Application$")
	public void user_Logout_from_Application() throws Throwable 
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
	}


}
