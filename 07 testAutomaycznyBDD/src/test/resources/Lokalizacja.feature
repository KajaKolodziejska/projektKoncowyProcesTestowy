Feature: Store location

  As a customer of an online store,
  I want to be able to find a store closest to my location,
  so that my path to the store is as short as possible

  Scenario: Store location
    Given The user is on the shop page
    When The user clicks the Find My Store button
    And User enters City
    And The user clicks the Pokaz button
    Then The page displays the store closest to the given location
