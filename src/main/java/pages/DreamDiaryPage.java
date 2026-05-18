package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DreamDiaryPage {

    WebDriver driver;

    public DreamDiaryPage(WebDriver driver) {

        this.driver = driver;
    }

    By rows =
            By.xpath("//table/tbody/tr");

    public List<WebElement> getAllRows() {

        return driver.findElements(rows);
    }

    public int getDreamCount() {

        return getAllRows().size();
    }
}