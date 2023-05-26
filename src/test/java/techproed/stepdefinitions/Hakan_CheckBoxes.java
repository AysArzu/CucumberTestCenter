package techproed.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import techproed.pages.LocateHakan;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Hakan_CheckBoxes {
    LocateHakan locate = new LocateHakan();
    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Then("Checkboxes linkini tiklar")
    public void checkboxes_linkini_tiklar() {
        locate.checkboxes.click();
    }
    @Then("{int} saniye bekler")
    public void saniye_bekler(Integer int1) {
        ReusableMethods.bekle(int1);
    }
    @Then("Checkbox1 secili degilse sec")
    public void checkbox1_secili_degilse_sec() {
        if (!locate.checkBox1.isSelected()) {
            locate.checkBox1.click();
        }

    }
    @Then("Checkbox2 secili degilse sec")
    public void checkbox2_secili_degilse_sec() {
        if (!locate.checkBox2.isSelected()) {
            locate.checkBox2.click();
        }
    }
}
