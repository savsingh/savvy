package driverscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Section01 {

	public static WebDriver driver;
	
	public void Section01FieldsAction(WebDriver driver) throws Exception {
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		   /*driver.findElement(By.xpath(".//*[@name='RIC Escalation Awareness Date']")).sendKeys(ExcelUtils.getCellData(1,4));
	       System.out.println("Future Date");
	       
	       driver.switchTo().defaultContent();
	       System.out.println("default frame");
	       
	       driver.switchTo().frame("PR");
	       System.out.println("after frame");
	       
	       driver.findElement(By.xpath("//*[contains(@class,'sp-inner-btn sp-save-btn sp-first-btn')]")).click();
	       System.out.println("Clicked on Save button");
	       Thread.sleep(5000);
	       
	       //Need to update below alert code as per Future date selection
	       Alert alert1 = driver.switchTo().alert();
	       alert1.accept();
	       System.out.println("Clicked OK on Alert Pop up 138");
	       Thread.sleep(2000);
	       
	       driver.findElement(By.xpath(".//*[@name='RIC Escalation Awareness Date']")).sendKeys(ExcelUtils.getCellData(1,5));
	       System.out.println("Past Date");
	       Thread.sleep(2000);*/
	       
	       WebElement FeederSystem = wait.until(ExpectedConditions.elementToBeClickable(By.name("Feeder System")));
	       FeederSystem.click();
	       //WebElement FeederSystemOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@value,'114624')]")));
	       WebElement FeederSystemOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@value,'"+ExcelUtils.getCellData(1,6)+"')]")));
	       FeederSystemOption.click();
	       System.out.println("Feeder System Selected");
	       Thread.sleep(3000);
	       
	       /*driver.findElement(By.xpath("//*[contains(@class,'sp-inner-btn sp-save-btn sp-first-btn')]")).click();
	       System.out.println("Clicked on Save button");
	       Thread.sleep(4000);
	       
	       Alert alert2 = driver.switchTo().alert();
	       alert2.accept();
	       System.out.println("Clicked OK on Alert Pop up 158");
	       Thread.sleep(2000);*/
	       
	       driver.findElement(By.xpath(".//*[@name='Feeder System - Other']")).sendKeys(ExcelUtils.getCellData(1,7));
	       System.out.println("Feeder System - Other filled");
	       Thread.sleep(2000);
	       
	       driver.findElement(By.xpath(".//*[@name='Issue Description']")).sendKeys(ExcelUtils.getCellData(1,8));
	       System.out.println("Feeder System - Other filled");
	       Thread.sleep(2000);
	       
	       //WebElement TypeOfIssue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@value,'114576')]")));
	       WebElement TypeOfIssue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@value,'"+ExcelUtils.getCellData(1,9)+"')]")));
	       TypeOfIssue.click();
	       System.out.println("Product Selected");
	       Thread.sleep(2000);
	       
	       /*driver.findElement(By.xpath("//*[contains(@class,'sp-inner-btn sp-save-btn sp-first-btn')]")).click();
	       System.out.println("Clicked on Save button");
	       Thread.sleep(4000);
	       
	       Alert alert3 = driver.switchTo().alert();
	       alert3.accept();
	       System.out.println("Clicked OK on Alert Pop up 175");
	       Thread.sleep(2000);*/
	       
	       driver.findElement(By.xpath(".//*[@name='tfProduct Number(s)']")).sendKeys(ExcelUtils.getCellData(1,11));
	       System.out.println("Product No. Entered");
	       Thread.sleep(2000);
	       
	       WebElement AddClicked = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'btAddProduct Number(s)')]")));
	       AddClicked.click();
	       System.out.println("product No. Added 83");
	       Thread.sleep(2000);
	                          
	       //WebElement RequirementExists = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@value,'114577')]"))); 
	       WebElement RequirementExistsselect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@value,'"+ExcelUtils.getCellData(1,12)+"')]")));
	       RequirementExistsselect.click();
	       System.out.println("Yes Radio Button");
	       Thread.sleep(1000);
	       
	       /*driver.findElement(By.xpath("//*[contains(@class,'sp-inner-btn sp-save-btn sp-first-btn')]")).click();
	       System.out.println("Clicked on Save button");
	       Thread.sleep(4000);
	       
	       Alert alert4 = driver.switchTo().alert();
	       alert4.accept();
	       System.out.println("Clicked OK on Alert Pop up 198");
	       Thread.sleep(2000);*/
	       
	       driver.findElement(By.xpath(".//*[@name='Requirement Document']")).sendKeys(ExcelUtils.getCellData(1,13));
	       System.out.println("Data Entered");
	       Thread.sleep(2000);
	       
	       //WebElement NonconformanceExists = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@value,'114579')]")));
	       WebElement NonconformanceExists = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@value,'"+ExcelUtils.getCellData(1,14)+"')]")));
	       NonconformanceExists.click();
	       System.out.println("Yes Radio Button");
	       Thread.sleep(2000);
	       
	       /*driver.findElement(By.xpath("//*[contains(@class,'sp-inner-btn sp-save-btn sp-first-btn')]")).click();
	       System.out.println("Clicked on Save button");
	       Thread.sleep(5000);
	       
	       Alert alert5 = driver.switchTo().alert();
	       alert5.accept();
	       System.out.println("Clicked OK on Alert Pop up 216");
	       Thread.sleep(2000);*/
	       
	       //WebElement OutofCookControl = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@value,'114581')]")));
	       WebElement OutofCookControl = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@value,'"+ExcelUtils.getCellData(1,15)+"')]")));
	       OutofCookControl.click();
	       System.out.println("Yes Radio Button");
	       Thread.sleep(2000);
	       
	       driver.findElement(By.xpath("//*[starts-with(@name,'Additional Corrections Req')]")).sendKeys(ExcelUtils.getCellData(1,16));
		   System.out.println("Data Entered");
		   Thread.sleep(2000);
	       /*if(driver.findElement(By.xpath("//*[starts-with(@name,'Additional Corrections Req')]")).isDisplayed()){
		       System.out.println("Data Entered");
		       Thread.sleep(2000);
	    	   driver.findElement(By.xpath("//*[starts-with(@name,'Additional Corrections Req')]")).sendKeys(ExcelUtils.getCellData(1,16));
	    	   
	       }else{
	    	   System.out.println("Not found");
	       }*/
	       

	      
	}
	
}