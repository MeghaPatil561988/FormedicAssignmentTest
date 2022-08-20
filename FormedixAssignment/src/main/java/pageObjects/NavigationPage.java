package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationPage {
	WebDriver driver;

	By repository = By.cssSelector(".fdx-main-nav-item-default.fdx-repository.fdxicon-regular");
			//xpath("//body/fdx-main-nav[1]/div[1]/ul[1]/li[2]/fdx-main-nav-item[1]/div[1]/p[1]");
	By studies = By.xpath("//p[contains(text(),'Browse, update and transition studies through thei')]");
	By techstudytitle = By.xpath("//h1[contains(text(),'Tech Study')]");
	By techstudymenu = By.xpath("//span[@id='fdxMdbContainerListItem0MenuToggle']");
	By viewoption = By.xpath("//li[@id='fdxMdbContainerListItem0View']");
	By dataacquisitionassetview = By.xpath("//span[@id='dataAcquisitionType']");
	By viewforms = By.cssSelector("#FORMTypeName");
	By medicalhistory = By.xpath("//span[contains(text(),'Medical History')]");
	By editform = By.xpath("#switchEditMode");
	
	By adddescriptionicon = By.cssSelector("#editPropsAddEntrydescription");
	By descriptiontextarea = By.xpath("//textarea[@id='assetLocaleEditTextTextareadescription']");
	By savechange = By.cssSelector("#saveAsset");
	By properypaneluserupdate = By.xpath("//span[contains(text(),'allergies,illnesses')]");
	By backtoassetlist = By.cssSelector("#swichPanel");
	By userupdatemainformview = By.cssSelector("#formDescription");
	By testteamtechtestover = By.xpath("//p[contains(text(),'testteamtechtest')]");
	By signout = By.cssSelector("#menuUserLogout");
	
	
	public NavigationPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public WebElement getrepository()
	{
		return driver.findElement(repository);
	}
	public WebElement getstudies()
	{
		return driver.findElement(studies);
	}
	public WebElement gettechstudytitle()
	{
		return driver.findElement(techstudytitle);
	}
	public WebElement gettechstudymenu()
	{
		return driver.findElement(techstudymenu);
	}
	public WebElement getviewoption()
	{
		return driver.findElement(viewoption);
	}
	public WebElement getdataacquisitionassetview()
	{
		return driver.findElement(dataacquisitionassetview);
	}
	public WebElement getviewforms()
	{
		return driver.findElement(viewforms);
	}
	public WebElement getmedicalhistory()
	{
		return driver.findElement(medicalhistory);
	}
	public WebElement geteditform()
	{
		return driver.findElement(editform);
	}
	public WebElement getadddescription()
	{
		return driver.findElement(adddescriptionicon);
	}
	public WebElement getdescriptiontextarea()
	{
		return driver.findElement(descriptiontextarea);
	}
	public WebElement getsavechange()
	{
		return driver.findElement(savechange);
	}
	public WebElement getproperypaneluserupdate()
	{
		return driver.findElement(properypaneluserupdate);
	}
	public WebElement getbacktoassetlist()
	{
		return driver.findElement(backtoassetlist);
	}
	public WebElement getuserupdatemainformview()
	{
		return driver.findElement(userupdatemainformview);
	}
	public WebElement gettestteamtechtestover()
	{
		return driver.findElement(testteamtechtestover);
	}
	public WebElement getsignout()
	{
		return driver.findElement(signout);
	}
}
