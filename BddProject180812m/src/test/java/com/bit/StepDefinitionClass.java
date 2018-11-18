package com.bit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionClass {
	WebDriver dr;
	@Given("^open browser$")
	public void open_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\peal9\\Downloads\\chromedriver_win32\\chromedriver.exe");
	dr = new ChromeDriver();
	}

	@Given("^navigate to facebook url$")
	public void navigate_to_facebook_url() throws Throwable {
	   dr.get("https://www.facebook.com/");
	}

	@When("^user type userid on userid box$")
	public void user_type_userid_on_userid_box() throws Throwable {
	    dr.findElement(By.xpath("//input[@id='email']")).sendKeys("jamesbond");
	}

	@When("^user type password on password box$")
	public void user_type_password_on_password_box() throws Throwable {
	    dr.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		dr.findElement(By.xpath("//input[@id='u_0_8']")).click();
	 
	}

	@Then("^user should be in login page$")
	public void user_should_be_in_login_page() throws Throwable {
		System.out.println("i am on profile page");
	    
	}
	@When("^user type invalid userid on userid box$")
	public void user_type_invalid_userid_on_userid_box() throws Throwable {
		dr.findElement(By.xpath("//input[@id='email']")).sendKeys("invalid jamesbond");
	}

	@When("^user type invalid password on password box$")
	public void user_type_invalid_password_on_password_box() throws Throwable {
		dr.findElement(By.xpath("//input[@id='pass']")).sendKeys("invaild12345");
	}

	@Then("^user should not  be in login page$")
	public void user_should_not_be_in_login_page() throws Throwable {
	  
	}

	@When("^user type \"([^\"]*)\" on userid box$")
	public void user_type_on_userid_box(String arg) throws Throwable {
		dr.findElement(By.xpath("//input[@id='email']")).sendKeys(arg);
	}

	@When("^user type \"([^\"]*)\" on password box$")
	public void user_type_on_password_box(String arg1) throws Throwable {
		dr.findElement(By.xpath("//input[@id='pass']")).sendKeys(arg1);
	}
	
	
	
	@Then("^user should be in profile page$")
	public void user_should_be_in_profile_page() throws Throwable {
	    System.out.println("user is profile page");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
