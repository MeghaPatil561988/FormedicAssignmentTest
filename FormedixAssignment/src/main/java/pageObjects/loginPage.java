package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver;

	By username = By.cssSelector("#username");
	By password = By.cssSelector("#password");
	By signin = By.cssSelector("#btnSubmit");
	By loginerrormsg = By.cssSelector(".alert-danger-text.ng-scope");
	
		
	public loginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	public WebElement getusername()
	{
		return driver.findElement(username);
	}
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	public WebElement Submit() 
	   {
		return driver.findElement(signin);
	   }
	public WebElement getloginerrormsg() 
	   {
		return driver.findElement(loginerrormsg);
	   }
}