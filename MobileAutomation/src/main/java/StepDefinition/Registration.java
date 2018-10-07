package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Hook;

public class Registration {

private WebDriver driver;
	
	public Registration() {
		this.driver = Hook.getDriver();
	}
	
	@Given("^I open the application$")
	public void i_open_the_application() throws Throwable {
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(By.xpath("//android.widget.Button[@text='SIGN_UP']")).isDisplayed());
	}

	@Then("^I tap on SignUp button$")
	public void I_tap_on_SignUp_button() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.Button[@text='SIGN_UP']")).click();
	}

	@When("^Enter the Username \"(.*)\" and FamilyName \"(.*)\"$")			
    public void enter_the_Username_and_FamilyName(String username,String familyName) throws Throwable 							
    {		
	   Thread.sleep(5000);
       System.out.println("Entering User Name");
       driver.findElement(By.xpath("//android.widget.EditText[@text='Name']")).sendKeys(username);	
       Thread.sleep(5000);
       System.out.println("Entering Family Name");
       driver.findElement(By.xpath("//android.widget.EditText[@text='Family Name']")).sendKeys(familyName);	
       Thread.sleep(5000);
    }		
	
	@Then("^I tap CreateAccount button$")
	public void I_tap_CreateAccount_button() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.Button[@text='CREATEACCOUNT']")).click();
		Thread.sleep(5000);
	}
}
