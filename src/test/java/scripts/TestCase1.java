package scripts;

import org.testng.annotations.Test;

import POM.AddToCartPage;
import POM.SkillraryDemoLoginPage;
import POM.SkillraryLoginPage;
import genericLibrary.BaseClass;

public class TestCase1 extends BaseClass{
	@Test
	public void testCase1() throws Throwable
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearButton();
		s.skillRaryDemo();
		utilities.switchingtabs(driver);
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utilities.mouseHover(driver, sd.getCourseTab());
		sd.seleniumTraining();
		AddToCartPage d=new AddToCartPage(driver);
		utilities.doubleClick(driver, d.getAddBtn());
		d.addToCart();
		Thread.sleep(2000);
		utilities.alertPopUp(driver);
	}

}
