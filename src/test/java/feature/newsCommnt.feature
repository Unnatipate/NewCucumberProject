Feature: NewsComment
  As a User, I want to Add News Comment Successfully in website DemoNopeCommerce
  So that, I can use all User features
  @test
  Scenario: user should be able to post a comment
    When user click on details button
    And user fills comments form
    And clicks on new comment button
    Then the user should see the comment has been posted successfully


