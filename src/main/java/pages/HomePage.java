package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    // Fiding the "My Dreams" button using XPath
    By myDreamButton = By.xpath("//button[contains(text(),'My Dreams')]");

    public By getMyDreamButton() {

        return myDreamButton;
    }

    public boolean isMyDreamButtonDisplayed() {

        return driver.findElement(myDreamButton).isDisplayed();
    }

    public void clickMyDreamButton() {

        driver.findElement(myDreamButton).click();
    }
}