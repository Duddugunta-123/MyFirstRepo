package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText = "Register")
	private WebElement registerElement;
	
	public WebElement getRegisterElement() {
		return registerElement;
	}
	
	
	
	
	@FindBy(id="gender-female")
	private WebElement clickElement;
	
	public WebElement getClickElement() {
		return clickElement;
	}
	
	
	
	@FindBy(id="FirstName")
	private WebElement firstNameElement;
	
	public WebElement getFirstNameElement() {
		return firstNameElement;
	}
	
	
	
	
	@FindBy(id="LastName")
	private WebElement lastNameElement;
	
	public WebElement getLastNameElement() {
		return lastNameElement;
	}
	
	
	
	@FindBy(id="Email")
	private WebElement emailElement;
	
	public WebElement getEmailElement() {
		return emailElement;
	}
	
	
	
	
	@FindBy(id="Password")
	private WebElement passwordElement;
	
	public WebElement getPasswordElement() {
		return passwordElement;
	}
	
	
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPasswordElement;
	
	public WebElement getConfirmPasswordElement() {
		return confirmPasswordElement;
	}
	
	
	
	
	@FindBy(id="register-button")
	
	private WebElement registerButtonElement;
	
	public WebElement getRegisterButtonElement() {
		
	return registerButtonElement;
	}
	
}
