package runner;

import org.testng.annotations.Test;

import base.ProjcetSpecificationMethod;
import pages.Loginpage;

public class CreateLegalEntity2 extends ProjcetSpecificationMethod {

     @Test  
    public void runner() throws InterruptedException {
    	Loginpage obj = new Loginpage(driver);
     obj.enterun().
     enterpw().
     clicklogin().
     clicktogglebutton().
     clickviewall().
     clicklegalen().
     clicknew().
     entername().
     clicksave()
     .verify();
    	 
    	 
    }
		
		
		
	

}
