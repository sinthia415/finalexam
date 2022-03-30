package finalexam;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;



public class FinalExam {
	
	

	 WebDriver driver ;
	 
	 @BeforeTest  // to launch the browser
	  public void loginBrowser() {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sinth\\Downloads\\chromedriver.exe");
		  
		
			
			   String baseUrl = "https://www.saucedemo.com/";
			        System.out.println("Launching Google Chrome browser"); 
			        driver = new ChromeDriver();
			        driver.get(baseUrl);
	  }
	 
	 @Test(priority=1)
	  public void Login() throws InterruptedException //for login details
	  {
		  WebElement  UserName = driver.findElement(By.xpath("//input[@id='user-name']")); //username
			 UserName.sendKeys("standard_user");
			 
			 WebElement  Password = driver.findElement(By.xpath("//input[@id='password']")); //password
			 Password.sendKeys("secret_sauce");
			 
			 WebElement  Login = driver.findElement(By.xpath("//input[@id='login-button']")); //login details
			 Login.click();
			 
			 Thread.sleep(1000);
			 
			 
	  }
	 
		
	 @Test(priority=2)
	  public void AddToCart() throws InterruptedException //to add items in carts
	  {
		 WebElement  SauceLabBackPack = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")); 
		 SauceLabBackPack.click();
		 
		 WebElement  BoltTshirt = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
		 BoltTshirt.click();
		 
		 WebElement  onesie = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
		 onesie.click();
		 
		 WebElement  BikeLight = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
		 BikeLight .click();
		 
		 
		 WebElement  FleeceJacket = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']"));
		 FleeceJacket .click();
		 
		 
		 WebElement  TShirtRed = driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));
		 TShirtRed  .click();
		 
		 Thread.sleep(1000);
		 
		 
	  }
	 
	 @Test(priority=3)
	  public void RemoveItems() throws InterruptedException //to remove items in carts
	  {
		 WebElement  SauceLabBackPack = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")); 
		 SauceLabBackPack.click();
		 
		 
		 WebElement  BoltTshirt = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bolt-t-shirt']"));
		 BoltTshirt.click();
		 
		 WebElement  onesie = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-onesie']"));
		 onesie.click();
		 
		 WebElement  BikeLight = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bike-light']"));
		 BikeLight .click();
		 
		 
		 WebElement  FleeceJacket = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-fleece-jacket']"));
		 FleeceJacket .click();
		 
		 
		 WebElement  TShirtRed = driver.findElement(By.xpath("//button[@id='remove-test.allthethings()-t-shirt-(red)']"));
		 TShirtRed  .click();
		 
		 Thread.sleep(1000);
		 
		 
		
	  }
	 
	 
	 @Test(priority=4)
	  public void Cart() throws InterruptedException //to checkout cart
	  {
		 
		 WebElement Cart = driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]"));
		 Cart .click();
		 
		 Thread.sleep(1000);
		 
		 
	  }
	 
	 @Test(priority=5)
	  public void Checkout() throws InterruptedException // checkout details
	  {
		 
		 WebElement Checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
		 Checkout .click();
		 
		 WebElement  FirstName = driver.findElement(By.xpath("//input[@id='first-name']")); //username
		 FirstName.sendKeys("john");
		 
		 WebElement  LastName = driver.findElement(By.xpath("//input[@id='last-name']")); //username
		 LastName.sendKeys("smith");
		 
		 WebElement  zipPostalCode = driver.findElement(By.xpath("//input[@id='postal-code']")); //username
		 zipPostalCode .sendKeys("H4A2H5");
		 
		 WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
		 Continue .click();
		 
		 Thread.sleep(1000);
		 
	  }
	 
	// @Test(priority=8)
	 // public void Cancel() //to remove items in carts
	 // {
	 
	// WebElement Cancel = driver.findElement(By.xpath("//button[@id='cancel']"));
	// Cancel .click();
	 
	 // }
		 
		
		 
		// @Test(priority=7)
		 // public void Continue() //to remove items in carts
		 // {
		 
		// WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
		// Continue .click();
		 
		 
		 
	 // }
	 
		 @Test(priority=6) 
		  public void finish() throws InterruptedException // for finish
		  {
		 
		 WebElement finish = driver.findElement(By.xpath("//button[@id='finish']"));
		 finish .click();
		 
		 Thread.sleep(1000);
		 
		 
		 
		 
	  }
		 @Test(priority=9)
		  public void BackHome() throws InterruptedException //to go back to the home page
		  {
		 
		 WebElement BackHome= driver.findElement(By.xpath("//button[@id='back-to-products']"));
		 BackHome .click();
		 
		 Thread.sleep(1000);
		 
		 
		 
	 
		  }
}
	 
	 