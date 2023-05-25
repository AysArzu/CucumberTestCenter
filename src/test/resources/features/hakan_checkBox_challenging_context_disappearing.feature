
Feature: checkbox ve radio button
  @checkbox
  Scenario: TC01 checkbox
    Given kullanici "https://testcenter.techproeducation.com/" adresine gider
    Then Checkboxes linkini tiklar
    And 3 saniye bekler
    And Checkbox1 secili degilse sec
    And 3 saniye bekler
    And Checkbox2 secili degilse sec
    And 3 saniye bekler