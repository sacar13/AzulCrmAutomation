$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Portal.feature");
formatter.feature({
  "name": "As a user, I should be able to interact with employees on the posts that I have access to.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@portal"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to make a comment, like, or unfollow on other employees\u0027 posts.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@portal"
    },
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.PortalStepDefs.the_user_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user to clicks the like button on any Employee post",
  "keyword": "When "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.PortalStepDefs.the_user_to_clicks_the_like_button_on_any_Employee_post()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able see the like icon on the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.PortalStepDefs.the_user_should_be_able_see_the_like_icon_on_the_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the follow button on any Employee post",
  "keyword": "And "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.PortalStepDefs.the_user_clicks_the_follow_button_on_any_Employee_post()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able see the follow button changed as unfollow",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.PortalStepDefs.the_user_should_be_able_see_the_follow_button_changed_as_unfollow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user to clicks the comment button on any Employee post",
  "keyword": "And "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.PortalStepDefs.the_user_to_clicks_the_comment_button_on_any_Employee_post()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user type \"Hello\" into the comment box",
  "keyword": "And "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.PortalStepDefs.the_user_type_into_the_comment_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the send button",
  "keyword": "And "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.PortalStepDefs.the_user_clicks_the_send_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to send the message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.PortalStepDefs.the_user_should_be_able_to_send_the_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});