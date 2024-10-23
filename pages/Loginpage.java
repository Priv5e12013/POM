package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjcetSpecificationMethod;

public class Loginpage extends ProjcetSpecificationMethod{
	
	public Loginpage (ChromeDriver driver) {
		this.driver=driver;
	}

	public Loginpage enterun() {
	driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
	return this;
	}
	
	public Loginpage enterpw() {
	driver.findElement(By.id("password")).sendKeys("leaf@2024");
	return this;
	}
	
	public Homepage clicklogin() {
	driver.findElement(By.id("Login")).click();
	return new Homepage(driver);	
	}
	
}
