package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class AileButcemPage {

    public AileButcemPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)),this);
    }

    @FindBy(xpath = "")
    public MobileElement locate;

    @FindBy(xpath ="(//*[@class='android.widget.EditText'])[1]" )
    public MobileElement mailKutusu;

    @FindBy(xpath ="(//*[@class='android.widget.EditText'])[2]" )
    public MobileElement sifreKutusu;

    @FindBy(xpath = "//*[@text='Giriş Yap']")
    public MobileElement girisYapButonu;

    @FindBy(xpath = "//*[@text='Başarıyla giriş yapıldı.']")
    public MobileElement girisYazisiDogrulama;

    @FindBy(xpath = "(//*[@class='android.widget.ImageView'])[1]")
    public MobileElement hamburgerMenu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement isimKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement soyIsimKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public MobileElement yasadigimSehirKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public MobileElement yasKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[5]")
    public MobileElement meslekKutusu;

    @FindBy(xpath = "//*[@text='Kaydet']")
    public MobileElement kaydetButton;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement aciklamaKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement tutarKutusu;

    @FindBy(xpath = "(//*[@class='android.view.ViewGroup'])[10]")
    public MobileElement duzenliDuzensizKutusu;

    @FindBy(xpath = "(//*[@class='android.view.ViewGroup'])[11]")
    public MobileElement kategoriKutusu;

    @FindBy(xpath = "(//*[@class='android.view.ViewGroup'])[12]")
    public MobileElement tarihKutusu;



















    private void kutuTemizlemeMethodu(){
        isimKutusu.clear();
        soyIsimKutusu.clear();
        yasadigimSehirKutusu.clear();
        yasKutusu.clear();
        meslekKutusu.clear();

    }

    public void hesabimTextBoxSendKeysMethod(String isim,String soyisim,String sehir,String yas,String meslek){
        kutuTemizlemeMethodu();
        isimKutusu.sendKeys(ConfigReader.getProperty(isim));
        soyIsimKutusu.sendKeys(ConfigReader.getProperty(soyisim));
        yasadigimSehirKutusu.sendKeys(ConfigReader.getProperty(sehir));
        yasKutusu.sendKeys(ConfigReader.getProperty(yas));
        meslekKutusu.sendKeys(ConfigReader.getProperty(meslek));
        kaydetButton.click();
    }

    public void kutuDogrulamaMethodu(String isim,String soyisim,String sehir,String yas,String meslek){
        Assert.assertTrue(isimKutusu.getText().equals(ConfigReader.getProperty(isim)));
        Assert.assertTrue(soyIsimKutusu.getText().equals(ConfigReader.getProperty(soyisim)));
        Assert.assertTrue(yasadigimSehirKutusu.getText().equals(ConfigReader.getProperty(sehir)));
        Assert.assertTrue(yasKutusu.getText().equals(ConfigReader.getProperty(yas)));
        Assert.assertTrue(meslekKutusu.getText().equals(ConfigReader.getProperty(meslek)));
    }





    public void ilkEkranAyarlari() throws InterruptedException {
        Thread.sleep(3000);
        for (int i = 0; i <6 ; i++) {
            ReusableMethods.ekranKaydirmaMethodu(906,1001,750,139,1001);
        }
        ReusableMethods.scrollWithUiScrollableAndClick("Giriş Yap");
    }

    public void tarihSecmeMethodu(int forBitis){
        for (int i = 0; i < forBitis; i++) {
            ReusableMethods.ekranKaydirmaMethodu(818,1052,750,263,1052);
            //  818,1052.263,1052
        }
    }
}