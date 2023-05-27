Feature: US29 testcenter techproed Multiple window testi

  Scenario: TC01  Multiple Window
    Given kullanici_testCenterTechPro_sayfasina_gider
    And Multiple window linkine tiklar
    And Sayfa basina gider
    Then Click here linkine tiklar
    But Kullanici 2 sn bekler
    And yeni sayfaya gecer
    But Kullanici 2 sn bekler
    And New window yazisini gordugunu onaylar
    And Kullanici sayfayi kapatir

  Scenario: TC02 New Tab testi
    Given kullanici_testCenterTechPro_sayfasina_gider
    Then New tab linkine tiklar
    And Sayfa basina gider
    And Kullanici 5 sn bekler
    And Check the new tab yazisini gorur
    And yeni sayfaya gecer
    And Success! yazisini gorur
    Then Kullanici sayfayi kapatir

  Scenario: TC03 Radio Button testi
    Given kullanici_testCenterTechPro_sayfasina_gider
    Then Radio Button linkine tiklar
    Then Sayfa basina gider
    And Kullanici 2 sn bekler
    And Mavi rengini secer
    And Kullanici 2 sn bekler
    And Basketbolu secer
    And Kullanici 2 sn bekler
    Then Kullanici sayfayi kapatir


