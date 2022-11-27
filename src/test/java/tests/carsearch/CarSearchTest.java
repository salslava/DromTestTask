package tests.carsearch;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.DROM_HOME_PAGE;

public class CarSearchTest extends BaseTest {

    @Test
    public void FindHarrier (){
        basePage.open(DROM_HOME_PAGE);
        carFilterPage
                .chooseCarFilters();
    }

}
