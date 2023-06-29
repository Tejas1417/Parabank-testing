package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public static WebDriver driver;
    public Properties prop;

	public void initializeDriver() throws IOException {
		
	//This will access the properties file
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		
	//read file--
	prop=new Properties();
		
	prop.load(fis);
		
	String browserName=	prop.getProperty("browser");
		
	if(browserName.equalsIgnoreCase("chrome")){
	 driver=new ChromeDriver();
			
    }else if(browserName.equalsIgnoreCase("Firefox")) {
    driver=new FirefoxDriver();	
			
    }else if(browserName.equalsIgnoreCase("Edge")) {
	driver=new EdgeDriver();
	}else {
			System.out.println("please choose valid browser to run your script");
		}
	
	}
	@BeforeMethod
	public void LaunchBrowser() throws IOException {
		initializeDriver();	
		
		String url=prop.getProperty("url");
    	driver.get(url);
    	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	@AfterSuite
	public void quitBrowser() throws IOException {
	driver.quit();
	}
	

}
	 
