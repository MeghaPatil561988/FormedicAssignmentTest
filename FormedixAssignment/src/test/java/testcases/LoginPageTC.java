package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.base;
import pageObjects.NavigationPage;
import pageObjects.loginPage;

public class LoginPageTC extends base {
	public WebDriver driver;
	base b=new base();
	@BeforeTest
	public void initialize() throws IOException {

		 driver=initializedriver();
		 //driver.get(prop.getProperty("url")); // it takes only one set of data
	}
	@Test(dataProvider="getdata")
	public void baseTestNavigation(String username,String password,String text) throws IOException, InterruptedException {
		 
		 driver.get(prop.getProperty("url")); //so better we have to write here
		 
		 loginPage l = new loginPage(driver);
		 NavigationPage n = new NavigationPage(driver);
		 
		 String acterrmsg;  
		 String expterrmsg = "The sign in details entered are invalid. Please try again or contact your administrator if you have forgotten your details.";
		 
		 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		 
		 l.getusername().sendKeys(username);;
		 l.getpassword().sendKeys(password);
		
		 Actions a = new Actions(driver);
		 a.moveToElement(l.Submit()).build().perform();
		 l.Submit().click();
		 
		 
		/* acterrmsg = l.getloginerrormsg().getText();
			
			try {
				Assert.assertEquals(acterrmsg, expterrmsg);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 */   
			Actions action = new Actions(driver);
			//Thread.sleep(2000);
			action.moveToElement(n.getrepository()).build().perform();
			
			n.getstudies().click();
			
			action.moveToElement(n.gettechstudymenu()).click().perform();
			Thread.sleep(2000);
			action.moveToElement(n.getviewoption()).click().perform();
			Thread.sleep(2000);
			action.moveToElement(n.getdataacquisitionassetview()).click().perform();
			action.moveToElement(n.getviewforms()).click().perform();
			Thread.sleep(2000);
			n.getmedicalhistory().click();
			Thread.sleep(2000);
			action.moveToElement(n.geteditform()).click().perform();
			Thread.sleep(2000);
			String desctext = "allergies,illnesses";
			n.getdescriptiontextarea().sendKeys(desctext);
			
			action.moveToElement(n.getsavechange()).click().perform();
			
			
			Assert.assertFalse(n.getproperypaneluserupdate().isDisplayed());
			System.out.println(n.getproperypaneluserupdate().isDisplayed());
			Assert.assertTrue(n.getproperypaneluserupdate().isDisplayed());
			
			n.getbacktoassetlist().click();
			
			Assert.assertFalse(n.getuserupdatemainformview().isDisplayed());
			System.out.println(n.getuserupdatemainformview().isDisplayed());
			Assert.assertTrue(n.getuserupdatemainformview().isDisplayed());
			
			 a.moveToElement(n.gettestteamtechtestover()).build().perform();
			 
			n.getsignout().click();
			
		 }
	
	
	@DataProvider
	public Object[][] getdata() 
	{
	   //row stands for how many different data types test should run
		//column stands for how many values for each test
       Object[][] data = new  Object[2][3];
       //0th row
       data[0][0] = "testteamtechtest1";
       data[0][1] = "T3st3rT3ch\r\n";
       data[0][2] = "Restricted User";
       
       data[1][0] = "testteamtechtest";
       data[1][1] ="T3st3rT3ch";
       data[1][2] = "Non Resricted User";
      
       return data;
    }
	
	 @AfterTest
	    public void teardown() 
	    {
	    	driver.close();
	    }
}
