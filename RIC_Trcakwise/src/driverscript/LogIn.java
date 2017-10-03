package driverscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn {

	public static WebDriver driver;
	
	public void LogInAction(WebDriver driver) throws Exception {
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		driver.get("http://css-trackwise-dev.cookgroup.nao/TW_MED_DEV");
	       System.out.println("Trackwise");
	       
	       Thread.sleep(6000);
	       // Code to switch to next window
	       Set <String> handles =driver.getWindowHandles();
	       Iterator<String> it = handles.iterator();
	       
	       //iterate through your windows
	       while (it.hasNext()){
	       String newwin = it.next();
	       driver.switchTo().window(newwin);
	       }
	       Thread.sleep(6000);
	       driver.findElement(By.xpath(".//*[@name='tfUserName']")).sendKeys(ExcelUtils.getCellData(3,0));
	       driver.findElement(By.xpath(".//*[@name='tfPassword']")).sendKeys(ExcelUtils.getCellData(3,1));
	       Thread.sleep(2000);
	       driver.findElement(By.name("timezone")).click();
	       
	       Select oSelect = new Select(driver.findElement(By.name("timezone")));
	       oSelect.selectByValue("India Standard Time");   
	       System.out.println("Time Zone Selected");
	       
	       WebElement LogIn = wait.until(ExpectedConditions.elementToBeClickable(By.id("btLoginId")));
	       LogIn.click();
	       
	       try 
	       {
	       driver.switchTo().alert().accept();
	       System.out.println("Unexpected alert present");
	       }
	       catch(Exception e)
	       {	
	       System.out.println("Unexpected alert not present");
	       }
	       Thread.sleep(2000);
	       System.out.println("logged in Successfully");   
	         	
	
	}
	
}
