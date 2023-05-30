package techproed.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import techproed.pages.LocateIlhan;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class IlhanInputsStepDefinition {

    LocateIlhan locateIlhan = new LocateIlhan();

    @Given("kullanici {string} adresine gider adresine gider")
    public void kullaniciStringAdresineGiderAdresineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));


    }
    @Then("Kullanici sayfayi asagi kaydirir")
    public void kullaniciSayfayiAsagiKaydirir() {
        ReusableMethods.scrollEnd();

    }

    @Then("Inputs linkini tiklar")
    public void ınputsLinkiniTiklar() {
        JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()", locateIlhan.inputsButton);


    }

    @And("Inputs Sayfasinin acildigini dogrular")
    public void inputsSayfasininAcildiginiDogrular() {
        Assert.assertTrue(locateIlhan.inputsPage.isDisplayed());

    }

    @And("Number alanina sayi girer")
    public void numberAlaninaSayiGirer() {
       locateIlhan.inputNumber.sendKeys("23444");


    }


}