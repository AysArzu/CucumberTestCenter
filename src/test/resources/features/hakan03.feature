@context
Feature: Context menu

  Scenario: TC01 Context menu testi
    Given kullanici "https://testcenter.techproeducation.com/" adresine gider
    And 3 saniye bekler
    Then Context menu linkini tiklar
    And 3 saniye bekler
    And kullanici karenin icine sag klik yapar
    And 3 saniye bekler
    And kullanici cikan alerti kapatir
    And 3 saniye bekler
    And kullanici sayfada refresh yapar
    And 3 saniye bekler