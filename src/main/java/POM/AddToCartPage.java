package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	//address of + button
	@FindBy(id="add")
	private WebElement addBtn;
	//address of cart
	@FindBy(xpath="//button[contains(text(),'Add to Cart')]")
	private WebElement addtoCart;
	
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddBtn() {
		return addBtn;
	}

	public void addToCart()
	{
		addtoCart.click();
	}
	
	
}
