package Test_Search;

import Pages.SearchResult_Page;
import Test_Base.Test_Base;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Test_Search extends Test_Base {
    SearchResult_Page searchResultPage;
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void Testing_SearchFunctionality() {
        googleSearchPage.SearchFor("panda");
        searchResultPage = googleSearchPage.clickOnGoogleSearchBtn();
        searchResultPage.clearSearchBar();
        searchResultPage.enterTextInSearchField("Lion");
        searchResultPage.clickOnSearchBtn();
        int ExpectedNumberOfResultInUI=10;
        int Actual_NumberOfResultInUI=searchResultPage.getNumberOfResults();
        softAssert.assertEquals(Actual_NumberOfResultInUI,ExpectedNumberOfResultInUI, "The Number of expected results is not as the actual");
        searchResultPage.scrollToTheBottom();
        searchResultPage.clickOnNextPageButton();
        int SearchResultInPage2=searchResultPage.getNumberOfResults();
        searchResultPage.clickOnNextPageButton();
        int SearchResultInPage3=searchResultPage.getNumberOfResults();
        softAssert.assertEquals(SearchResultInPage2,SearchResultInPage3, "The Number of expected results in page 2 is equal to results in page 3");
        softAssert.assertFalse(searchResultPage.isSearchSuggestionsDifferent(), "Not all search suggestions that displayed at the end of the page are different");

    }
}
