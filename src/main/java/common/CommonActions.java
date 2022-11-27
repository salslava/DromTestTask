package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

import static common.Config.PLATFORN_AND_BROWSER;
import static constants.Constant.TimeoutVariable.IMPLICIT_WAIT;

public class CommonActions {
    public static WebDriver createDriver (){
        WebDriver driver = null;

        switch (PLATFORN_AND_BROWSER){
            case "win_chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

                break;
            default:
                Assert.fail("Incorrect platform or browser name; " + PLATFORN_AND_BROWSER);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        return driver;
    }
}
