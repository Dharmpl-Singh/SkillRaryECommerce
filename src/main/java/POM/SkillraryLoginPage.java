package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {

	//Declaration
	//address of gears
	@FindBy(xpath="//a[contains(text(),'GEARS')] ")
	private WebElement gearbtn;
	
	//address of skillrary demo
	@FindBy(xpath="(//a[contains(text(),'SkillRary Demo APP')])[2]")
	private WebElement skillrarydemo;
	//address of searchtxt box
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchTxt;
	//address of searchbtn
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	
	//Initialization
	public SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void gearButton()
	{
		gearbtn.click();
	}
	public void skillRaryDemo()
	{
		skillrarydemo.click();
		
	}
	public void searchText(String name)
	{
		searchTxt.sendKeys(name);
	}
	public void searchButton()
	{
		searchbtn.click();
	}
	
}
