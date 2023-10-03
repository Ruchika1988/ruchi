package objects;

import java.util.List;
import java.util.logging.LogManager;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.mongodb.diagnostics.logging.Logger;

public class Elements

{
	private static Logger logger = LogManager.getLogger(Elements.class);

	public WebDriver driver;

	@FindBy(xpath = "(//li[@id='item-0'])[1]")
	WebElement TextBox;
	@FindBy(xpath = "(//li[@id='item-1'])[1]")
	WebElement CheckBox;
	@FindBy(xpath = "//li[@id='item2']")
	WebElement RadioButton;
	@FindBy(xpath = "(//li[@id='item-3'])[1]")
	WebElement WebTables;
	@FindBy(xpath = "(//li[@id='item-4'])[1]")
	WebElement Buttons;
	@FindBy(xpath = "(//div[@class='card-up'])[1]")
	WebElement Element;
	@FindBy(xpath = "(//input[@id='userName'])")
	WebElement inputName;
	@FindBy(xpath = "(//input[@id='userEmail'])[1]")
	WebElement inputEmail;
	@FindBy(xpath = "(//textarea[@id='currentAddress'])[1]")
	WebElement inputCa;
	@FindBy(xpath = "(//textarea[@id='permanentAddress'])[1]")
	WebElement inputPa;
	@FindBy(xpath = "(//button[@id='submit'])")
	WebElement submit;
	@FindBy(xpath = "(//p[@id='name'])[1]")
	WebElement outputName;
	@FindBy(xpath = "(//p[@id='email'])[1]")
	WebElement outputEmail;
	@FindBy(xpath = "(//p[@id='currentAddress'])[1]")
	WebElement outputCa;
	@FindBy(xpath = "(//p[@id='permanentAddress'])[1]")
	WebElement outputPa;
	@FindBy(xpath = "(//div[@class='border col-md-12 col-sm-12'])[1]")
	WebElement outputBlock;

	@FindBy(xpath = "(//li[@id='item-1'])[1]")
	WebElement checkBox;
	@FindBy(xpath = "(//button[@title='Expand all'])[1]")
	WebElement plus;
	@FindBy(xpath = "(//span[contains(text(),'Desktop')])")
	WebElement desktop;
	@FindBy(xpath = "(//span[contains(text(),'Downloads')])[1]")
	WebElement downloads;
	@FindBy(xpath = "(//span[contains(text(),'Commands')])[1]")
	WebElement commands;
	@FindBy(xpath = "(//span[contains(text(),'Word File.doc')])[1]")
	WebElement wordfile;
	@FindBy(xpath = "(//span[contains(text(),'Excel File.doc')])[1]")
	WebElement excelfile;
	@FindBy(xpath = "(//span[normalize-space()='desktop'])[1]")
	WebElement outputDesktop;
	@FindBy(xpath = "(//span[normalize-space()='notes'])[1]")
	WebElement outputNotes;
	@FindBy(xpath = "(//span[normalize-space()='commands'])[1]")
	WebElement outputCommands;
	@FindBy(xpath = "(//span[normalize-space()='downloads'])[1]")
	WebElement outputDownloads;
	@FindBy(xpath = "(//span[normalize-space()='wordFile'])[1]")
	WebElement outputWordfile;
	@FindBy(xpath = "(//span[normalize-space()='excelFile'])[1]")
	WebElement outputExcelFile;
	@FindBy(xpath = "(//span[@class='rct-checkbox'])")
	List<WebElement> cb;
	@FindBy(xpath = "(//li[@id='item-2'])[1]")
	WebElement radioButton;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio custom-control-inline'])[2]")
	WebElement circleYes;
	@FindBy(xpath = "(//label[normalize-space()='Impressive'])[1]")
	WebElement circleImpressive;
	@FindBy(xpath = "(//p[@class='mt-3'])[1]")
	WebElement output;
	@FindBy(xpath = "(//span[@class='text-success'])[1]")
	WebElement outputValue;
	@FindBy(xpath = "(//li[@id='item-3'])[1]")
	WebElement webTables;
	@FindBy(xpath = "(//button[@id='addNewRecordButton'])")
	WebElement add;
	@FindBy(xpath = "(//div[contains(@role,'gridcell')])")
	List<WebElement> gridcell;
	@FindBy(xpath = "(//span[@id='delete-record-4']//*[name()='svg'])")
	WebElement delete;
	@FindBy(xpath = "(//span[@id='edit-record-4'])")
	WebElement edit;
	@FindBy(xpath = "(//input[@id='firstName'])[1]")
	WebElement addFirstname;
	@FindBy(xpath = "(//input[@id='lastName'])[1]")
	WebElement addLastname;
	@FindBy(xpath = "(//input[@id='userEmail'])[1]")
	WebElement addEmail;
	@FindBy(xpath = "(//input[@id='age'])[1]")
	WebElement addAge;
	@FindBy(xpath = "(//input[@id='salary'])[1]")
	WebElement addSalary;
	@FindBy(xpath = "(//input[@id='department'])[1]")
	WebElement addDepartment;
	@FindBy(xpath = "(//button[normalize-space()='Submit'])[1]")
	WebElement addSubmit;
	@FindBy(xpath = "(//input[@id='searchBox'])[1]")
	WebElement searchText;
	@FindBy(xpath = "(//span[@id='basic-addon2']//span)")
	WebElement search;
	@FindBy(xpath = "(//div[contains(@role,'rowgroup')])")
	List<WebElement> Display;
	@FindBy(xpath = "(//li[@id='item-4'])[1]")
	WebElement buttons;
	@FindBy(xpath = "(//button[normalize-space()='Double Click Me'])[1]")
	WebElement doubleClick;
	@FindBy(xpath = "(//button[normalize-space()='Right Click Me'])[1]")
	WebElement rightclick;
	@FindBy(xpath = "(//button[normalize-space()='Click Me'])[1]")
	WebElement clickme;
	@FindBy(xpath = "(//p[@id='rightClickMessage'])[1]")
	WebElement rcMessage;
	@FindBy(xpath = "(//p[@id='dynamicClickMessage'])[1]")
	WebElement cMessage;
	@FindBy(xpath = "(//p[@id='doubleClickMessage'])[1]")
	WebElement dcMessage;

