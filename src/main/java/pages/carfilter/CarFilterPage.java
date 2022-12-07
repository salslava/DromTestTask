package pages.carfilter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class CarFilterPage extends BasePage {
    public CarFilterPage(WebDriver driver) { super(driver); }

    private final By brand = By.xpath("//input[@placeholder='Марка']");
    private final By toyota = By.xpath("//*[contains(text(),'Toyota (')]");
    private final By model = By.xpath("//input[@placeholder='Модель']");
    private final By anyModel = By.xpath("//div[text()='Любая модель']");
    private final By harrier = By.xpath("//div[@class='css-109956f e1x0dvi10']");

    private final By fuel = By.xpath("//button[text()='Топливо']");
    private final By hybrid = By.xpath("//div[text()='Гибрид']");
    private final By unsold = By.xpath("//label[text()='Непроданные']");
    private final By advSrch = By.xpath("//span[text()='Расширенный поиск']");
    private final By mileage = By.xpath("//input[@placeholder='от, км']");
    private final By yearFrom = By.xpath("//*[text()='Год от']");
    private final By y2007 = By.xpath("//div[@class='css-u25ii9 e154wmfa0'] //div[text()='2007']");
    private final By findBtn = By.xpath("//div[text()='Показать']");

    public CarFilterPage chooseCarFilters (){
        driver.findElement(brand).click();
        driver.findElement(toyota).click();
        //wait 1
        WebElement modelAppr = driver.findElement(model);
        waitVisibilityOfElement(modelAppr).click();
        //wait 2
        WebElement anyModelAppr = driver.findElement(anyModel);
        waitVisibilityOfElement(anyModelAppr);
        driver.findElement(model).sendKeys("harr");
        //wait 3
        WebElement findHarr = driver.findElement(harrier);
        waitVisibilityOfElement(findHarr);
        driver.findElement(harrier).click();

        driver.findElement(fuel).click();
        driver.findElement(hybrid).click();
        driver.findElement(unsold).click();
        driver.findElement(advSrch).click();
        driver.findElement(mileage).sendKeys("1");
        driver.findElement(yearFrom).click();
        driver.findElement(y2007).click();
        driver.findElement(findBtn).click();

        return this;


    }


}
