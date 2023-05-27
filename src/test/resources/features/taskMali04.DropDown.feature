Feature: US004 Dropdown  Test
  Scenario: TC03 TestCenterTechPro sayfası Dropdown Testi
    Given kullanici_testCenterTechPro_sayfasina_gider
    Then dropdown_linkine_tıklar
    Then simpledropdown_op2_seçeneğini_tıklar
    Then doğum_tarihini_"1979"_"August"_"13"_olarak_girer
    And eyalet_seçimini_yapar
    And dil_seçimini_yapar
    And kabul_butonunu_tıklar
