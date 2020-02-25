package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testmeapp {
	WebDriver driver;

@Given("user is in the login page")
	public void user_is_in_the_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
	}
@When("user provide valid credentials")
	public void user_provide_valid_credentials() {
	    	driver.findElement(By.name("userName")).sendKeys("Lalitha");
			driver.findElement(By.name("password")).sendKeys("Password123");
			driver.findElement(By.name("Login")).click();

	 }
@Then("user will be logged in")
public void user_will_be_logged_in() {
		String msg=driver.findElement(By.cssSelector("ul.nav")).getText();
		String msg2="Hi, Lalitha";
		Assert.assertTrue(msg.contains(msg2));
		driver.findElement(By.linkText("SignOut")).click();
		driver.close();
	}
@Given("user is on the login page")
public void user_is_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
	}
@When("user provide invalid credentials")
public void user_provide_invalid_credentials() {
		driver.findElement(By.name("userName")).sendKeys("Lalit");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();

	}
@Then("user will get error messege")
public void user_will_get_error_messege() {
		String msg=driver.findElement(By.cssSelector("div.row")).getText();
		String msg2="Username or Password is wrong here!!!";
		Assert.assertTrue(msg.contains(msg2));
		driver.close();
	}

@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
	}
    

@When("user click on login without any information")
public void user_click_on_login_without_any_information() {
		driver.findElement(By.name("Login")).click();

	}
    
@Then("error messege will come")
public void error_messege_will_come() {
		String msg=driver.findElement(By.cssSelector("span.help-block")).getText();
		String msg2="Please Enter Username";
		Assert.assertTrue(msg.contains(msg2));
		driver.close();
	}

}
