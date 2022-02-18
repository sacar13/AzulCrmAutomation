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
  "status": "skipped"
});
formatter.step({
  "name": "the user logged in",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user to clicks the like button on any Employee post",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user should be able see the like icon on the screen",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user clicks the follow button on any Employee post",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user should be able see the follow button changed as unfollow",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user to clicks the comment button on any Employee post",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user type \"Hello\" into the comment box",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user clicks the send button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user should be able to send the message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});