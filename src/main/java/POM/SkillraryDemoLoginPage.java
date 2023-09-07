package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {
	//address of course
	@FindBy(id="course")
	private WebElement courseTab;
	//address of selenium training 
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumTrain; 
	//address of course drop down
	@FindBy(name="addresstype")
	private WebElement courseDD;
	
	public SkillraryDemoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCourseTab() {
		return courseTab;
	}

	public void seleniumTraining()
	{
		seleniumTrain.click();
	}

	public WebElement getCourseDD() {
		return courseDD;
	}
	
}
