import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest extends Config {

     @Test
    public void Login ()throws Exception {

      driver.findElement(By.xpath("//*[@id=\"myAccountDropdown\"]/button/span")).click();
      driver.findElement(By.xpath("//*[@id=\"myaccount-dropdown\"]/div/div/div[2]/a[1]")).click();
      driver.findElement(By.xpath("//*[@id=\"EmailAddress\"]")).sendKeys("blackflame121@gmail.com"); // need to put value  - xpath is example of selector
      driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("testing123456"); // need to put value  - xpath is example of selector
      driver.findElement(By.xpath("//*[@id=\"signin\"]")).click();

    }
    @Test
    public void Verification (){
        driver.findElement(By.xpath("/html/body/div[3]/div[3]")).isDisplayed();
        System.out.println("User is logged in");
    }
}
