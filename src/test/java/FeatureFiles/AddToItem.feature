Feature: Urun Sepete Ekleme

  Scenario: Bir urunu sepete ekleme
    Given Navigate to Arzum
    When Click on Login Button
    Then Enter email and password and click login button
    And Click on Search Button and searching Airfryer
    And Click on first Item
    And Click on Add to Cart
    And Click on Go to Cart
    And Verify to Price
