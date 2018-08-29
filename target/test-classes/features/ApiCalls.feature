@API
Feature: CRUD operations to test RESTful Services

  Scenario: Get list of users - LIST USERS
    When I get the list of users
    Then I verify the users are 'retrieved'
    And I verify that list of users contains first name

  Scenario: Get a single user - SINGLE USER
    When I get details of a single user
    Then I verify the user is 'retrieved'
    And I verify that the user details are present

  Scenario: No results for non-existing user - SINGLE USER NOT FOUND
    When I try to get details of non-existing user
    Then I verify the user is 'not found'

  Scenario: Get list of resources - LIST <RESOURCES>
    When I get the list of resources
    Then I verify the resources are 'retrieved'
    And I verify that resources detail is returned

  Scenario: Get a single resource - SINGLE <RESOURCE>
    When I get details of a single resource
    Then I verify the resource is 'retrieved'
    And I verify that the resource details is returned

  Scenario: No results for non-existing resource - SINGLE <RESOURCE> NOT FOUND
    When I try to get details of non-existing resource
    Then I verify the resource is 'not found'

  Scenario: Create a user - CREATE
    When I create a user
      |   name   |   job  |
      | morpheus | leader |
    Then I verify the user is 'created'
    And I verify the response is correct

  Scenario Outline: Update a user - UPDATE
    When I '<update>' a user
      |   name        |   job  |
      | zion resident | leader |
    Then I verify the user is 'updated'
    And I verify the response is correct
    Examples:
      | update       |
      | PUT          |
      | PATCH        |

  Scenario: Delete a user - DELETE
    When I delete a user
    Then I verify the user is 'deleted'

  Scenario: Register a user - REGISTER SUCCESSFUL
    When I register a user
      |   email     |   password  |
      | sydney@fife |   pistol    |
    Then I verify the user is 'registered'
    And I verify token is retrieved

  Scenario: Unsuccessful registration of user - REGISTER UNSUCCESSFUL
    When I try to register a user without password
    Then I verify the user is 'not registered'

  Scenario: Login as a user - LOGIN SUCCESSFUL
    When I log in as a user
      |   email      |   password      |
      | peter@klaven |   cityslicka    |
    Then I verify the user is 'logged in'
    And I verify token is retrieved

  Scenario: Unsuccessful login of user - LOGIN UNSUCCESSFUL
    When I try to login as a user without password
    Then I verify the user is 'not logged in'

  Scenario: Delay get list of user for 3 seconds - DELAYED RESPONSE
    When I get list of users
    Then I verify the users are 'retrieved'
    And I verify response is delayed for 3 seconds