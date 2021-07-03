package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;

@Listeners(TestNgListnerEx.class)

public class LoginTest extends BaseClass{
	
	@Test(enabled=false)
	@Parameters({"username","password"})
	public void LoginTest1(String uname, String pass) {
		
		LoginPage Lnobj = new LoginPage();
		Lnobj.login(uname, pass);
	}
	
	@Test
	public void LoginTest2() {
		
		LoginPage Lnobj = new LoginPage();
		String uname = sheet.getRow(1).getCell(0).getStringCellValue();
		String pass = sheet.getRow(1).getCell(1).getStringCellValue();
		
		Lnobj.login(uname, pass);
	}
}
