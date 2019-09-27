import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "/Users/inna/Downloads/chromedriver");
	  
	  WebDriver driver;
      

      driver = new ChromeDriver();
      
   
      driver.navigate().to("http://www.google.com/");  
      
     
      driver.quit();

  }
}
