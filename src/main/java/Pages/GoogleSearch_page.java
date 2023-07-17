package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class GoogleSearch_page extends Page_Base {
WebDriver driver;

    public GoogleSearch_page(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }
    By searchBar=By.id("APjFqb");

    By googleSearchBtn=By.cssSelector(".FPdoLc.lJ9FBc input.gNO89b");


    public void SearchFor(String Text)
    {
        sendText(searchBar,Text);
    }

    public SearchResult_Page clickOnGoogleSearchBtn()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(googleSearchBtn));
        click(googleSearchBtn);
        return new SearchResult_Page(driver);
    }

}
