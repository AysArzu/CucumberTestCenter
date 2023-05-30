Feature: Multiple Buttons Button Test
  @MultipleB
  Scenario: TC01 Button 1 Testi
    Given kullanici "url" adresine gider
    Then Kullanici sayfayi asagi kaydirir
    And Multiple Buttons linkini tiklar
    And 3 saniye bekler
    And Multiple Buttons Sayfasinin acildigini dogrular
    And 5 saniye bekler
    And Birinci butona tiklar
    And 5 saniye bekler
    And Sonucun "Clicked on button one!" icerdigini dogrular!
    And 5 saniye bekler
    And Kullanici sayfayi kapatir

  Scenario: TC02 Button 2 Testi
    Given kullanici "url" adresine gider
    Then Kullanici sayfayi asagi kaydirir
    And Multiple Buttons linkini tiklar
    And 3 saniye bekler
    And Multiple Buttons Sayfasinin acildigini dogrular
    And 5 saniye bekler
    And Ikinci butona tiklar
    And 5 saniye bekler
    And Sonucun "Clicked on button two!" icerdigini dogrular!
    And 5 saniye bekler
    And Kullanici sayfayi kapatir

  Scenario: TC03 Button 3 Testi
    Given kullanici "url" adresine gider
    Then Kullanici sayfayi asagi kaydirir
    And Multiple Buttons linkini tiklar
    And 3 saniye bekler
    And Multiple Buttons Sayfasinin acildigini dogrular
    And 5 saniye bekler
    And Ucuncu butona tiklar
    And 5 saniye bekler
    And Sonucun "Clicked on button three!" icerdigini dogrular!
    And 5 saniye bekler
    And Kullanici sayfayi kapatir

  Scenario: TC04 Button 4 Testi
    Given kullanici "url" adresine gider
    Then Kullanici sayfayi asagi kaydirir
    And Multiple Buttons linkini tiklar
    And 3 saniye bekler
    And Multiple Buttons Sayfasinin acildigini dogrular
    And 5 saniye bekler
    And Dorduncu butona tiklar
    And 5 saniye bekler
    And Sonucun "Clicked on button four!" icerdigini dogrular!
    And 5 saniye bekler
    And Kullanici sayfayi kapatir

  Scenario: TC05 Button 5 Testi
    Given kullanici "url" adresine gider
    Then Kullanici sayfayi asagi kaydirir
    And Multiple Buttons linkini tiklar
    And 3 saniye bekler
    And Multiple Buttons Sayfasinin acildigini dogrular
    And 5 saniye bekler
    And Besinci butona tiklar
    And 5 saniye bekler
    And Sonucun "Clicked on button five!" icerdigini dogrular!
    And 5 saniye bekler
    And Kullanici sayfayi kapatir

  Scenario: TC06 Don't Click Button Testi
    Given kullanici "url" adresine gider
    Then Kullanici sayfayi asagi kaydirir
    And Multiple Buttons linkini tiklar
    And 3 saniye bekler
    And Multiple Buttons Sayfasinin acildigini dogrular
    And 5 saniye bekler
    And Don't click butonuna tiklar
    And 5 saniye bekler
    And Sonucun "Now it's gone!" icerdigini dogrular!
    And 5 saniye bekler
    And Kullanici sayfayi kapatir