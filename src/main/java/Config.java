import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Config {
    public static WebDriver driver;
    static String baseUrl = "https://www.google.com/";

    @BeforeClass
    public static void setup() throws Exception {

        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ViacheslavKuzenko\\chromedriver_win32\\chromedriver.exe"); // chromeDriver is storring locally
            driver = new ChromeDriver();  // driver initialization
            driver.get(baseUrl);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  // waits
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @AfterClass
    public static void  close() {
        driver.close();
    }
}





