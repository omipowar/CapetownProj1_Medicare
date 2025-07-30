package medicare_test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import medicare_pages.medicareLoginPage;
import medicare_test.MedicareBaseCLass;
import medicare_test.MedicareListenerClass;

@Listeners(MedicareListenerClass.class)
public class MedicareLoginTest extends MedicareBaseCLass {
	
			@Test(priority = 1)
		public void LoginSucessTest() {
			/*
			 * String env = System.getenv("ENV");
			 * 
			 * if(env.equals("Dev")) {
			 * 
			 * throw new SkipException("Skipping the test case beacuse env is Dev");
			 * 
			 * }
			 */
			WebElement LoginLink = driver.findElement(By.linkText("Login"));
			LoginLink.click();
				
		
			medicareLoginPage lp = new medicareLoginPage();
			lp.LoginFunction("omi@gmail.com", "12345");

		}

		@Test(priority = 0)

		public void LoginFailureTest() {
			WebElement LoginLink = driver.findElement(By.linkText("Login"));
			LoginLink.click();
			medicareLoginPage lp = new medicareLoginPage();
			lp.LoginFunction("omi@gmail.com", "11111");

			WebElement ErrorMessage = driver.findElement(By.xpath("//div[@class='alert alert-danger fade in']"));
			Assert.assertEquals(ErrorMessage.getText(), "Username and Password is invalid!");

		}

	}

