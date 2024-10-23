package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjcetSpecificationMethod;

public class Legalentitynew extends ProjcetSpecificationMethod{
	
	public Legalentitynew (ChromeDriver driver) {
		this.driver=driver;
	}

	public Legalentitynew clicknew() {
	driver.findElement(By.xpath("//div[text()='New']")).click();
	return this;
	}
	
	public Legalentitynew entername() {
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Your Priyanka");
	return this;
	}
	
	public VerifyonLegEntity clicksave() {
	driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	return new VerifyonLegEntity(driver);
	}
}
