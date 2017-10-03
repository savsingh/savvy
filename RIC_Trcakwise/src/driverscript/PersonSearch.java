package driverscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PersonSearch {

	public static WebDriver driver;
	
	public void PersonSearchAction(WebDriver driver) throws Exception {
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		   WebElement Search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@name='btInitiated By']")));
	       Search.click();
	       System.out.println("Clicked on Search");
	              
	       Thread.sleep(5000);
	       Set <String> handles2 =driver.getWindowHandles();
	       Iterator<String> it2 = handles2.iterator();
	       
	     //iterate through your windows
	       while (it2.hasNext()){
	       String newwin = it2.next();
	       driver.switchTo().window(newwin);
	       }
	       
	       System.out.println("Person Search 35");
	       Thread.sleep(5000);
	       
	       //WebElement UserName = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Ram Muthukrishnan")));       
	       WebElement UserName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Ram Muthukrishnan')]")));
	       UserName.click();
	       System.out.println("User Selected");
	
	}
	
public void RICSubmitSearchAction(WebDriver driver) throws Exception {
		
		  WebDriverWait wait = new WebDriverWait(driver,60);
		
		   WebElement Search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@name='btRIC Submitted to CRB By']")));
	       Search.click();
	       System.out.println("Clicked on Search");
	              
	       Thread.sleep(5000);
	       Set <String> handles3 =driver.getWindowHandles();
	       Iterator<String> it3 = handles3.iterator();
	       Thread.sleep(5000);
	     //iterate through your windows
	       while (it3.hasNext()){
	       String newwin = it3.next();
	       driver.switchTo().window(newwin);
	       }
	       
	       System.out.println("Person Search 63");
	       Thread.sleep(5000);
	       
	       //WebElement UserName = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Ram Muthukrishnan")));       
	       WebElement UserName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'M.D. Muthusamy')]")));
	       UserName.click();
	       System.out.println("User Selected");
	
}

public void Section07ContainmentCorrectionOwnerAction(WebDriver driver) throws Exception {
	
	 WebDriverWait wait = new WebDriverWait(driver,60);
	
	 WebElement Search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@name='btContainment/Correction Owner']")));
     Search.click();
     System.out.println("Clicked on Search");
            
     Thread.sleep(5000);
     Set <String> handles3 =driver.getWindowHandles();
     Iterator<String> it3 = handles3.iterator();
     Thread.sleep(5000);
   //iterate through your windows
     while (it3.hasNext()){
     String newwin = it3.next();
     driver.switchTo().window(newwin);
     }
     
     System.out.println("Person Search 63");
     Thread.sleep(5000);
     
     //WebElement UserName = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Ram Muthukrishnan")));       
     WebElement UserName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'"+ExcelUtils.getCellData(1,19)+"')]")));
     UserName.click();
     System.out.println("User Selected");

}


public void Section07CAPASponsorAction(WebDriver driver) throws Exception {
	
	WebDriverWait wait = new WebDriverWait(driver,60);
	
	WebElement Search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@name='btCAPA Sponsor']")));
    Search.click();
    System.out.println("Clicked on Search");
           
    Thread.sleep(5000);
    Set <String> handles3 =driver.getWindowHandles();
    Iterator<String> it3 = handles3.iterator();
    Thread.sleep(5000);
  //iterate through your windows
    while (it3.hasNext()){
    String newwin = it3.next();
    driver.switchTo().window(newwin);
    }
    
    System.out.println("Person Search 120");
    Thread.sleep(5000);
    
    //WebElement UserName = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Ram Muthukrishnan")));       
    WebElement UserName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'"+ExcelUtils.getCellData(1,21)+"')]")));
    UserName.click();
    System.out.println("User Selected");

}




}
