package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.WaitUtils;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePage() {

        HomePage home =
                new HomePage(driver);

        // Wait for button
        WaitUtils.waitForVisible(
                driver,
                home.getMyDreamButton());

        // Verify displayed
        Assert.assertTrue(
                home.isMyDreamButtonDisplayed());

        // Click button
        home.clickMyDreamButton();

        // Verify tabs
        Assert.assertEquals(
                driver.getWindowHandles().size(),
                3);
    }
}