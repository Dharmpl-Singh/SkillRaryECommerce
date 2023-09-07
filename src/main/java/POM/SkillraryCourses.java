package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryCourses {
	//address of selenium training
	@FindBy(id="Selenium Training")
	//@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumTraini;
	
	//address of mycart
	//@FindBy(xpath="//legend[text()='My cart']")
	@FindBy(xpath="(//fieldset[@id='mycart'])[1]")
	private WebElement myCart;
	
	//address of fb
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement fb;

	public SkillraryCourses(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getSeleniumTraini() {
		return seleniumTraini;
	}

	public WebElement getMyCart() {
		return myCart;
	}

	public void facebook()
	{
		fb.click();
	}
	
	
}
