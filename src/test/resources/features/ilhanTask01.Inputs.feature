Feature: Inputs Button Test
  @inputs
  Scenario: TC01 inputs
    Given kullanici "url" adresine gider
    Then Kullanici sayfayi asagi kaydirir
    And Inputs linkini tiklar
    And 3 saniye bekler
    And Inputs Sayfasinin acildigini dogrular
    And 3 saniye bekler
    And Number alanina sayi girer
    And 3 saniye bekler
    And Kullanici sayfayi kapatir
