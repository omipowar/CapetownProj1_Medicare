package medicare_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import medicare_test.MedicareBaseCLass;
import medicare_pages.medicareLoginPage;
import medicare_pages.medicareProductPage;

@Listeners(MedicareListenerClass.class)
public class MedicareProductTest extends MedicareBaseCLass {
	@Test(priority = 1)
	public void AddToCartTest() {
		WebElement LoginLink = driver.findElement(By.linkText("Login"));
		LoginLink.click();

		medicareLoginPage lp = new medicareLoginPage();
		lp.LoginFunction("anild@gmail.com", "3333");

		WebElement viewProductLink = driver.findElement(By.xpath("//a[text()='View Products']"));
		viewProductLink.click();

		medicareProductPage pp = new medicareProductPage();
		String medicine = "Amoxicillin";
		pp.AddToCart(medicine);
		pp.PayCart("56565656", "02", "2026", "102");

	}

	@Test(priority = 0)
	public void multipleCartValue() {
		WebElement LoginLink = driver.findElement(By.linkText("Login"));
		LoginLink.click();

		medicareLoginPage lp = new medicareLoginPage();
		lp.LoginFunction("anitabali@gmail.com", "3333");

		WebElement viewProductLink = driver.findElement(By.xpath("//a[text()='View Products']"));
		viewProductLink.click();

		medicareProductPage pp = new medicareProductPage();
		String[] medicineName = { "Paracetamol", "Combiflame" };
		for (int i = 0; i < medicineName.length; i++) {

			pp.AddToCart(medicineName[i], i, medicineName.length);
			System.out.println(medicineName[i] + i);
		}

		pp.PayCart("56565656", "02", "2026", "102");

	}

}
