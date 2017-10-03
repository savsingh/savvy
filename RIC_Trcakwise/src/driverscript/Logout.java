package driverscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout {

	public static WebDriver driver;
	
	public void LogoutAction(WebDriver driver) throws Exception {
	
	//WebDriverWait wait = new WebDriverWait(driver,60);	
			
	Set <String> handles2111 =driver.getWindowHandles();
    Iterator<String> it2111 = handles2111.iterator();
    
  //iterate through your windows
    while (it2111.hasNext()){
    String newwin = it2111.next();
    driver.switchTo().window(newwin);
    }
    System.out.println("Wait on Dashboard 314");
          
    Thread.sleep(4000);
    
    driver.switchTo().defaultContent();
    System.out.println("default frame");
    
    driver.switchTo().frame("Login");
    System.out.println("after frame");
        		
    driver.findElement(By.linkText("Log out")).click();
	System.out.println("Clicked on Log out Link 325");
		            
    Alert alert6 = driver.switchTo().alert();
    alert6.accept();
    System.out.println("Clicked OK on Alert Pop up and Logged out successfully");
	
	}
	
}
