package com.qa.alliance.base;
	

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
    import com.qa.alliance.TestUtil.TestUtil;



	public class BaseClass {
		
		public static WebDriver driver;
		public static Properties prop;		
	
		
		public BaseClass(){
			
			try {
				prop = new Properties();
				FileInputStream ip = new FileInputStream ("C:/Users/pmthilakarathne/Downloads/AllianceProject/src/main/java/com/qa/alliance/config/config.properties");
				prop.load(ip);						
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public static void initilazation(){
			
			String browsername = prop.getProperty("browser");
			if(browsername.equals("chrome")){
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\pmthilakarathne\\Downloads\\chromedriver_win32\\chromedriver.exe");
			   driver = new ChromeDriver();
			}  
			
			if(browsername.equals("FF")){
				  // System.setProperty("webdriver.gecko.driver", "C:\GeckoDriver\geckodriver.exe");	
				  // driver = new FirefoxDriver();
				   
			} 				
			
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();			
			driver.get(prop.getProperty("url"));
			
			
		}
		
		

	}



