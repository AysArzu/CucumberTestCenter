package techproed.stepdefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import techproed.pages.LocateIlhan;
import techproed.utilities.Driver;

import static org.junit.Assert.assertTrue;

public class MultipleButtonsStepDefinition {
    LocateIlhan locateIlhan = new LocateIlhan();
    @And("Multiple Buttons linkini tiklar")
    public void multipleButtonsLinkiniTiklar() {
        JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()", locateIlhan.multipleButtons);


    }

    @And("Multiple Buttons Sayfasinin acildigini dogrular")
    public void multipleButtonsSayfasininAcildiginiDogrular() {
        assertTrue(locateIlhan.multipleButtonsPage.isDisplayed());


    }
    @And("Sonucun {string} icerdigini dogrular!")
    public void sonucunClickedOnButtonOneIcerdiginiDogrular(String metin) {

            WebElement result2= locateIlhan.result1;

            String resultMB = result2.getText();
            assertTrue(resultMB.contains(metin));



    }

    @And("Birinci butona tiklar")
    public void birinciButonaTiklar() {
        locateIlhan.button1.click();

    }

    @And("Ikinci butona tiklar")
    public void ikinciButonaTiklar() {
        locateIlhan.button2.click();
    }

    @And("Ucuncu butona tiklar")
    public void ucuncuButonaTiklar() {
        locateIlhan.button3.click();
    }

    @And("Dorduncu butona tiklar")
    public void dorduncuButonaTiklar() {
        locateIlhan.button4.click();
    }

    @And("Besinci butona tiklar")
    public void besinciButonaTiklar() {
        locateIlhan.button5.click();
    }


    @And("Don't click butonuna tiklar")
    public void donTClickButonunaTiklar() {
        locateIlhan.dontClickButton.click();
    }




//    @And("Sonucun {string} icerdigini dogrular!.")
//    public void sonucunIcerdiginiDogrular(String arg0) {
//        WebElement result2= locateIlhan.result1;
//
//        String resultMB = result2.getText();
//        assertTrue(resultMB.contains("Now it's gone!"));




    }



