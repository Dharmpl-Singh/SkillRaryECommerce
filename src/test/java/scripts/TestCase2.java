package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import POM.SkillraryCourses;
import POM.SkillraryDemoLoginPage;
import POM.SkillraryLoginPage;
import genericLibrary.BaseClass;

public class TestCase2 extends  BaseClass{
	@Test
	public void testCase2() throws Throwable
	{
		SkillraryLoginPage sp=new SkillraryLoginPage(driver);
		sp.gearButton();
		sp.skillRaryDemo();
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utilities.switchingtabs(driver);
		utilities.dropDown(sd.getCourseDD(), pdata.getPropertydata("coursedd"));
		SkillraryCourses sk=new SkillraryCourses(driver);
		utilities.dragDrop(driver, sk.getSeleniumTraini(), sk.getMyCart());
		Thread.sleep(5000);
	}
}
