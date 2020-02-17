import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest extends Config {

     @Test
    public void Login ()throws Exception {

      driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div")).click();
      driver.findElement(By.xpath("/html/body/div[2]/div/div/div/form/input[1]")).sendKeys(""); // need to put value  - xpath is example of selector
      driver.findElement(By.xpath("/html/body/div[2]/div/div/div/form/input[2]")).sendKeys(""); // need to put value  - xpath is example of selector
      driver.findElement(By.xpath("/html/body/div[2]/div/div/div/form/input[3]")).click();

    }
    @Test
    public void Verification (){
        driver.findElement(By.xpath("/html/body/div[3]/div[3]")).isDisplayed();
        System.out.println("User is logged in");
    }
}
