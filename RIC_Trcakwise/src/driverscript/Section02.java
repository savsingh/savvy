package driverscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Section02 {

	public static WebDriver driver;
	
	public void Section02FieldsAction(WebDriver driver) throws Exception {
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		PersonSearch Search = new PersonSearch();
		
		WebElement SeveritySelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'"+ExcelUtils.getCellData(1,14)+"')]")));
		SeveritySelect.click();
	       
	       System.out.println("Severity Selected");
	       Thread.sleep(5000);
	       
	       try 
	       {
	    	   if(driver.findElement(By.xpath("//*[contains(@value,'114583')]")).isDisplayed())
	    	   {
	    		System.out.println("Pass with Major Value");
	    	   }
	       }
	    	   catch(Exception e)
	    	   {
	    	   System.out.println("Fail");
	    	  }
	           Thread.sleep(2000);
			         
			/*if(ExcelUtils.getCellData(1,14).equals("Catastrophic")||(ExcelUtils.getCellData(1,14).equals("Critical")))
				
			{
				WebElement SeveritySelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'"+ExcelUtils.getCellData(1,14)+"')]")));
				SeveritySelect.click();
				    
				System.out.println("Severity Selected");
				    //if(driver.findElement(By.xpath("//*[contains(@value,'114583')]")).isDisplayed()) 
				   if(driver.findElement(By.xpath("//*[contains(text(),'Major')]")).isDisplayed())    
				     {
				    	 System.out.println("Pass with Major Value");
				     }else{
				    	 System.out.println("Major is not displayed");
				     }
	  			    Thread.sleep(5000);
		    }
			      else if(ExcelUtils.getCellData(1,14).equals("Serious"))
			      {
			    	  if(driver.findElement(By.xpath("//*[contains(text(),'Moderate')]")).isDisplayed())    
					     {
					    	 System.out.println("Pass with Moderate Value");
					     }else{
					    	 System.out.println("Moderate is not displayed");
					     }
				   }
			      else if(ExcelUtils.getCellData(1,14).equals("Minor")||(ExcelUtils.getCellData(1,14).equals("Negligible")))
			      {
			    	  if(driver.findElement(By.xpath("//*[contains(text(),'Minor')]")).isDisplayed())    
					     {
					    	 System.out.println("Pass with Minor Value");
					     }else{
					    	 System.out.println("Minor is not displayed"); */  
			
	    	   
	       /*driver.findElement(By.xpath(".//*[@name='tfInitiated By']")).sendKeys(ExcelUtils.getCellData(1,8));
	       System.out.println("User name Entered");
	       Thread.sleep(5000);
	         
	       //PersonSearch Script Run
	       Search.PersonSearchAction(driver);
	       
	       Thread.sleep(2000);
	       
	       Set <String> handles21 =driver.getWindowHandles();
	       Iterator<String> it21 = handles21.iterator();
	       
	      //iterate through your windows
	       while (it21.hasNext())
	       {
	       String newwin = it21.next();
	       driver.switchTo().window(newwin);
	       }
	       System.out.println("Wait on PR Window");
	             
	       Thread.sleep(2000);
	       
	       driver.switchTo().defaultContent();
	       System.out.println("default frame 226");
	       Thread.sleep(2000);
	       
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='PR']")));
	       driver.switchTo().frame("PR");
	       System.out.println("after frame");
	       Thread.sleep(2000);
	       
	       //driver.findElement(By.xpath(".//*[@name='Date Initiated']")).sendKeys(ExcelUtils.getCellData(1,9));
	       WebElement InitiatedBy = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@name,'btNow_Date Initiated')]")));
	       InitiatedBy.click();
	       System.out.println("Date Entered");
	       Thread.sleep(2000);*/
	      	}
	
}