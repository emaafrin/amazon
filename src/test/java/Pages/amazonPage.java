package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonPage {
	WebDriver driver;
	
	 public amazonPage(WebDriver dr) {
		 driver = dr;
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 
	 @FindBy(xpath="//a[@id='nav-link-accountList']")
	 WebElement signinButton;
	 
	 @FindBy(xpath="//input[@id='ap_email']")
	 WebElement emailBox;
	
	 @FindBy(xpath="//input[@id='continue']")
	 WebElement contiuneButton;
	 
	 @FindBy(xpath="//input[@type='password']")
	 WebElement PassWordBox;
	 
	 @FindBy(xpath="//input[@id='signInSubmit']")
	 WebElement signinBox;
	 
	 @FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	 WebElement AccountName;
	
	 public void clickOnSignInButton() {
		 signinButton.click();
	 }
	 
	 public void enterEmailAddress(String User_Name) {
		 emailBox.sendKeys(User_Name);
		 contiuneButton.click();
		 
	 }
	 public void enterPassword(String password) {
		 PassWordBox.sendKeys(password);
		 signinBox.click();
		 
		 
	 }
	 public String verifyAmazonAccount() {
		 return AccountName.getText();
		 
	 }

}

