package driverscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Section07 {

	public static WebDriver driver;
	
	public void Section07FieldsAction(WebDriver driver) throws Exception {
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		PersonSearch Search = new PersonSearch();
		
		driver.findElement(By.xpath(".//*[@name='tfContainment/Correction Owner']")).sendKeys(ExcelUtils.getCellData(1,8));
	    System.out.println("User name Entered");
	    Thread.sleep(2000);
		
	    Search.Section07ContainmentCorrectionOwnerAction(driver);
		
	    driver.findElement(By.xpath(".//*[@name='Brief Description']")).sendKeys(ExcelUtils.getCellData(1,20));
	    System.out.println("Brief Description Entered");
	    Thread.sleep(2000);
		
	    driver.findElement(By.xpath(".//*[@name='tfCAPA Sponsor']")).sendKeys(ExcelUtils.getCellData(1,8));
	    System.out.println("User name Entered");
	    Thread.sleep(2000);
	    
	    Search.Section07CAPASponsorAction(driver);
		
	    driver.findElement(By.xpath("//input[@id='Investigation Plan Due Date']")).sendKeys(ExcelUtils.getCellData(1,22));
	    System.out.println("Date Entered");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath(".//*[@name='tfAdmin Section Completed By']")).sendKeys(ExcelUtils.getCellData(1,23));
	    System.out.println("User name Entered");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath(".//*[@name='Admin Section Completed On']")).sendKeys(ExcelUtils.getCellData(1,24));
	    System.out.println("Date Entered");
	    Thread.sleep(2000);
		
	    driver.findElement(By.xpath(".//*[@name='btNow_Admin Section Completed On']")).click();
	    System.out.println("Date Entered");
	    Thread.sleep(2000);
		
		
		
	}
	
}