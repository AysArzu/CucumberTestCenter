package techproed.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import techproed.pages.LocatorAyse;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import static org.junit.Assert.assertFalse;
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

    @And("Multiple window linkine tiklar")
    public void multipleWindowLinkineTiklar() {
        click(locatorAyse.multipleWindow);
    }

    @Then("Click here linkine tiklar")
    public void clickHereLinkineTiklar() {
        locatorAyse.clickHere.click();
    }

    @And("yeni sayfaya gecer")
    public void yeniSayfayaGecer() {
        window(1);
    }

    @And("New window yazisini gordugunu onaylar")
    public void newWindowYazisiniGordugunuOnaylar() {
        assertTrue(locatorAyse.newWindow.isDisplayed());
    }

    @And("Sayfa basina gider")
    public void sayfaBasinaGider() {
        scrollHome();
    }

    @Then("New tab linkine tiklar")
    public void newTabLinkineTiklar() {
        click(locatorAyse.newTab);
    }

    @And("Check the new tab yazisini gorur")
    public void checkTheNewTabYazisiniGorur() {
        assertTrue(locatorAyse.checkTheNewTab.isDisplayed());
    }

    @And("Success! yazisini gorur")
    public void successYazisiniGorur() {
        assertTrue(locatorAyse.succesMessage.isDisplayed());
    }


    @Then("Radio Button linkine tiklar")
    public void radioButtonLinkineTiklar() {
        click(locatorAyse.radioButtons);
    }

    @And("Mavi rengini secer")
    public void maviRenginiSecer() {
        click(locatorAyse.blue);
    }

    @And("Basketbolu secer")
    public void basketboluSecer() {
        click(locatorAyse.basketball);
    }

    @And("Kullanici data table linkine tiklar")
    public void kullaniciDataTableLinkineTiklar() {
        click(locatorAyse.dataTable);
    }

    @And("Conway ismini kontrol eder")
    public void conwayIsminiKontrolEder() {
        assertTrue(locatorAyse.Conway.isDisplayed());
    }

    @Then("Conway ismini siler")
    public void conwayIsminiSiler() {
        locatorAyse.delete4.click();
    }

    @And("Conway isminin silindigini kontrol eder")
    public void conwayIsmininSilindiginiKontrolEder() {

        locatorAyse.table1.getText().contains("Conway");
        //assertFalse(locatorAyse.Conway.getAttribute("value").equals("Conway"));
    }

    @And("John ismini kontrol eder")
    public void johnIsminiKontrolEder() {
        assertTrue(locatorAyse.John.isDisplayed());
    }

    @Then("John ismini siler")
    public void johnIsminiSiler() {
        locatorAyse.delete1.click();
    }

    @Then("John isminin silindigini kontrol eder")
    public void johnIsmininSilindiginiKontrolEder() {
        assertFalse(locatorAyse.table2.getText().contains("John"));
    }

    @Then("First nameden Gender e kadar doldurur")
    public void firstNamedenGenderEKadarDoldurur() {
        locatorAyse.firstName.sendKeys(ConfigReader.getProperty("name"), Keys.TAB,
                ConfigReader.getProperty("surname"), Keys.TAB, ConfigReader.getProperty("username")
                , Keys.TAB, ConfigReader.getProperty("email"), Keys.TAB, ConfigReader.getProperty("pass"),
                Keys.TAB, ConfigReader.getProperty("phone"));

    }

    @And("Registration form linkine tiklar")
    public void registrationFormLinkineTiklar() {
        click(locatorAyse.registrationForm);
    }

    @And("Genderi secer")
    public void genderiSecer() {
        click(locatorAyse.female);
    }

    @And("Date of birthten asagisini doldurur")
    public void dateOfBirthtenAsagisiniDoldurur() {
        locatorAyse.dateOfBirth.sendKeys(ConfigReader.getProperty("birthDate"), Keys.TAB,
                ConfigReader.getProperty("office"), Keys.TAB, ConfigReader.getProperty("job"));
    }

    @Then("Kullanici javayi secer")
    public void kullaniciJavayiSecer() {
        click(locatorAyse.java);
    }

    @And("Kullanici submite basar")
    public void kullaniciSubmiteBasar() {
        locatorAyse.submitButton.click();
    }

    @And("WYSIWYG Editor linkine tiklar")
    public void wysiwygEditorLinkineTiklar() {
        click(locatorAyse.wysiwyg);
    }


    @And("Paragrafa tiklar")
    public void paragrafaTiklar() {
        click(locatorAyse.paragraf);
    }

    @And("Yazi boyutunu secer")
    public void yaziBoyutunuSecer() {
        click(locatorAyse.h2);
    }

    @And("Kullanici mesajini gonderir")
    public void kullaniciMesajiniGonderir() {
        String text = "Your content goes here.";
        Driver.getDriver().switchTo().frame(0);
        locatorAyse.textKutusu.sendKeys("Bugun hava cok guzel");
        for(int i=0;i<text.length();i++)
            locatorAyse.textKutusu.sendKeys(Keys.DELETE);

    }


}
