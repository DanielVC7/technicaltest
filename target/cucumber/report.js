$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HappyPath.feature");
formatter.feature({
  "line": 1,
  "name": "Enter the application",
  "description": "As a user\nMake a purchase of a product",
  "id": "enter-the-application",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "We enter to application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user login",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 9,
  "name": "Log in to the application",
  "description": "",
  "id": "enter-the-application;log-in-to-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "We purchase the product",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "The purchase is successful",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});