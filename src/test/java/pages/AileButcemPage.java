package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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













    public void ilkEkranAyarlari() throws InterruptedException {
        Thread.sleep(3000);
        for (int i = 0; i <6 ; i++) {
            ReusableMethods.ekranKaydirmaMethodu(906,1001,750,139,1001);
        }
        ReusableMethods.scrollWithUiScrollableAndClick("Giriş Yap");
    }
}