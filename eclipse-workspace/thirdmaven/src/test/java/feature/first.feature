

Feature: DemoQA Text box
  I want to use this template for my feature file

 
  Scenario: Validate entering data in text box
    And User nevigate to the application
    When User click on element tab
    And User click on text box menu
    And User verify data entered in full name
    Then User verify data entered in full name field


  Scenario Outline: validate entering data in text box.
    Given User lunch the chrome broswer
    And User navigate to the application
    When User click on element tab
    When I complete action
    And User click on text box menu
    And  User enter data<Fname>in full name field
    Then User verify data entered in full name field
    And check more outcomes

    Examples:
   | Bikash  |
   | sarmila |
   | radhika |
   | sandeep |