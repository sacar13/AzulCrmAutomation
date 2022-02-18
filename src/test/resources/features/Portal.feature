@portal
Feature: As a user, I should be able to interact with employees on the posts that I have access to.
  @wip
  Scenario: User should be able to make a comment, like, or unfollow on other employees' posts.
    Given the user logged in
    When the user to clicks the like button on any Employee post
    Then the user should be able see the like icon on the screen
    And  the user clicks the follow button on any Employee post
    Then the user should be able see the follow button changed as unfollow
    And the user to clicks the comment button on any Employee post
    And the user type "Hello" into the comment box
    And the user clicks the send button
    Then the user should be able to send the message
