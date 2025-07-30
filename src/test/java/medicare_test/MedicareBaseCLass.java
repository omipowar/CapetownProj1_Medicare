package medicare_test;

import java.net.MalformedURLException;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class MedicareBaseCLass {

	public static WebDriver driver;
		
	@BeforeMethod
	public void SetUp() throws MalformedURLException {
		        driver = new EdgeDriver();
				driver.get("http://localhost:8081/medicare/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	
	@AfterMethod
	public void TearDown() {
		driver.quit();	
	}
	
	


}
