package medicare_test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import medicare_pages.medicareSignupPage;
import medicare_test.MedicareBaseCLass;
import medicare_test.MedicareListenerClass;

@Listeners(MedicareListenerClass.class)
public class MedicareSignupTest  extends MedicareBaseCLass {
	@Test
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
		WebElement signupLink = driver.findElement(By.linkText("Sign Up"));
		signupLink.click();
		
		medicareSignupPage lp = new medicareSignupPage();
		lp.signupFunction("tanu","patil","tanu@gmail.com","9191919191","1111","1111","patnephata","pipmpri","pune", "580001","maharashtra", "INDIA");
		
		

	}

	
}
