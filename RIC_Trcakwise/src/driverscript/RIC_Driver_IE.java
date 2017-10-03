package driverscript;
import java.awt.Desktop.Action;
import java.io.IOException;
import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import bsh.Capabilities;
import driverscript.ExcelUtils;

public class RIC_Driver_IE {
	     
       public static void main(String[] args) throws Exception {
                
     //For Executing in IE11
       System.setProperty("webdriver.ie.driver", "D:\\60908_Rahul Devarkar_rdevarka\\Softwares\\Selenium\\IEDriverServer.exe");
       WebDriver driver = new InternetExplorerDriver();
              
       WebDriverWait wait = new WebDriverWait(driver,30);       
       
       driver.get("http://css-trackwise-dev.cookgroup.nao/TW_MED_DEV");
       System.out.println("Trackwise");
       
       Thread.sleep(5000);
       // Code to switch to next window
       Set <String> handles =driver.getWindowHandles();
       Iterator<String> it = handles.iterator();
       
       //iterate through your windows
       while (it.hasNext()){
       String newwin = it.next();
       driver.switchTo().window(newwin);
       }
       Thread.sleep(5000);
       driver.findElement(By.xpath(".//*[@name='tfUserName']")).sendKeys(ExcelUtils.getCellData(1,0));
       driver.findElement(By.xpath(".//*[@name='tfPassword']")).sendKeys(ExcelUtils.getCellData(1,1));
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
       
       System.out.println("logged in Successfully");
       
       Thread.sleep(5000);
       driver.switchTo().frame(0);
       WebElement Scope = wait.until(ExpectedConditions.elementToBeClickable(By.name("cmbScope")));
       Scope.click();
       WebElement ScopeOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'CAPA V2 (pub)')]")));
       ScopeOption.click();
       System.out.println("Clicked on Dropdown & Scope Selected 84");
       
       WebElement GoLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@class,'sp-inner-btn sp-new-btn sp-first-btn')]")));
	   GoLink.click();
	   System.out.println("Clicked on NewPR Button");
       
	   Set <String> handles11 =driver.getWindowHandles();
       Iterator<String> it11 = handles11.iterator();
       
       //iterate through your windows
       while (it11.hasNext()){
       String newwin = it11.next();
       driver.switchTo().window(newwin);
       }
       System.out.println("Wait on Selection Window 104");
       Thread.sleep(2000);
       
       driver.switchTo().defaultContent();
       System.out.println("default frame");
       Thread.sleep(5000);
       
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='PR']")));
       driver.switchTo().frame("PR");
       System.out.println("after frame");
       Thread.sleep(2000);
       
       WebElement RIC = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[contains(text(),'RIC')]")));
       RIC.click();
       WebElement Continue = wait.until(ExpectedConditions.elementToBeClickable(By.name("button")));
       Continue.click();
       System.out.println("RIC selected & Clicked on Continue 116");
                  
       driver.findElement(By.xpath(".//*[@name='RIC Escalation Awareness Date']")).sendKeys(ExcelUtils.getCellData(1,4));
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
       System.out.println("Clicked OK on Alert Pop up 134");
       Thread.sleep(2000);
       
       driver.findElement(By.xpath(".//*[@name='RIC Escalation Awareness Date']")).sendKeys(ExcelUtils.getCellData(1,5));
       System.out.println("Past Date");
       Thread.sleep(2000);
       
       WebElement FeederSystem = wait.until(ExpectedConditions.elementToBeClickable(By.name("Feeder System")));
       FeederSystem.click();
       WebElement FeederSystemOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Complaint Trending')]")));
       FeederSystemOption.click();
       System.out.println("Feeder System Selected");
       Thread.sleep(5000);
       
       WebElement TypeOfIssue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@value,'114576')]")));
       TypeOfIssue.click();
       System.out.println("Product Selected");
       Thread.sleep(2000);
                   
       driver.findElement(By.xpath(".//*[@name='tfProduct Number(s)']")).sendKeys(ExcelUtils.getCellData(1,6));
       System.out.println("Product No. Entered");
       Thread.sleep(2000);
       
       WebElement AddClicked = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'btAddProduct Number(s)')]")));
       AddClicked.click();
       System.out.println("product No. Added 159");
       Thread.sleep(2000);
              
       WebElement RequirementExists = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@value,'114577')]")));
       RequirementExists.click();
       System.out.println("Yes Radio Button 156");
       Thread.sleep(2000);
       
       driver.findElement(By.xpath(".//*[@name='Requirement Document']")).sendKeys(ExcelUtils.getCellData(1,7));
       System.out.println("Data Entered");
       Thread.sleep(2000);
       
       WebElement NonconformanceExists = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@value,'114579')]")));
       NonconformanceExists.click();
       System.out.println("Yes Radio Button 165");
       Thread.sleep(2000);
       
       WebElement OutofCookControl = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@value,'114581')]")));
       OutofCookControl.click();
       System.out.println("Yes Radio Button 176");
       Thread.sleep(2000);
       
       WebElement Imapct = wait.until(ExpectedConditions.elementToBeClickable(By.name("Impact")));
       Imapct.click();
       WebElement ImapctSelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Catastrophic')]")));
       ImapctSelect.click();
       System.out.println("Impact Selected");
       Thread.sleep(5000);
       
       driver.findElement(By.xpath(".//*[@name='tfInitiated By']")).sendKeys(ExcelUtils.getCellData(1,8));
       System.out.println("User name Entered");
       Thread.sleep(5000);
       WebElement Search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@name='btInitiated By']")));
       Search.click();
       System.out.println("Clicked on Search");
              
       Thread.sleep(10000);
       Set <String> handles2 =driver.getWindowHandles();
       Iterator<String> it2 = handles2.iterator();
       
     //iterate through your windows
       while (it2.hasNext()){
       String newwin = it2.next();
       driver.switchTo().window(newwin);
       }
       
       System.out.println("Person Search 205");
       Thread.sleep(5000);
       
       //WebElement UserName = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Ram Muthukrishnan")));       
       WebElement UserName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Ram Muthukrishnan')]")));
       UserName.click();
       System.out.println("User Selected");
              
       Set <String> handles21 =driver.getWindowHandles();
       Iterator<String> it21 = handles21.iterator();
       
     //iterate through your windows
       while (it21.hasNext()){
       String newwin = it21.next();
       driver.switchTo().window(newwin);
       }
       System.out.println("Wait on PR Window");
             
       Thread.sleep(5000);
       
       driver.switchTo().defaultContent();
       System.out.println("default frame 225");
       Thread.sleep(5000);
       
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='PR']")));
       driver.switchTo().frame("PR");
       System.out.println("after frame");
       Thread.sleep(2000);
       
       driver.findElement(By.xpath(".//*[@name='Date Initiated']")).sendKeys(ExcelUtils.getCellData(1,9));
       System.out.println("Date Entered");
       Thread.sleep(5000);
       
       //WebElement FileAttach = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'File')]")));
       WebElement FileAttach = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'File')]")));
       FileAttach.click();
       System.out.println("File clicked 241");
       
       Thread.sleep(5000);
       Set <String> handles211 =driver.getWindowHandles();
       Iterator<String> it211 = handles211.iterator();
       
     //iterate through your windows
       while (it211.hasNext()){
       String newwin = it211.next();
       driver.switchTo().window(newwin);
       }
       
       System.out.println("Browse window 253");
       Thread.sleep(5000);
       
       WebElement Browse = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//[contains(text(),'Browse...')]")));
       Browse.click();
       System.out.println("Browse clicked 245");
       
       
       
       
       }

		
	}
