package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicScript {

	public static void main(String[] args) 
	{
	    //Launch Firefox
		
		WebDriver driver=new FirefoxDriver();
		
		//Maximise
		
		driver.manage().window().maximize();
		
		//URL
		
		driver.get("http://122.175.8.158/ranford2");
		
		//Admin Login
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Testing@");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
