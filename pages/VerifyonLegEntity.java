package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjcetSpecificationMethod;

public class VerifyonLegEntity extends ProjcetSpecificationMethod {
	
	public VerifyonLegEntity (ChromeDriver driver) {
		this.driver=driver;
	
	}
	public void verify() {
		String leentity = driver.findElement(By.xpath("//lightning-formatted-text[text()='Salesforce Automation by Your Priyanka']")).getText();
		System.out.println(leentity);
		if(leentity.contains(leentity)) {
			System.out.println("The legal name created successfully");
		}else {
			System.out.println("The legal name not created successfully");
		}
		
		
	}

}
