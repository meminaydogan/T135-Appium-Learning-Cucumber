@obilet
Feature: Kullanici verilen gorevler uzerinden Obilet sayfasindaki fonksiyonlari dogrular

  Scenario: Kullanici dil ve para birimi degistirme sayfasindaki islemleri dogrular

    * "url" sayfasina gidilir
    * dil olarak turkce secilir
    * para birimi olarak tl secilir
    * otobus bileti bul a tiklanir
    * gelen bilet fiyatlarinin tl oldugu dogrulanir