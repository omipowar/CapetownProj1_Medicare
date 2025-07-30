package medicare_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import medicare_test.MedicareBaseCLass;

public class medicareProductPage {
	WebDriver driver = MedicareBaseCLass.driver;

	// ============ Locators ==============

	@FindBy(xpath = "//input[@id='cardNumber']")
	WebElement cardNum;

	@FindBy(xpath = "//input[@id='expityMonth']")
	WebElement cardExpiry;

	@FindBy(xpath = "//input[@id='expityYear']")
	WebElement cardExpiryyear;

	@FindBy(xpath = "//input[@id='cvCode']")
	WebElement cardCVV;

	// ============= Methods ===============

	public medicareProductPage() {

		PageFactory.initElements(driver, this);
	}

	public void AddToCart(String ProductName) {
		// td[text()='Paracetamol']//following-sibling::td[4]//following-sibling::a[1]

		String ProductXpath = "//td[text()='" + ProductName + "']//following-sibling::td[4]//following-sibling::a[1]";

		WebElement AddToCart = driver.findElement(By.xpath(ProductXpath));
		AddToCart.click();

	}

	public void AddToCart(String ProductName, int i,int len) {
		// td[text()='Paracetamol']//following-sibling::td[4]//following-sibling::a[1]
		String ProductXpath = "//td[text()='" + ProductName + "']//following-sibling::td[4]//following-sibling::a[1]";

		WebElement AddToCart = driver.findElement(By.xpath(ProductXpath));
		AddToCart.click();

		if(i<len-1) {		
		String continuepath = "//a[@class='btn btn-warning']";
		WebElement continueShopping = driver.findElement(By.xpath(continuepath));
		continueShopping.click();
		}
		
	}

	public void PayCart(String cardNo, String month, String year, String cv) {
		String checkoutXPath = "//a[@class='btn btn-success btn-block']";
		WebElement checkout = driver.findElement(By.xpath(checkoutXPath));
		checkout.click();

		String selectAddress = "//a[@class='btn btn-primary']";
		WebElement checkoutAddress = driver.findElement(By.xpath(selectAddress));
		checkoutAddress.click();
		
		cardNum.sendKeys(cardNo);
		cardExpiry.sendKeys(month);
		cardExpiryyear.sendKeys(year);
		cardCVV.sendKeys(cv);
		String payPath = "//a[@class='btn btn-success btn-lg btn-block']";
		WebElement payCLick = driver.findElement(By.xpath(payPath));
		payCLick.click();
	}
}
