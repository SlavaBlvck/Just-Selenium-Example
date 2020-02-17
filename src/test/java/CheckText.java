import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class CheckText extends Config{


    @Test
    public  void CheckText () {
        String text;
        driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).click();
        assertEquals("Google",driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/h1")).getText());

    }
}
