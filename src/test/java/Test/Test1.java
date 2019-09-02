package Test;

	

	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.qa.alliance.base.BaseClass;
	import com.qa.alliance.pages.HomePage;
	import com.qa.alliance.pages.LoginPage;


	public class Test1 extends BaseClass {
		
		LoginPage loginPage;
		HomePage HomePage;
		
		public Test1(){
			super();
		}
		
		@BeforeMethod
		public void setUp(){
			initilazation();
			loginPage = new LoginPage();	
		}
		
		@Test (priority=1)
		public void loginTest(){
			HomePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		}

	}



