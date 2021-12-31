Feature: Facebook

  As a user, I should be able to be navigate to nopcommerce Facebook page
  @test
  Scenario Outline: User should be able to navigate to the social media page successfully
    Given User is on homepage
    When  user clicks on social links "<social_link>"
    Then user should see relevant social media page url "<url>"
    Examples:
      | social_link | url                                      |
      | Facebook    | https://www.facebook.com/nopCommerce     |