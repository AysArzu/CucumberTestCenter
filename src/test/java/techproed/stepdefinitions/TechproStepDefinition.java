package techproed.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import techproed.pages.LocatorAyse;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static techproed.utilities.ReusableMethods.*;


public class TechproStepDefinition {
    LocatorAyse locatorAyse = new LocatorAyse();

    @And("Add remove elemente tiklar")
    public void addRemoveElementeTiklar() {
        locatorAyse.addRemove.click();
    }

    @And("Add elemente tiklar")
    public void addElementeTiklar() {
        locatorAyse.addElement.click();
    }

    @And("Delete buttonuna basar")
    public void deleteButtonunaBasar() {
        locatorAyse.delete.click();
    }

    @Then("Kullanici {int} sn bekler")
    public void kullaniciSnBekler(int saniye) {
        try {
            Thread.sleep(1000 * saniye);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("Autocomplete linkine tiklar")
    public void autocompleteLinkineTiklar() {

        locatorAyse.autoComplete.click();
    }


    @Then("Textboxa ulkeden uc harf  girer {string} gibi")
    public void textboxaUlkedenUcHarfGirerGibi(String harf) {
        locatorAyse.textBox.sendKeys(harf);
    }




    @And("Submit buttonuna basar")
    public void submitButtonunaBasar() {
        locatorAyse.submit.click();
    }

    @And("Cikan yazinin varligini oldugunu dogrular")
    public void cikanYazininVarliginiOldugunuDogrular() {
        assertTrue(locatorAyse.result.isDisplayed());
    }

    @And("{string} e tiklar")
    public void eTiklar(String ulke) {
        ReusableMethods.selectFromList(ulke);
    }//  driver.findElement(By.xpath("//div[@id='myCountryautocomplete-list']//div[.='Turkey']")).click();

    @Then("Challenging Dom linkine tiklar")
    public void challengingDomLinkineTiklar() {
        locatorAyse.challengingDom.click();
    }

    @And("{int} . edit e basar")
    public void editEBasar(int sayi) {
     clickEdit(sayi);
    }

    @And("{int} . deleteye basar")
    public void deleteyeBasar(int sayi) {
       deleteyeBasar(sayi);
    }
}
