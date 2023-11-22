package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pajeobjects.LoginPage1;
import utils.Excel;

public class LoginTestNg extends BaseTest {

	
	@Test	
	public void tc01_loginFailed() {
		
	       LoginPage1 lp = new LoginPage1(driver);
	       lp.LoginFailed();
	       String actual = "Epic sadface: Username is required";
	       String expected = lp.Errormsg();
	       assertEquals(actual, expected); }
	       
	       
	@Test	
	   	public void tc02_loginFailed2() {
	   		
	   	       LoginPage1 lp = new LoginPage1(driver);
	   	       lp.LoginFailed2("", "secret_sauce");
	   	    String actual = "Epic sadface: Username is required";
		       String expected = lp.Errormsg();
		       assertEquals(actual, expected); }
	       
    
	@Test(dataProvider = "getDataFromExcel")
	   	public void tc03_loginFailed3(String user,String password) {
		   		
		   	       LoginPage1 lp = new LoginPage1(driver);
		   	       lp.LoginFailed3(user,password); 
	
		   	String actual = "Epic sadface: Username and password do not match any user in this service";
			       String expected = lp.Errormsg();
			       assertEquals(actual, expected); 
	}
     
     @Test	
	   	public void tc04_loginpass() {
		   		
		   	       LoginPage1 lp = new LoginPage1(driver);
		   	       lp.LoginPass("locked_out_user", "secret_sauce");
     }
		   	    
			     
     @DataProvider
 	public Object[][] getDataFromExcel(){
 		String excelPath = System.getProperty("user.dir") + "\\src\\data\\input.xlsx";
 		System.out.println(excelPath);
 		Object[][] table = Excel.getTableArray(excelPath, "Login");
 		return table;
     }
	
     
     
     
     
     
     
	
     
     
     @DataProvider   	   
	public Object[][] getData(){
		Object[][] myData = {
				{"usre1", "123"},
				{"yaniv","aaa"},
				{"gal", "123#4"},
				{"yaniv", "abc123456"},
		};
		return myData;
 	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
