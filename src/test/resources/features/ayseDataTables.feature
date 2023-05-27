Feature: US01 Test Techproeducation sayfasi

  Scenario: TC01 Sortable Data Tables testi
    Given kullanici_testCenterTechPro_sayfasina_gider
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
    Then John isminin silinidigini kontrol eder
    But Kullanici 2 sn bekler
    And Kullanici sayfayi kapatir


  Scenario: TC02 Registration Formu
    Given kullanici_testCenterTechPro_sayfasina_gider
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


