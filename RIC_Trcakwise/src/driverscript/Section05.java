package driverscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Section05 {

	public static WebDriver driver;
	
	public void Section05FieldsAction(WebDriver driver) throws Exception {
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		WebElement EscalationSeverity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'"+ExcelUtils.getCellData(1,15)+"')]")));
		//WebElement EscalationSeverity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Major Severity - Escalation Required')]")));
		EscalationSeverity.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@name='Escalation Decision Notes']")).sendKeys(ExcelUtils.getCellData(1,16));
	    System.out.println("Data Entered");
	    Thread.sleep(4000);
	     
	    WebElement CAPAType = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'"+ExcelUtils.getCellData(1,17)+"')]")));
	    CAPAType.click();
	    System.out.println("CAPA Type selected");
		Thread.sleep(4000);
	    
		WebElement ContainmentCorrectionReqd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'"+ExcelUtils.getCellData(1,18)+"')]")));
		ContainmentCorrectionReqd.click();
	    System.out.println("ContainmentCorrectionReqd selected");
		Thread.sleep(2000);
		
		
	}
	
}