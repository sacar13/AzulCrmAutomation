@portal
Feature: As a user, I should be able to interact with employees on the posts that I have access to.
 Background:
   Given the user logged in

  @AZUL-736
  Scenario: User should be able to make a comment, like, or unfollow on other employees' posts.
    When the user to clicks the like button on any Employee post
    Then the user should be able see the like icon on the screen
    And  the user clicks the follow button on any Employee post
    Then the user should be able see the follow button changed as unfollow
    And the user to clicks the comment button on any Employee post
    And the user type "Hello" into the comment box
    And the user clicks the send button
    Then the user should be able to send the message

  @AZUL-737
  Scenario: User should be able to like or make comments on all other reviewers' comments.
    When the user clicks the like button on the reviewers' comments.
    Then the user should be able see the comment-like icon on the screen
    And the user to clicks the reply button on any other reviewers' comments.
    And the user type "Hello" into the comment box
    And the user clicks the send button
    Then the user should be able to send the message

  @AZUL-738
  Scenario: User should be able to click on reviewers' names and visit their profiles.
    When the user clicks on reviewers' icon on any Employee post
    And the user clicks on the first reviewers' name
    Then the user should be able to visit the reviewers' profile


  @AZUL-739
  Scenario: User should be able to add others' posts to favorite by clicking on the Star icon.
    When the clicks the star icon on the first employees post
    Then the user should be able add the favorites


