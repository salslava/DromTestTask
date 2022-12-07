package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;


public class CarListingPage extends BasePage {
    public CarListingPage(WebDriver driver) {super(driver);}
    private final By crossOut = By.xpath("//div[@class='css-r91w5p e3f4v4l2']");

    public CarListingPage checkSoldOut() {
        int soldOutCar = driver.findElements(crossOut).size();
        Assert.assertEquals(soldOutCar,0);

        return this;


    }

}
