@disappear
Feature: Context menu

  Scenario: TC01 Context menu testi
    Given kullanici "https://testcenter.techproeducation.com/" adresine gider
    And 3 saniye bekler
    Then Disappear menu linkini tiklar
    And 3 saniye bekler
    And kullanici home butonu ustune gider

    And 3 saniye bekler
    And kullanici home butonunu tiklar
    And 3 saniye bekler

    Then Disappear menu linkini tiklar
    And 3 saniye bekler
    And kullanici contact us butonu ustune gider
    And 3 saniye bekler
    And kullanici contact us butonunun kliklenebilir oldugunu dogrular
    And 3 saniye bekler
    And kullanici contact us butonunu tiklar
