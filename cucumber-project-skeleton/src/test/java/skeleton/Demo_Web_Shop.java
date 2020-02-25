package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo_Web_Shop {
	WebDriver driver;
	@Given("Demowebshop is opened")
	public void demowebshop_is_opened() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
	}
	
	@When("I provide valid Emailid and Password")
	public void i_provide_valid_Emailid_and_Password()
	{
		driver.findElement(By.name("Email")).sendKeys("cmushadvg@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Manjula123");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();

	}
	@Then("The user can login")
	public void the_user_can_login()
	{
		String msg=driver.findElement(By.cssSelector("ul.nav")).getText();
		String msg2="cmushadvg@gmail.com";
		Assert.assertTrue(msg.contains(msg2));
		driver.findElement(By.linkText("Log out")).click();
	}
   	}
