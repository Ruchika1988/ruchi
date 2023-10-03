package testscenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

import objects.BaseClass;
import objects.Elements;

public class ElementsTestCases extends BaseClass {
	WebDriver driver;

	@BeforeTest
	public void beforetest() {

		driver = init_driver();

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	@Test(priority = 1)
	public void openTest() throws InterruptedException {
		Elements e;
		e = new Elements(driver);
		e.accesslink();
		Thread.sleep(2000);

	}

	@Test(priority = 2)
	public void cbTest() throws InterruptedException {
		Elements f;
		f = new Elements(driver);
		f.checkBoxclick();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void rbTest() throws InterruptedException {
		Elements g;
		g = new Elements(driver);
		g.rbclick();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void wtTest() throws InterruptedException {
		Elements g;
		g = new Elements(driver);
		g.wtclick();
		Thread.sleep(2000);
	}

	@Test(priority = 4)
	public void bTest() throws InterruptedException {
		Elements h;
		h = new Elements(driver);
		h.bclick();
		Thread.sleep(2000);

	}

	@AfterTest
	public void aftertest() {
		driver.quit();

	}

}
