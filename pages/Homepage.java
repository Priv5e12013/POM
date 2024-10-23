package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base.ProjcetSpecificationMethod;

public class Homepage extends ProjcetSpecificationMethod {
	
	public Homepage (ChromeDriver driver) {
		this.driver=driver;
	}

	public Homepage clicktogglebutton() {
	driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
	return this;
	}
	
	public Homepage clickviewall() throws InterruptedException {
	driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
	Thread.sleep(30);
	
    return this;
    
	}

    public Legalentitynew clicklegalen() {
    	Actions legal = new Actions(driver);
		legal.moveToElement(driver.findElement(By.xpath("//p[text()='Legal Entities']"))).click().perform();
		return new Legalentitynew(driver);
    }
}
