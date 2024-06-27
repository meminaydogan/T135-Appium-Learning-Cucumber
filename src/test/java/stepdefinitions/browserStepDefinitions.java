package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.ObiletPage;
import utils.BrowserDriver;
import utils.ConfigReader;

public class browserStepDefinitions {
    ObiletPage page=new ObiletPage();
    @Given("kullanici {string} adresine cep telefonu uzerinden gider")
    public void kullanici_hepsiburada_adresine_cep_telefonu_uzerinden_gider(String url) {
        BrowserDriver.getBrowserDriver().get(url);
    }

    @Given("{string} sayfasina gidilir")
    public void sayfasina_gidilir(String url) {
        BrowserDriver.getBrowserDriver().get(ConfigReader.getProperty(url));
    }
    @Given("dil olarak turkce secilir")
    public void dil_olarak_turkce_secilir() {
        page.hamburgerMenu.click();
        page.englishButton.click();
        page.turkishLanguage.click();
    }
    @Given("para birimi olarak tl secilir")
    public void para_birimi_olarak_tl_secilir() {
        page.hamburgerMenu.click();
        page.currencySelect.click();
        page.turkisLira.click();
    }
    @Given("otobus bileti bul a tiklanir")
    public void otobus_bileti_bul_a_tiklanir() throws InterruptedException {
        page.searchButton.click();
        // Thread.sleep(5000);
    }
    @Given("gelen bilet fiyatlarinin tl oldugu dogrulanir")
    public void gelen_bilet_fiyatlarinin_tl_oldugu_dogrulanir() {
        String fiyatTuruText=page.fiyatTuru.getText();
        Assert.assertTrue(fiyatTuruText.equals(" TL"));
    }

}