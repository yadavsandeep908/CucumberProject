Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario: Login as a authenticated user
    Given Open Browser
    When User Provide url
    When User provide Userid as "yadavsandeep908"  and Password as "Sandeep@123"
    And User click login button
    Then User should get title "facebook-home page"