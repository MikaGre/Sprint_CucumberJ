Feature: Account

  #Url: https://clubs3qa1.scholastic.com/home
  #Zip Code: 10001
  #School Name: Tt Of Nyc

  @teacher
  Scenario: User can create a new Teacher Account
    Given I am on the Homepage
    When I tap on 'Create an Account'
    And I click on Teacher radio button if not selected
    And I fill out all required fields
    And I submit the form
    Then I verify successful creation of a user profile

    @name
    Scenario: Verify user is successfully able to update name in My Accounts
      Given I am on the Homepage
      When I login
      And I go to My Accounts page
      And I update the name: 'M' 'Tester'
      Then I verify name is updated successfully in My Accounts
      And I verify name is updated successfully in Page Header