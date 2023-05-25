package techproed.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import techproed.pages.LocateMali;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class DropDownStepDefinitions {
    LocateMali locate=new LocateMali();
    Select select;
    @Then("dropdown_linkine_tıklar")
    public void dropdown_linkine_tıklar() {
        locate.dropdownLink.click();
        ReusableMethods.bekle(1);
    }

    @Then("simpledropdown_op{int}_seçeneğini_tıklar")
    public void simpledropdown_op_secenegini_tıklar(int arg0) {
        select=new Select(locate.simpleDropdown);
        select.selectByIndex(2);

    }

    @Then("doğum_tarihini_{string}_{string}_{string}_olarak_girer")
    public void dogum_tarihini____olarak_girer(String yıl, String ay, String gun) {
        Actions action=new Actions(Driver.getDriver());
        locate.year.sendKeys(yıl,Keys.TAB,ay,Keys.TAB,gun);
        ReusableMethods.bekle(1);

    }

    @And("eyalet_seçimini_yapar")
    public void eyalet_secimini_yapar() {
        select=new Select(locate.state);
        select.selectByVisibleText("Florida");
        ReusableMethods.bekle(1);
    }

    @And("dil_seçimini_yapar")
    public void dil_secimini_yapar() {
        select=new Select(locate.language);
        select.selectByIndex(0);
        ReusableMethods.bekle(1);

    }

    @And("kabul_butonunu_tıklar")
    public void kabul_butonunu_tıklar() {
        locate.dropdownButton.click();
        ReusableMethods.bekle(1);

    }
}
