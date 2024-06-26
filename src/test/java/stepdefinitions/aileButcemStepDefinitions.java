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
    @Given("sol kisimdaki menuden {string} bolumune gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin(String menuSecim) throws InterruptedException {
        Thread.sleep(5000);
        page.hamburgerMenu.click();
        ReusableMethods.scrollWithUiScrollableAndClick(menuSecim);
    }
    @Given("hesabim sayfasindaki bilgileri degistirerek {string} {string} {string} {string} {string} degisikleri kaydedin ve değişikleri dogrulayin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin_ve_değişikleri_dogrulayin(String isim,String soyisim,String sehir,String yas,String meslek) {
        page.hesabimTextBoxSendKeysMethod(isim,soyisim,sehir,yas,meslek);
        page.kutuDogrulamaMethodu(isim,soyisim,sehir,yas,meslek);
    }

    @Given("uygulamayi kapatir")
    public void uygulamayi_kapatir() {
        Driver.quitAppiumDriver();
    }

    @Given("anasayfadaki arti butonuna tiklayin")
    public void anasayfadaki_arti_butonuna_tiklayin() throws InterruptedException {
        //541 1801
        Thread.sleep(4000);
        ReusableMethods.tiklamaMethodu(541,1728,500);
    }
    @Given("{string} bolumune tiklayin")
    public void gelir_ekle_bolumune_tiklayin(String eklemeSecenegi) {
        ReusableMethods.scrollWithUiScrollableAndClick(eklemeSecenegi);
    }

    @Given("basariyla eklendigini dogrulayin")
    public void basariyla_eklendigini_dogrulayin() {

    }


    @Given("Gelir ekleme sayfasinda aciklama kismina {string} gonderilir")
    public void gelir_ekleme_sayfasinda_aciklama_kismina_gonderilir(String aciklama) {
        page.aciklamaKutusu.sendKeys(aciklama);

    }
    @Given("Gelir ekleme sayfasinda Gelir tipi {string} secilir")
    public void gelir_ekleme_sayfasinda_gelir_tipi_secilir(String gelirTipi) throws InterruptedException {
        page.duzenliDuzensizKutusu.click();
        Thread.sleep(1000);
        ReusableMethods.scrollWithUiScrollableAndClick(gelirTipi);
    }
    @Given("Gelir ekleme sayfasinda Kategori bolumnden {string} secilir")
    public void gelir_ekleme_sayfasinda_kategori_bolumnden_secilir(String kategori) throws InterruptedException {
        page.kategoriKutusu.click();
        Thread.sleep(1000);
        ReusableMethods.scrollWithUiScrollableAndClick(kategori);

    }
    @Given("Gelir ekleme sayfasinda tarih secme bolumunden {int} {string} tarih secimi yapilir")
    public void gelir_ekleme_sayfasinda_tarih_secme_bolumunden_tarih_secimi_yapilir(Integer bitis, String gun) throws InterruptedException {
        page.tarihKutusu.click();
        Thread.sleep(1500);
        page.tarihSecmeMethodu(bitis);
        ReusableMethods.scrollWithUiScrollableAndClick(gun);
    }
    @Given("Gelir ekleme sayfasinda tutar {string} degeri girilir")
    public void gelir_ekleme_sayfasinda_tutar_degeri_girilir(String tutar) {
        page.tutarKutusu.sendKeys(tutar);
    }
    @Given("Gelir ekleme sayfasinda {string} butonuna tiklanir")
    public void gelir_ekleme_sayfasinda_butonuna_tiklanir(String kaydet) {
        ReusableMethods.scrollWithUiScrollableAndClick(kaydet);
    }



}