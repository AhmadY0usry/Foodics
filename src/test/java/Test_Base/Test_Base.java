package Test_Base;

import Pages.GoogleSearch_page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Test_Base {
    WebDriver driver;
    protected GoogleSearch_page googleSearchPage;
    @BeforeClass
    public void setup()
    {
        driver = new EdgeDriver();
        driver.get("https://www.google.com/");
        googleSearchPage= new GoogleSearch_page(driver);
        driver.manage().window().maximize();
    }
    @AfterClass
    public void tearDown()
    {
       driver.quit();
    }

}
