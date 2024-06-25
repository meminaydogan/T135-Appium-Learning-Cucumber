package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Point;
import pages.AileButcemPage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class aileButcemStepDefinitions {
    AndroidDriver<AndroidElement> driver=Driver.getAndroidDriver();
    AileButcemPage page=new AileButcemPage();
    @Given("ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin() throws InterruptedException {
        page.ilkEkranAyarlari();
    }
    @Given("{string} ve {string} bilgilerini girerek kullanici bilgileriyle {string}")
    public void mail_ve_password_bilgilerini_girerek_kullanici_bilgileriyle_giris_yapin(String mail,String password,String girisYap) {
        page.mailKutusu.sendKeys(ConfigReader.getProperty(mail));
        page.sifreKutusu.sendKeys(ConfigReader.getProperty(password));
        ReusableMethods.scrollWithUiScrollableAndClick(girisYap);

    }
    @Given("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {
        Assert.assertTrue(page.girisYazisiDogrulama.isDisplayed());
    }
    @Given("sol kisimdaki menuden hesabim bolumune gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin() {

    }
    @Given("hesabim sayfasindaki bilgileri degistirerek degisikleri kaydedin ve değişikleri dogrulayin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin_ve_değişikleri_dogrulayin() {

    }

}