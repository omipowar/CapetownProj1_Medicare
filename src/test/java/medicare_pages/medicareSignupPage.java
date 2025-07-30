package medicare_pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import medicare_test.MedicareBaseCLass;

public class medicareSignupPage {
	WebDriver driver=MedicareBaseCLass.driver;
	//locators
	@FindBy(xpath="//input[@id='firstName']")
	WebElement Firstname;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement Lastname;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='contactNumber']")
	WebElement contactNumber;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='confirmPassword']")
	WebElement confirmPassword;
	
	@FindBy(xpath="//input[@id='role1' and @value='USER']")
	WebElement Role;
	
	@FindBy(xpath="//button[@type='submit' and @name='_eventId_billing']")
	WebElement nextBilling;
	

	@FindBy(xpath="//input[@id='addressLineOne']")
	WebElement addressLineOne;
	
	@FindBy(xpath="//input[@id='addressLineTwo']")
	WebElement addressLineTwo;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath="//input[@id='postalCode']")
	WebElement postalCode;
	
	@FindBy(xpath="//input[@id='state']")
	WebElement state;
	
	@FindBy(xpath="//input[@id='country']")
	WebElement country;
	
	
	@FindBy(xpath="//button[@type='submit' and @name='_eventId_confirm']")
	WebElement nextConfirm;
	
	
	//methods
	public medicareSignupPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void signupFunction(String firstNameVal,String lastNameVal,String emailVal,String contactNumberVal,String passwordVal,String confirmPasswordVal,String addressLineOneVal,String addressLineTwoVal,String cityVal,String postalCodeVal,String stateVal,String countryVal)  {
		
		Firstname.sendKeys(firstNameVal);
		Lastname.sendKeys(lastNameVal);
		email.sendKeys(emailVal);
		contactNumber.sendKeys(contactNumberVal);
		password.sendKeys(passwordVal);
		confirmPassword.sendKeys(confirmPasswordVal);
		//Role.sendKeys(RoleVal);
		nextBilling.click();
		
		//second page
		addressLineOne.sendKeys(addressLineOneVal);
		addressLineTwo.sendKeys(addressLineTwoVal);
		city.sendKeys(cityVal);
		postalCode.sendKeys(postalCodeVal);
		state.sendKeys(stateVal);
		country.sendKeys(countryVal);
		nextConfirm.click();
		
		//thrid page
		WebElement confirmLink = driver.findElement(By.linkText("Confirm"));
		confirmLink.click();
		
	}
}
