package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BaseTest;

public class RegisterPage extends BaseTest {
	
	
	public WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	private @FindBy(xpath = "//input[@name='firstName']")
	WebElement firstname;
	

	private @FindBy(xpath = "//input[@name='lastName']")
	WebElement lastname;
		

	private @FindBy(xpath = "//input[@name='phone']")
	WebElement phone;
	

	private @FindBy(xpath = "//input[@id='userName']")
	WebElement email;
	

	private @FindBy(xpath = "//input[@name='address1']")
	WebElement address;
	

	private @FindBy(xpath = "//input[@name='city']")
	WebElement city;
	
	private @FindBy(xpath = "//input[@name='state']")
	WebElement state;
	

	private @FindBy(xpath = "//input[@name='postalCode']")
	WebElement postalcode;
	
	

	private @FindBy(xpath = "//select[@name='country']")
	WebElement country;
	

	private @FindBy(xpath = "//input[@id='email']")
	WebElement userName;
	
	private @FindBy(xpath = "//input[@name='password']")
	WebElement userPassword;
	
	private @FindBy(xpath = "//input[@name='confirmPassword']")
	WebElement confirmPassword;
	

	private @FindBy(xpath = "//input[@name='submit']")
	WebElement submit;
	
	
	public void registerNewMembers(String ftname, String ltname, String phnumber, String mailid, String useraddress,
			String usercity, String userstate, String userpostalcode, String usercountry, String username, String userpassword,
			String confirmpassword)
	{
		firstname.sendKeys(ftname);
		lastname.sendKeys(ltname);
		phone.sendKeys(phnumber);
		email.sendKeys(mailid);
		address.sendKeys(useraddress);
		city.sendKeys(usercity);
		state.sendKeys(userstate);
		postalcode.sendKeys(userpostalcode);
		country.sendKeys(usercountry);
        userName.sendKeys(username);
        userPassword.sendKeys(userpassword);
        confirmPassword.sendKeys(confirmpassword);
	}}
	
