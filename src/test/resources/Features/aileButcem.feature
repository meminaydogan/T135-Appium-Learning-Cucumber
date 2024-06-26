Feature: Kullanici aile Butcem uygulamasindaki gorevleri yerine getirir

  Background: Uygulamaya herkesce giris yapilabilmesi icin bu adimlardan gecmek zorunludur!!!!!!
    * ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin
    * "mail" ve "password" bilgilerini girerek kullanici bilgileriyle "Giriş Yap"
    * uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin


  Scenario Outline: Kullanici uygulamada kullanici bilgilerini degistirir ve degistirildigini dogrular

    * sol kisimdaki menuden "Hesabım" bolumune gidin
    * hesabim sayfasindaki bilgileri degistirerek "<isim>" "<soyisim>" "<sehir>" "<yas>" "<meslek>" degisikleri kaydedin ve değişikleri dogrulayin
    * uygulamayi kapatir
    Examples:
      | isim   |soyisim |sehir |yas |meslek |
      | isim1  |soyisim1|sehir1|yas1|meslek1|
      | isim2  |soyisim2|sehir2|yas2|meslek2|


  Scenario: Kullanici uygulamada ayarlar bolumune gider ve fonksiyonlari test eder

    * sol kisimdaki menuden "Ayarlar" bolumune gidin


  Scenario:  Kullanici bize ulasin kismindaki fonksiyonlari test eder

    * sol kisimdaki menuden "Bize Ulasin" bolumune gidin


  Scenario: Kullanici gelir ekleme bolumundeki gorevleri yerine getirir

    * anasayfadaki arti butonuna tiklayin
    * "Gelir Ekle" bolumune tiklayin
    *  Gelir ekleme sayfasinda aciklama kismina "Merhaba yine ben" gonderilir
    *  Gelir ekleme sayfasinda Gelir tipi "Düzensiz" secilir
    *  Gelir ekleme sayfasinda Kategori bolumnden "Serbest Gelir" secilir
    *  Gelir ekleme sayfasinda tarih secme bolumunden 4 "10" tarih secimi yapilir
    *  Gelir ekleme sayfasinda tutar "18500" degeri girilir
    *  Gelir ekleme sayfasinda "Kaydet" butonuna tiklanir
    * basariyla eklendigini dogrulayin


  Scenario: Kullanici gider ekler

    * anasayfadaki arti butonuna tiklayin
    * "Gider Ekle" bolumune tiklayin
    *  Gelir ekleme sayfasinda aciklama kismina "merhaba gider ekleme" gonderilir
    *  Gelir ekleme sayfasinda Gelir tipi "Düzensiz" secilir
    *  Gelir ekleme sayfasinda Kategori bolumnden "Market" secilir
    *  Gelir ekleme sayfasinda tarih secme bolumunden 1 "26" tarih secimi yapilir
    *  Gelir ekleme sayfasinda tutar "1500" degeri girilir
    *  Gelir ekleme sayfasinda "Kaydet" butonuna tiklanir
  @ab
  Scenario: Kullanici birikim ekleme kismindaki gorevleri yerine getirir

    *  anasayfadaki arti butonuna tiklayin
    * "Birikim Ekle" bolumune tiklayin
    *  Gelir ekleme sayfasinda aciklama kismina "merhaba birikim ekleme" gonderilir
    *  Gelir ekleme sayfasinda Gelir tipi "Düzensiz" secilir
    *  Gelir ekleme sayfasinda Kategori bolumnden "Hisse Senedi" secilir
    *  Gelir ekleme sayfasinda tarih secme bolumunden 3 "8" tarih secimi yapilir
    *  Gelir ekleme sayfasinda tutar "15000" degeri girilir
    *  Gelir ekleme sayfasinda "Kaydet" butonuna tiklanir