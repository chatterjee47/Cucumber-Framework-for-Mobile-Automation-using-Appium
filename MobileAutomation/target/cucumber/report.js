$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Appium.feature");
formatter.feature({
  "line": 2,
  "name": "Sign Up for Transaction Generator",
  "description": "",
  "id": "sign-up-for-transaction-generator",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Validate Transaction Generator",
  "description": "",
  "id": "sign-up-for-transaction-generator;validate-transaction-generator",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@appium"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I open the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I tap on SignUp button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter the Username \"\u003cusername\u003e\" and FamilyName \"\u003cfamilyName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I tap CreateAccount button",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "sign-up-for-transaction-generator;validate-transaction-generator;",
  "rows": [
    {
      "cells": [
        "username",
        "familyName"
      ],
      "line": 13,
      "id": "sign-up-for-transaction-generator;validate-transaction-generator;;1"
    },
    {
      "cells": [
        "Amit",
        "Chatterjee"
      ],
      "line": 14,
      "id": "sign-up-for-transaction-generator;validate-transaction-generator;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 30755518711,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Validate Transaction Generator",
  "description": "",
  "id": "sign-up-for-transaction-generator;validate-transaction-generator;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@appium"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I open the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I tap on SignUp button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter the Username \"Amit\" and FamilyName \"Chatterjee\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I tap CreateAccount button",
  "keyword": "Then "
});
formatter.match({
  "location": "Registration.i_open_the_application()"
});
formatter.result({
  "duration": 5717699577,
  "status": "passed"
});
formatter.match({
  "location": "Registration.I_tap_on_SignUp_button()"
});
formatter.result({
  "duration": 6147898063,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Amit",
      "offset": 20
    },
    {
      "val": "Chatterjee",
      "offset": 42
    }
  ],
  "location": "Registration.enter_the_Username_and_FamilyName(String,String)"
});
formatter.result({
  "duration": 26119152107,
  "status": "passed"
});
formatter.match({
  "location": "Registration.I_tap_CreateAccount_button()"
});
formatter.result({
  "duration": 10580222442,
  "status": "passed"
});
formatter.after({
  "duration": 5078081855,
  "status": "passed"
});
});