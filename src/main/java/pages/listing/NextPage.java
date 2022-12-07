package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NextPage extends CarListingPage  {
    public NextPage(WebDriver driver) {super(driver);}

    private final By nextPage = By.xpath("//a[@class='css-4gbnjj e24vrp30']");

    public NextPage nextPage(){
        driver.findElement(nextPage).click();
        return this;
    }
}