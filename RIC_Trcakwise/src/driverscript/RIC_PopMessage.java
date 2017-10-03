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
import driverscript.Logout;
public class RIC_PopMessage 

{
	     
       public static void main(String[] args) throws Exception 
       {
                
     //For Executing in IE11
       System.setProperty("webdriver.ie.driver", "D:\\60908_Rahul Devarkar_rdevarka\\Softwares\\Selenium\\IEDriverServer.exe");
              
       WebDriver driver = new InternetExplorerDriver();
       LogIn LogIn = new LogIn();
       WebDriverWait wait = new WebDriverWait(driver,60);
       Section01 Section01Fields = new Section01();
       Section02 Section02Fields = new Section02();
       PersonSearch Search = new PersonSearch();
       Section04 Section04Fields = new Section04();
       Section05 Section05Fields = new Section05();
       Section07 Section07Fields = new Section07();
       Logout Log = new Logout();
       
       //LogIn Script Run
       LogIn.LogInAction(driver);
       Thread.sleep(2000);
       
       //////////////Desktop////////////////////////
       
       //driver.switchTo().frame(0);
       driver.switchTo().frame("Login");
       System.out.println("after frame");
       
       WebElement Scope = wait.until(ExpectedConditions.elementToBeClickable(By.name("cmbScope")));
       Scope.click();
       WebElement ScopeOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'CAPA V2 (pub)')]")));
       ScopeOption.click();
       System.out.println("Clicked on Dropdown & Scope Selected 86");
       
       WebElement GoLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@class,'sp-inner-btn sp-new-btn sp-first-btn')]")));
	   GoLink.click();
	   System.out.println("Clicked on NewPR Button");
       
	   Set <String> handles11 =driver.getWindowHandles();
       Iterator<String> it11 = handles11.iterator();
       
       //iterate through your windows
       while (it11.hasNext())
       {
       String newwin = it11.next();
       driver.switchTo().window(newwin);
       }
       System.out.println("Wait on Selection Window 75");
       //Thread.sleep(5000);
       
       driver.switchTo().defaultContent();
       System.out.println("default frame");
       Thread.sleep(4000);
       
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='PR']")));
       driver.switchTo().frame("PR");
       System.out.println("after frame");
       Thread.sleep(2000);
       
       WebElement RIC = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[contains(text(),'RIC')]")));
       RIC.click();
       WebElement Continue = wait.until(ExpectedConditions.elementToBeClickable(By.name("button")));
       Continue.click();
       System.out.println("RIC selected & Clicked on Continue 116");
       
       Thread.sleep(2000);
       driver.manage().window().maximize();
       Thread.sleep(5000);
       
       ///////////////////////Section1///////////////////////
       
       Section01Fields.Section01FieldsAction(driver);
       
       //////////////////////Section2////////////////////////////////
       
       Section02Fields.Section02FieldsAction(driver);      
             
       //////////////////////Section3////////////////////
       
       /*WebElement FileAttach = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'File')]")));
       FileAttach.click();
       System.out.println("File clicked 285");
       
       Thread.sleep(2000);
       Set <String> handles211 =driver.getWindowHandles();
       Iterator<String> it211 = handles211.iterator();
       
       //iterate through your windows
       while (it211.hasNext()){
       String newwin = it211.next();
       driver.switchTo().window(newwin);
       }
       
       WebElement Browse = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Browse...')]")));
       Browse.click();
       System.out.println("Browse clicked 299");
       Thread.sleep(4000);
       
       WebElement Attach = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Attach')]")));
       Attach.click();
       System.out.println("Attach clicked 306");
       Thread.sleep(2000);
       
       WebElement OK = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'OK')]")));
       OK.click();
       System.out.println("Ok clicked 311");
       Thread.sleep(2000);*/
       
       ////////////////////////////////////              
       /*driver.findElement(By.xpath("//*[contains(@class,'sp-inner-btn sp-save-btn sp-first-btn')]")).click();
       System.out.println("Clicked on Save button");
       Thread.sleep(3000);*/
       
       ///////////////Section 4////////////////////
       WebElement Tab2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'CAPA Team')]")));
       Tab2.click();
	   System.out.println("Clicked on CAPA Team tab");
	   
       //Section04Fields.Section04FieldsAction(driver);
             
       ///////////////Section 5////////////////////
            
       Section05Fields.Section05FieldsAction(driver);
       
       ///////////////Section 7////////////////////
       
       Section07Fields.Section07FieldsAction(driver);
       
       
       driver.findElement(By.xpath("//*[contains(@class,'sp-inner-btn sp-save-btn sp-first-btn')]")).click();
       System.out.println("Clicked on Save button");
       Thread.sleep(5000);
       
     //Logout Script Run
       //Logout Log = new Logout();
       Log.LogoutAction(driver);
       
       
       }
		
	}
       
