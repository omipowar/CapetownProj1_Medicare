package medicare_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import medicare_test.MedicareBaseCLass;



public class medicareCartPage {
	WebDriver driver = MedicareBaseCLass.driver;

	// ============ Locators ==============

	@FindBy(xpath = "//a[@data-test='shopping-cart-link']")
	WebElement CartIcon;

	// ============= Methods ===============

	public medicareCartPage() {

		PageFactory.initElements(driver, this);
	}

	public void CheckCart(String ProductName) {
		CartIcon.click();
		//String ProductXpath = "//div[text()='" + ProductName + "']//following::button[1]";

		//WebElement RemoveFromCart = driver.findElement(By.xpath(ProductXpath));

	}
}


