Feature: US01 Test Techproeducation sayfasi

  Background:Test Center Techpro sayfasi
    Given kullanici_testCenterTechPro_sayfasina_gider

  Scenario: TC01 Sortable Data Tables testi
    And Kullanici data table linkine tiklar
    And Sayfa basina gider
    But Kullanici 2 sn bekler
    And Conway ismini kontrol eder
    Then Conway ismini siler
    But Kullanici 2 sn bekler
    And Conway isminin silindigini kontrol eder
    But Kullanici 2 sn bekler
    And John ismini kontrol eder
    And Kullanici 2 sn bekler
    Then John ismini siler
    But Kullanici 2 sn bekler
    Then John isminin silindigini kontrol eder
    But Kullanici 2 sn bekler
    And Kullanici sayfayi kapatir


  Scenario: TC02 Registration Formu
    And Registration form linkine tiklar
    And Sayfa basina gider
    Then First nameden Gender e kadar doldurur
    But Kullanici 2 sn bekler
    And Genderi secer
    But Kullanici 2 sn bekler
    And Date of birthten asagisini doldurur
    But Kullanici 2 sn bekler
    Then Kullanici javayi secer
    But Kullanici 2 sn bekler
    And Kullanici submite basar
    And Kullanici sayfayi kapatir


  Scenario: TC03 WYSIWYG Editor Testi
    And  WYSIWYG Editor linkine tiklar
    And Sayfa basina gider
    And Paragrafa tiklar
    And Yazi boyutunu secer
    And Kullanici 2 sn bekler
    And Kullanici mesajini gonderir
    And Kullanici sayfayi kapatir
