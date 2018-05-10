import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCaseCheckout {
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		File writer = new File("LogTestCaseCheckout.txt");
		PrintWriter printWriter = new PrintWriter(writer);
		
		
		String os = System.getProperty("os.name").toLowerCase();
		//implements google chrome
		
		
		//if its mac or windows
		if(os.contains("mac")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		}else {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		}
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		try {
		//goes to newegg.com
		HomePage.OpenNewEgg(driver, printWriter, timestamp);
		
		//product search
		HomePage.ProductSearch(driver,"Full Tower", printWriter, timestamp);
		
		
		//clicks on the first item on the list and list items on the webpage
		ProductSearchPage.ClickOnItem(driver, 1, printWriter, timestamp);
		
		
		//find add to cart id and clicks it
		ProductPage.ClickAddToCart(driver, printWriter, timestamp);
		
		//view shopping cart
		PostProductPage.ClickViewItem(driver, printWriter, timestamp);
	
		// Clicks Secure Checkout 
		ShoppingCartPage.ClickSecureCheckout(driver, printWriter, timestamp);
		
		// login modules
		LoginPage.Login(driver, "npgomes@uncg.edu", "Germany95!@", printWriter, timestamp);
		
		//enters shipping credentials
		String FName = "Nelson";
		String LName = "Gomes";
		String AddressLine1 = "1609 Wright Avenue";
		String EnterCity = "Greensboro";
		//make sure the state is in all caps
		String DropStateList = "NORTH CAROLINA";
		String EnterZip = "27403";
		String PhoneNumber= "9109206063";
		
		
		ShippingInfoPage.ShippingAddress(driver, js, FName, LName, AddressLine1, EnterCity, DropStateList, EnterZip, PhoneNumber, printWriter, timestamp);
	
		
		
		//clicks continue billing
		ShippingInfoPage.ClickContinueBilling(driver, printWriter, timestamp);
		
		Thread.sleep(4000);
		
		driver.quit();
		
		
		// if all of the modules work it should display message that says the test has passed
		modules.TestCasePassed(printWriter, timestamp);
		printWriter.close();
		}catch(Exception e) {
			printWriter.println(timestamp + " The test has failed check your website for element changes");
			System.out.println(timestamp +" The test has failed check your website for element changes");
			printWriter.close();
			driver.quit();
		}
	
		
		
}
	}