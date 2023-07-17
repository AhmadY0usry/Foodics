package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchResult_Page extends Page_Base {
    WebDriver driver;

    public SearchResult_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    By SearchBtn = By.cssSelector(".zgAlFc .z1asCe svg");
    By searchBar = By.id("APjFqb");
    By numberSearchResult = By.cssSelector(".MBeuO.DKV0Md");
    By nextBtn = By.id("pnnext");
    By searchSuggesstions = By.cssSelector(".r2fjmd.AB4Wff");

    public void clickOnSearchBtn() {
        click(SearchBtn);
    }

    public void enterTextInSearchField(String Text) {
        sendText(searchBar, Text);
    }

    public void clearSearchBar() {
        clearData(searchBar);
    }

    public int getNumberOfResults() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(numberSearchResult));
        getListOfElements(numberSearchResult);
        return listOfElements.size();
    }

    public void clickOnNextPageButton() {
        click(nextBtn);
    }

    public boolean isSearchSuggestionsDifferent() {
        listOfElements=getListOfElements(this.searchSuggesstions);
        boolean differentSug = false;

        for (int i = 0; i <= listOfElements.size(); i++) {
            for (int j = i + 1; j < listOfElements.size(); j++) {
                if (listOfElements.get(i) == listOfElements.get(j)) {
                    differentSug = true;
                    break;
                }
            }
            if (differentSug) {
                break;
            }
        }
            return differentSug;
    }
}

