package techproed.stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import techproed.pages.LocateIlhan;
import techproed.utilities.Driver;

public class IlhanJQueryMenusStepDefinition {

    LocateIlhan locateIlhan = new LocateIlhan();
    @And("JQuery UI Menus linkini tiklar")
    public void jqueryUIMenusLinkiniTiklar() {
        JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()", locateIlhan.jQueryUiMenusButton);


    }

    @And("JQuery UI Menus Sayfasinin acildigini dogrular")
    public void jqueryUIMenusSayfasininAcildiginiDogrular() {
        Assert.assertTrue(locateIlhan.jQueryUiMenusPage.isDisplayed());

    }

    @And("Enabled linkine tiklar")
    public void enabledLinkineTiklar() {
        JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()", locateIlhan.enabledButton);

    }

    @And("Downloads linkine tiklar")
    public void downloadsLinkineTiklar() {

        JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()", locateIlhan.downloadsButton);
    }

    @And("CVS linkine tiklar")
    public void cvsLinkineTiklar() {
        JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()", locateIlhan.cvsButton);
    }

    @And("number of items sayfasinin acildigini dogrular")
    public void numberOfItemsSayfasininAcildiginiDogrular() {
        Assert.assertTrue(locateIlhan.numberOfItems.isDisplayed());
    }
}
