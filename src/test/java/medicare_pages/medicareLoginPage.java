package medicare_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import medicare_test.MedicareBaseCLass;

public class medicareLoginPage {
	WebDriver driver=MedicareBaseCLass.driver;
	//locators
	@FindBy(xpath="//input[@id='username']")
	WebElement UserName;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@type='submit' and @value='Login']")
	WebElement LoginBtn;
	
	
	//methods
	public medicareLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void LoginFunction(String UserNameVal,String PasswordVal)  {
		
		UserName.sendKeys(UserNameVal);
		Password.sendKeys(PasswordVal);
		LoginBtn.click();
	}

}
