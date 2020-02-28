$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/signInSignOut.feature");
formatter.feature({
  "name": "Sign In and Sign Out",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User must be sign in with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LogInLogOut"
    }
  ]
});
formatter.step({
  "name": "User Launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.CreateAccountSteps.user_Launch_chrome_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on Sign In button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enter valid email \"rajkha375@gmail.com\" and password \"Works$123\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user click on remember me",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user click on SIGN IN button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on My Account and user can view SignOut button.",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user click on Sign Out.",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});