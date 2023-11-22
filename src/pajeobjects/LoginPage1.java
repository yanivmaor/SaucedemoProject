package pajeobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage1 extends BasePage{
	@FindBy (css ="#user-name" )
	private WebElement userfield ;
	@FindBy (css ="#password" )
	private WebElement passfield ;
	@FindBy (css ="#login-button" )
	private WebElement LoginBtn ;
	@FindBy (css ="[data-test='error']" )
	private WebElement errorMsg ;
	@FindBy (css ="[data-test='error']" )
	private WebElement errorMsg2 ;
	@FindBy (css ="#login_button_container > div > form > h3" )
	private WebElement errorMsg3 ;

	public LoginPage1(WebDriver driver) {
		super(driver); }

	
	public void LoginFailed () {
		click(LoginBtn); }
	
	
	public String Errormsg () {
		return (getText(errorMsg)); }
		
	
	public void LoginFailed2 (String username, String password) {
		fillText(passfield,password);
		click(LoginBtn); }
	
	
	public String Errormsg2 () {
		return (getText(errorMsg2)); }
	
	
	public void LoginFailed3 (String username, String password) {
		fillText(userfield, username);
		fillText(passfield,password);
		click(LoginBtn); }
	
	public String Errormsg3 () {
		return (getText(errorMsg3)); }
	
	public void LoginPass (String username, String password) {
		fillText(userfield, username);
		fillText(passfield,password);
		click(LoginBtn); }

























}



