package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Page_Base {

    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;


    public Page_Base(WebDriver driver) {
        this.driver = driver;
    }

    protected void sendText(By ByElement, String Text)
    {
        driver.findElement(ByElement).sendKeys(Text);
    }
    protected void clearData(By byElement)
    {
        driver.findElement(byElement).clear();
    }

    protected void click(By byElement)
    {
        driver.findElement(byElement).click();
    }

    List listOfElements;
    protected List getListOfElements(By byElements)
    {
        return listOfElements=driver.findElements(byElements);
    }
    public void scrollToTheBottom() {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
