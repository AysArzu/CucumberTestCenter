Feature: JQuery UI Menus Button Test
  @JQUIMenus
  Scenario: TC01 JQuery UI Menus Testi
    Given kullanici "url" adresine gider
    Then Kullanici sayfayi asagi kaydirir
    And JQuery UI Menus linkini tiklar
    And 3 saniye bekler
    And JQuery UI Menus Sayfasinin acildigini dogrular
    And 3 saniye bekler
    And Enabled linkine tiklar
    And 3 saniye bekler
    And Downloads linkine tiklar
    And 3 saniye bekler
    And CVS linkine tiklar
    And 3 saniye bekler
    And number of items sayfasinin acildigini dogrular
    And 3 saniye bekler
    And Kullanici sayfayi kapatir


