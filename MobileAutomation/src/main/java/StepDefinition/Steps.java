package StepDefinition;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				

    WebDriver driver;			
    		
    @Given("^Open the ChromeDriver and launch the application$")					
    public void open_the_ChromeDriver_and_launch_the_application() throws Throwable							
    {	
       System.out.println("Opening Chrome Driver");
       System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
       driver= new ChromeDriver();
       driver.manage().window().maximize();
       System.out.println("Navigating to the Url");
       driver.get("http://demo.guru99.com/v4");	
    }		

    @When("^Enter the Username \"(.*)\" and Password \"(.*)\"$")			
    public void enter_the_Username_and_Password(String username,String password) throws Throwable 							
    {		
       System.out.println("Entering Username");
       driver.findElement(By.name("uid")).sendKeys(username);	
       System.out.println("Entering Password");
       driver.findElement(By.name("password")).sendKeys(password);					
    }		

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {		
       driver.findElement(By.name("btnReset")).click();	
       driver.close();
    }		
}		