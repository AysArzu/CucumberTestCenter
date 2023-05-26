@challenging
Feature: challenging dom

  Scenario: TC01 challenging dom testi
    Given kullanici "https://testcenter.techproeducation.com/" adresine gider
    And 3 saniye bekler
    Then challenging dom linkini tiklar
    And 3 saniye bekler
    And kullanici qux linkini tiklar
    And 3 saniye bekler
    And kullanici foo linkini tiklar
    And 3 saniye bekler
    And kullanici baz linkini tiklar
    And 3 saniye bekler
    And kullanici "Definiebas8" yazisinin "Definiebas8" icerdigini dogrular
    And 3 saniye bekler
    And kullanici yukaridan ucuncu edit linkini tiklanabilir oldugunu dogrular
    And 3 saniye bekler
    And kullanici en alttaki delete linkini tiklar