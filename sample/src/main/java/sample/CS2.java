package sample;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;

public class CS2 {
	public static WebDriver driver;
	@When("I enter the URL and click on Signin")
	public void i_enter_the_URL_and_click_on_Signin() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Desktop\\Nivetha Accenture\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("http://192.168.40.4:8083/TestMeApp");
		   driver.manage().window().maximize();
		   driver.findElement(By.partialLinkText("SignIn")).click();
	}


@When("I enter the {string} and {string}")
public void i_enter_the_and(String username, String password, io.cucumber.datatable.DataTable dataTable) {
	List<Map<String,String>> list=dataTable.asMaps(String.class,String.class);
	driver.findElement(By.id("userName")).sendKeys(list.get(0).get("username"));
	driver.findElement(By.id("password")).sendKeys(list.get(0).get("password"));
}

@Then("click on Login")
public void click_on_Login() {
	 driver.findElement(By.name("Login")).click();
	 driver.close();
		
}

	
}
