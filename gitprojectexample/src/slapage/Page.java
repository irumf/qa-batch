package slapage;
import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Page {
	WebDriver driver ;
	
	 public void launchBrowser() {
	    	System.setProperty("webdriver.gecko.driver","C:\\Users\\irumf\\Desktop\\web driver\\geckodriver.exe" );
			driver = new FirefoxDriver();
	    }
	 
	 public void openPage() {
	 	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//	 	   driver.manage().window().maximize();
	 	   driver.get("https://www.slalom.com/");
}
}
