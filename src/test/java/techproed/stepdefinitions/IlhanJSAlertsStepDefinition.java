package techproed.stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import techproed.pages.LocateIlhan;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.security.Key;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IlhanJSAlertsStepDefinition extends ReusableMethods{
    LocateIlhan locateIlhan = new LocateIlhan();
    @And("JavaScript Alerts linkini tiklar")
    public void javascriptAlertsLinkiniTiklar() {
        JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()", locateIlhan.javaScriptAlertsButton);



    }

    @And("JavaScript Alerts Sayfasinin acildigini dogrular")
    public void javascriptAlertsSayfasininAcildiginiDogrular() {

        assertTrue(locateIlhan.jsAlertsPage.isDisplayed());
    }

    @And("Click for JS Alert butonuna tiklar")
    public void clickForJSAlertButonunaTiklar() {
        locateIlhan.jsAlertButton.click();



    }
    @And("Tamam butonuna tıklar")
    public void tamamButonunaTiklar() {

        alertAccept();

    }


    @And("Click for JS Confirm butonuna tiklar")
    public void clickForJSConfirmButonunaTiklar() {
        JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()", locateIlhan.jsConfirmButton);



    }


    @And("Click for JS Prompt butonuna tiklar")
    public void clickForJSPromptButonunaTiklar() {
        locateIlhan.jsPromptButton.click();



    }



    @And("Iptal butonuna tiklar")
    public void iptalButonunaTiklar() {
        alertDismiss();
    }


    @And("Sonucun {string} icerdigini dogrular")
    public void sonucunIcerdiginiDogrular(String dogrulanacakMetin) {
        WebElement result2= locateIlhan.result2;

        String resultjsa2 = result2.getText();
        assertTrue(resultjsa2.contains(dogrulanacakMetin));





    }

    @And("Allert'e {string} yazar")
    public void allertEYazar(String kelime) {
        alertprompt(kelime);

    }
}
