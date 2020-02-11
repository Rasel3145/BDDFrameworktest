$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Feature/homePage.feature");
formatter.feature({
  "name": "Google HomePage",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Google",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I am in google home",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinations.CucumberStepsDefination.i_am_in_google_home()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "name": "I am click Search and Write \"Sleep\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinations.CucumberStepsDefination.i_am_click_Search_and_Write(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Send value",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am searching a \u003cStart\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "I search \u003cvalue\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Start",
        "",
        "value"
      ]
    },
    {
      "cells": [
        "book",
        "",
        "pen"
      ]
    }
  ]
});
formatter.background({
  "name": "Google",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I am in google home",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinations.CucumberStepsDefination.i_am_in_google_home()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Send value",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am searching a book",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I search pen",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "Google",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I am in google home",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinations.CucumberStepsDefination.i_am_in_google_home()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "searching",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "name": "i am searching:",
  "rows": [
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinations.CucumberStepsDefination.i_am_searching(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});