	public Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void accesslink() throws InterruptedException

	{
		driver.get("https://demoqa.com");
		Element.click();
		Thread.sleep(3000);
		TextBox.click();
		inputName.sendKeys("Ruchika Mago");
		inputEmail.sendKeys("ruchikamago@gmail.com");
		inputCa.sendKeys("B004 Mona Greens Zirakpur");
		inputPa.sendKeys("B004 Mona Greens");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		submit.click();

		String expName = "Name:" + "Ruchika Mago";
		String expEmail = "Email:" + "ruchikamago@gmail.com";
		String expCa = "Current Address :" + "B004 Mona Greens Zirakpur";
		String expPa = "Permananet Address :" + "B004 Mona Greens";

		ArrayList<String> expected = new ArrayList<String>();
		expected.add(expName);
		expected.add(expEmail);
		expected.add(expCa);
		expected.add(expPa);
		// TODO Auto-generated method stub
		String actName = outputName.getText();
		String actEmail = outputEmail.getText();
		String actCa = outputCa.getText();
		String actPa = outputPa.getText();

		ArrayList<String> actual = new ArrayList<String>();
		actual.add(actName);
		actual.add(actEmail);
		actual.add(actCa);
		actual.add(actPa);

		Thread.sleep(4000);
		Assert.assertEquals(expected, actual);
	}

	@SuppressWarnings("unused")
	public void checkBoxclick() throws InterruptedException {

		checkBox.click();
		Thread.sleep(3000);

		plus.click();
		Thread.sleep(3000);

		// checks.get(2).click();
		for (int i = 0; i < cb.size(); i = i + 1) {
			cb.get(i).click();
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

			break;

		}

		// desktop.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);

		// downloads.click();

		String expDesktop = "desktop";
		String expNotes = "notes";
		String expCommands = "commands";
		String expDownloads = "downloads";
		String expWordfile = "wordFile";
		String expExcelfile = "excelFile";

		ArrayList<String> expected1 = new ArrayList<String>();
		expected1.add(expDesktop);
		expected1.add(expNotes);
		expected1.add(expCommands);
		expected1.add(expDownloads);
		expected1.add(expWordfile);
		expected1.add(expExcelfile);

		String actDesktop = outputDesktop.getText();
		String actNotes = outputNotes.getText();
		String actCommands = outputCommands.getText();
		String actDownloads = outputDownloads.getText();
		String actWordfile = outputWordfile.getText();
		String actExcelfile = outputExcelFile.getText();

		ArrayList<String> actual1 = new ArrayList<String>();
		actual1.add(actDesktop);
		actual1.add(actNotes);
		actual1.add(actCommands);
		actual1.add(actDownloads);
		actual1.add(actWordfile);
		actual1.add(actExcelfile);

		Thread.sleep(4000);
		Assert.assertEquals(expected1, actual1);

		cb.get(2).click();
		Assert.assertTrue(outputValue.isDisplayed());

	}

	public void rbclick() throws InterruptedException {
		radioButton.click();
		circleYes.click();

		String expImpressive = "Impressive";
		String actYes = outputValue.getText();
		Assert.assertEquals(expImpressive, actYes);
		Thread.sleep(2000);

	}

	public void wtclick() throws InterruptedException {
		webTables.click();
		add.click();
		Thread.sleep(2000);
		addFirstname.sendKeys("Ruchika");
		addLastname.sendKeys("Mago");
		addEmail.sendKeys("ruchikamago@gmail.com");
		addAge.sendKeys("35");
		addSalary.sendKeys("20000");
		addDepartment.sendKeys("IT");
		addSubmit.click();
		Thread.sleep(4000);
		Assert.assertTrue(Display.get(5).isDisplayed());

		edit.click();
		addLastname.clear();
		addLastname.sendKeys("Bajaj");
		addSubmit.click();
		Thread.sleep(4000);
		Assert.assertTrue(Display.get(5).isDisplayed());

		searchText.sendKeys("Ruchika");
		search.click();

		Assert.assertTrue(Display.get(1).isDisplayed());

		Thread.sleep(4000);

		delete.click();

	}

	public void bclick() throws InterruptedException {
		buttons.click();

		Actions act = new Actions(driver);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		act.doubleClick(doubleClick).perform();

		Assert.assertTrue(dcMessage.isDisplayed());

		act.contextClick(rightclick).perform();
		Assert.assertTrue(rcMessage.isDisplayed());

		clickme.click();
		Assert.assertTrue(cMessage.isDisplayed());
	}
	
	public void Log4Demo()
	{
		logger.info("This is information message");
		logger.error("This is error message");
		logger.warn("This is a warning message");
		System.out.println("\n completed ");
		
		
		
		
	}
}

