@AZUL-740
Feature: Default

	Background:
		#@AZUL-735
		Given the user on the login page
		When the user enters the username and password
		And the user clicks on login button
		Then the user should be able to see the title as "Portal"
		

	#*User Story:* As a user, I should be able to interact with employees on the posts that I have access to.
	#
	#*Acceptance Criteria:*
	# # {color:#FF0000}*User should be able to make a comment, like, or unfollow on other employees' posts.*{color} 
	# # User should be able to like or make comments on all other reviewers' comments. 
	# # User should be able to click on reviewers' names and visit their profiles.
	# # User should be able to add others' posts to favorite by clicking on the Star icon.
	@AZUL-736
	Scenario: Make a comment, like, or unfollow on other employees' posts. 
		When the user to clicks the like button on any Employee post
		Then the user should be able see the like icon on the screen
		And  the user clicks the follow button on any Employee post
		Then the user should be able see the follow button changed as unfollow
		And the user to clicks the comment button on any Employee post
		And the user type "Hello" into the comment box
		And the user clicks the send button
		Then the user should be able to send the message	

	#*User Story:* As a user, I should be able to interact with employees on the posts that I have access to.
	#
	#*Acceptance Criteria:*
	# # User should be able to make a comment, like, or unfollow on other employees' posts. 
	# # {color:#FF0000}*User should be able to like or make comments on all other reviewers' comments.*{color} 
	# # User should be able to click on reviewers' names and visit their profiles.
	# # User should be able to add others' posts to favorite by clicking on the Star icon.
	@AZUL-737
	Scenario:  Like or make comments on all other reviewers' comments. 
		When the user clicks the like button on the reviewers' comments.
		Then the user should be able see the comment-like icon on the screen
		And the user to clicks the reply button on any other reviewers' comments.
		And the user type "Hello" into the comment box
		And the user clicks the send button
		Then the user should be able to send the message	

	#*User Story:* As a user, I should be able to interact with employees on the posts that I have access to.
	#
	#*Acceptance Criteria:*
	# # User should be able to make a comment, like, or unfollow on other employees' posts. 
	# # User should be able to like or make comments on all other reviewers' comments. 
	# # {color:#FF0000}*User should be able to click on reviewers' names and visit their profiles.*{color}
	# # User should be able to add others' posts to favorite by clicking on the Star icon.
	@AZUL-738
	Scenario: Click on reviewers' names and visit their profiles.
		When the user clicks on reviewers' icon on any Employee post
		And the user clicks on the first reviewers' name
		Then the user should be able to visit the reviewers' profile	

	#*User Story:* As a user, I should be able to interact with employees on the posts that I have access to.
	#
	#*Acceptance Criteria:*
	# # User should be able to make a comment, like, or unfollow on other employees' posts. 
	# # User should be able to like or make comments on all other reviewers' comments. 
	# # User should be able to click on reviewers' names and visit their profiles.
	# # {color:#FF0000}*User should be able to add others' posts to favorite by clicking on the Star icon.*{color}
	@AZUL-739
	Scenario: Add others' posts to favorite by clicking on the Star icon.
		When the clicks the star icon on the first employees post
		Then the user should be able add the favorites