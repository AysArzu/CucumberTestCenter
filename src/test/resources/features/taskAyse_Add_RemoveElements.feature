Feature: US001 Add Remove Elements

  Scenario: TC01 TestCenterTechPro sayfası Add Remove Testi
    Given kullanici_testCenterTechPro_sayfasina_gider
    And Add remove elemente tiklar
    And Add elemente tiklar
    Then Kullanici 2 sn bekler
    And Delete buttonuna basar
    Then Kullanici sayfayi kapatir

  Scenario: TC02 TestCenterTechPro sayfasi Autocomplete
    Given kullanici_testCenterTechPro_sayfasina_gider
    And Autocomplete linkine tiklar
    Then Textboxa ulkeden uc harf  girer "Tur" gibi
    Then Kullanici 2 sn bekler
    And "Turkey" e tiklar
    And Submit buttonuna basar
    Then Kullanici 2 sn bekler
    And Cikan yazinin varligini oldugunu dogrular
    Then Kullanici sayfayi kapatir

  Scenario: TC04 TestCenterTechPro sayfasi Challenging DOM
    Given kullanici_testCenterTechPro_sayfasina_gider
    Then Challenging Dom linkine tiklar
    And 5 . edit e basar
    And 5 . deleteye basar
