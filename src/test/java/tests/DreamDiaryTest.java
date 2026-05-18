package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DreamDiaryPage;
import utils.ScreenshotUtils;

import java.util.List;

public class DreamDiaryTest extends BaseTest {

    @Test
    public void verifyDreamTable() {

        driver.get(
        "https://arjitnigam.github.io/myDreams/dreams-diary.html");

        ScreenshotUtils.takeScreenshot(
                driver,
                "DreamDiary_Page");

        DreamDiaryPage page =
                new DreamDiaryPage(driver);

        Assert.assertEquals(
                page.getDreamCount(),
                10);

        List<WebElement> rows =
                page.getAllRows();

        for (WebElement row : rows) {

            List<WebElement> columns =
                    row.findElements(By.tagName("td"));

            String dreamName =
                    columns.get(0).getText();

            String daysAgo =
                    columns.get(1).getText();

            String dreamType =
                    columns.get(2).getText();

            Assert.assertFalse(
                    dreamName.isEmpty());

            Assert.assertFalse(
                    daysAgo.isEmpty());

            Assert.assertTrue(
                    dreamType.equals("Good")
                    || dreamType.equals("Bad"));
        }
    }
}