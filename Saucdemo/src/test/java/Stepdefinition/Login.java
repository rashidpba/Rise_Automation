package Stepdefinition;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver=null;
	
	@Given("open  https:\\/\\/www.saucedemo.com\\/")
	public void open_https_www_saucedemo_com() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","D:\\seleneum\\Saucdemo\\src\\test\\resources\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
    	
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.manage().window().maximize();
	  //Thread.sleep(3000);
	   
	}

	@When("^login to account (.*) and (.*)$")
	public void login_to_account_standard_user_and_secret_sauce(String username,String password) throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		//Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
	  //Thread.sleep(2000);
	
	}

	@Then("add to cart randomly")
	public void add_to_cart_randomly() throws InterruptedException {
	    
		 
		   
		   List<WebElement>elements= driver.findElements(By.xpath("//*[@class=\"btn btn_primary btn_small btn_inventory\"]"));
			int count=elements.size();
			Random r=new Random();
		
			elements.get(r.nextInt(count)).click();
			elements.get(r.nextInt(count)).click();
			elements.get(r.nextInt(count)).click();
			 Thread.sleep(2000);
			
			


		 WebElement cart=driver.findElement(By.xpath("//*[@class=\"shopping_cart_link\"]"));
		 try {
		 cart.click();
		
			}
			catch(StaleElementReferenceException e)
			{
				 cart=driver.findElement(By.xpath("//*[@class=\"shopping_cart_link\"]"));
				 cart.click();
			}
			driver.close();
			
			}

	
	
	}


	






