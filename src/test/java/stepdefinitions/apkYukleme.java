package stepdefinitions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class apkYukleme {
    AndroidDriver<AndroidElement>androidDriver;
    @Given("kullanici gerekli kurulumlari yaparak {string} uygulamayi cihaza yukler")
    public void kullanici_gerekli_kurulumlari_yaparak_uygulamayi_cihaza_yukler(String apkDosyaYolu) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP, apkDosyaYolu);
        // Eger bir uygulama ilk defa yukleniyor ise bu capability kullanilir ve uygulama yuklenir.
        // Uygulama yuklu ise bunun yuklu olup olmadigini kontrol eder yukluyse uygulamayi acar degilse uygulamayi yukler ve acar
        /* Eger andorid bir cihaz da test yapacaksak bununla alakali bir automationName belirlememiz gerekiyor
         Belirledimiz automationName eger ki sectigimiz platformVersion 6.0 dan buyukse UiAutomator2
         Belirledimiz automationName eger ki sectigimiz platformVersion 6.0 dan kucukse UiAutomator

         */
        androidDriver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        androidDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }



}