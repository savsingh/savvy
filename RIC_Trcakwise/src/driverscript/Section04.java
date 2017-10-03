package driverscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Section04 {

	public static WebDriver driver;
	
	public void Section04FieldsAction(WebDriver driver) throws Exception {
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		PersonSearch Search = new PersonSearch();
		
		   driver.findElement(By.xpath(".//*[@name='tfRIC Submitted to CRB By']")).sendKeys(ExcelUtils.getCellData(1,8));
	       System.out.println("User name Entered");
	       Thread.sleep(5000);
	       
		   //PersonSearch Script Run
		  Search.RICSubmitSearchAction(driver);
	       
	       Thread.sleep(2000);
	       	       	       
	       Set <String> handles211 =driver.getWindowHandles();
	       Iterator<String> it211 = handles211.iterator();
	       
	      //iterate through your windows
	       while (it211.hasNext()){
	       String newwin = it211.next();
	       driver.switchTo().window(newwin);
	       }
	       System.out.println("Wait on PR Window");
	       
	       Thread.sleep(2000);
	       
	       driver.switchTo().defaultContent();
	       System.out.println("default frame 269");
	       Thread.sleep(2000);
	       
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='PR']")));
	       driver.switchTo().frame("PR");
	       System.out.println("after frame");
	       Thread.sleep(2000);
	       
	       WebElement RICSubmittedDate  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@name,'btNow_RIC Submitted to CRB On')]")));
	       RICSubmittedDate.click();
	       System.out.println("Date Entered");
	       Thread.sleep(2000);
	      
	}
	
}