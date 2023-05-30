Feature: JavaScript Alerts Button Test
  @JSAlerts
  Scenario: TC01 Click for JS Alert Testi
    Given kullanici "url" adresine gider
    Then Kullanici sayfayi asagi kaydirir
    And JavaScript Alerts linkini tiklar
    And 3 saniye bekler
    And JavaScript Alerts Sayfasinin acildigini dogrular
    And 5 saniye bekler
    And Click for JS Alert butonuna tiklar
    And 5 saniye bekler
    And Tamam butonuna tıklar
    And 3 saniye bekler
    And Sonucun "You successfully clicked an alert" icerdigini dogrular
    And 3 saniye bekler
    And Kullanici sayfayi kapatir

  Scenario: TC01 Click for JS Alert Testi
    Given kullanici "url" adresine gider
    Then Kullanici sayfayi asagi kaydirir
    And JavaScript Alerts linkini tiklar
    And 3 saniye bekler
    And JavaScript Alerts Sayfasinin acildigini dogrular
    And 5 saniye bekler
    And Click for JS Confirm butonuna tiklar
    And 3 saniye bekler
    And Iptal butonuna tiklar
    And 3 saniye bekler
    And Sonucun "You clicked: Cancel" icerdigini dogrular
    And 3 saniye bekler
    And Kullanici sayfayi kapatir

  Scenario: TC01 Click for JS Alert Testi
    Given kullanici "url" adresine gider
    Then Kullanici sayfayi asagi kaydirir
    And JavaScript Alerts linkini tiklar
    And 3 saniye bekler
    And JavaScript Alerts Sayfasinin acildigini dogrular
    And 3 saniye bekler
    And Click for JS Prompt butonuna tiklar
    And 3 saniye bekler
    And Allert'e "Techproeducation" yazar
    And 3 saniye bekler
    And Tamam butonuna tıklar
    And 3 saniye bekler
    And Sonucun "You entered:" icerdigini dogrular
    And 3 saniye bekler
    And Kullanici sayfayi kapatir



