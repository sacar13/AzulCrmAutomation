$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "the user should be able to login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.LoginStepDefs.the_user_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters the username and password",
  "keyword": "When "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.LoginStepDefs.the_user_enters_the_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.LoginStepDefs.the_user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to see the title as \"Portal\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.LoginStepDefs.the_user_should_be_able_to_see_the_title_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});