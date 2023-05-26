package techproed.stepdefinitions;

import io.cucumber.java.en.Then;
import techproed.pages.LocateHakan;
import techproed.utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HakanChallenging {
    LocateHakan locateHakan = new LocateHakan();

    @Then("challenging dom linkini tiklar")
    public void challenging_dom_linkini_tiklar() {
        locateHakan.challenge.click();

    }

    @Then("kullanici qux linkini tiklar")
    public void kullanici_qux_linkini_tiklar() {
        ReusableMethods.visibleWait(locateHakan.qux, 15);

    }

    @Then("kullanici foo linkini tiklar")
    public void kullanici_foo_linkini_tiklar() {
        locateHakan.foo.click();

    }

    @Then("kullanici baz linkini tiklar")
    public void kullanici_baz_linkini_tiklar() {
        ReusableMethods.visibleWait(locateHakan.baz, 15);

    }

    @Then("kullanici {string} yazisinin {string} icerdigini dogrular")
    public void kullanici_yazisinin_icerdigini_dogrular(String string, String string2) {
        assertEquals(locateHakan.define.getText(), "Definiebas8");

    }

    @Then("kullanici yukaridan ucuncu edit linkini tiklanabilir oldugunu dogrular")
    public void kullanici_yukaridan_ucuncu_edit_linkini_tiklanabilir_oldugunu_dogrular() {
        assertTrue(locateHakan.edit.isEnabled());

    }

    @Then("kullanici en alttaki delete linkini tiklar")
    public void kullanici_en_alttaki_delete_linkini_tiklar() {
        locateHakan.delete.click();

    }


}
