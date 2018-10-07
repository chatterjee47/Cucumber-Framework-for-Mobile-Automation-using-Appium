
Feature: Sign Up for Transaction Generator

@appium
Scenario Outline: Validate Transaction Generator
Given I open the application
Then  I tap on SignUp button
When  Enter the Username "<username>" and FamilyName "<familyName>"
Then  I tap CreateAccount button

Examples:

|username |familyName    |
|Amit     |Chatterjee    |
