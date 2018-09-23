$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/ApiCalls.feature");
formatter.feature({
  "name": "CRUD operations to test RESTful Services",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.scenario({
  "name": "Get list of users - LIST USERS",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.step({
  "name": "I get the list of users",
  "keyword": "When "
});
formatter.match({
  "location": "ApiCallsSteps.iGetTheListOfUsers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the users are \u0027retrieved\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyTheUsersAreRetrieved(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that list of users contains first name",
  "keyword": "And "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyThatListOfUsersContainsFirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Get a single user - SINGLE USER",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.step({
  "name": "I get details of a single user",
  "keyword": "When "
});
formatter.match({
  "location": "ApiCallsSteps.iGetDetailsOfASingleUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the user is \u0027retrieved\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyTheUsersAreRetrieved(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that the user details are present",
  "keyword": "And "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyThatTheUserDetailsArePresent()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "No results for non-existing user - SINGLE USER NOT FOUND",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.step({
  "name": "I try to get details of non-existing user",
  "keyword": "When "
});
formatter.match({
  "location": "ApiCallsSteps.iTryToGetDetailsOfNonExistinguser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the user is \u0027not found\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyTheUsersAreRetrieved(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Get list of resources - LIST \u003cRESOURCES\u003e",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.step({
  "name": "I get the list of resources",
  "keyword": "When "
});
formatter.match({
  "location": "ApiCallsSteps.iGetTheListOfResources()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the resources are \u0027retrieved\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyTheUsersAreRetrieved(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that resources detail is returned",
  "keyword": "And "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyThatResourcesDetailIsReturned()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Get a single resource - SINGLE \u003cRESOURCE\u003e",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.step({
  "name": "I get details of a single resource",
  "keyword": "When "
});
formatter.match({
  "location": "ApiCallsSteps.iGetDetailsOfASingleResource()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the resource is \u0027retrieved\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyTheUsersAreRetrieved(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that the resource details is returned",
  "keyword": "And "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyThatTheResourceDetailsIsReturned()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "No results for non-existing resource - SINGLE \u003cRESOURCE\u003e NOT FOUND",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.step({
  "name": "I try to get details of non-existing resource",
  "keyword": "When "
});
formatter.match({
  "location": "ApiCallsSteps.iTryToGetDetailsOfNonExistingResource()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the resource is \u0027not found\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyTheUsersAreRetrieved(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Create a user - CREATE",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.step({
  "name": "I create a user",
  "rows": [
    {
      "cells": [
        "name",
        "job"
      ]
    },
    {
      "cells": [
        "morpheus",
        "leader"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "ApiCallsSteps.iCreateAUser(UsersDetailsModel\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the user is \u0027created\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyTheUsersAreRetrieved(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the response is correct",
  "keyword": "And "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyTheResponseIsCorrect()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Update a user - UPDATE",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I \u0027\u003cupdate\u003e\u0027 a user",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "name",
        "job"
      ]
    },
    {
      "cells": [
        "zion resident",
        "leader"
      ]
    }
  ]
});
formatter.step({
  "name": "I verify the user is \u0027updated\u0027",
  "keyword": "Then "
});
formatter.step({
  "name": "I verify the response is correct",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "update"
      ]
    },
    {
      "cells": [
        "PUT"
      ]
    },
    {
      "cells": [
        "PATCH"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Update a user - UPDATE",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.step({
  "name": "I \u0027PUT\u0027 a user",
  "rows": [
    {
      "cells": [
        "name",
        "job"
      ]
    },
    {
      "cells": [
        "zion resident",
        "leader"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "ApiCallsSteps.iUpdateAUser(String,UsersDetailsModel\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the user is \u0027updated\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyTheUsersAreRetrieved(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the response is correct",
  "keyword": "And "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyTheResponseIsCorrect()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Update a user - UPDATE",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.step({
  "name": "I \u0027PATCH\u0027 a user",
  "rows": [
    {
      "cells": [
        "name",
        "job"
      ]
    },
    {
      "cells": [
        "zion resident",
        "leader"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "ApiCallsSteps.iUpdateAUser(String,UsersDetailsModel\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the user is \u0027updated\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyTheUsersAreRetrieved(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the response is correct",
  "keyword": "And "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyTheResponseIsCorrect()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete a user - DELETE",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.step({
  "name": "I delete a user",
  "keyword": "When "
});
formatter.match({
  "location": "ApiCallsSteps.iDeleteAUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the user is \u0027deleted\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyTheUsersAreRetrieved(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Register a user - REGISTER SUCCESSFUL",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.step({
  "name": "I register a user",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "sydney@fife",
        "pistol"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "ApiCallsSteps.iRegisterAUser(UserRegisterModel\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the user is \u0027registered\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyTheUsersAreRetrieved(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify token is retrieved",
  "keyword": "And "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyTokenIsRetrieved()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Unsuccessful registration of user - REGISTER UNSUCCESSFUL",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.step({
  "name": "I try to register a user without password",
  "keyword": "When "
});
formatter.match({
  "location": "ApiCallsSteps.iTryToRegisterWithoutPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the user is \u0027not registered\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyTheUsersAreRetrieved(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login as a user - LOGIN SUCCESSFUL",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.step({
  "name": "I log in as a user",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "peter@klaven",
        "cityslicka"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "ApiCallsSteps.iLogInAsACustomer(UserRegisterModel\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the user is \u0027logged in\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyTheUsersAreRetrieved(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify token is retrieved",
  "keyword": "And "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyTokenIsRetrieved()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Unsuccessful login of user - LOGIN UNSUCCESSFUL",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.step({
  "name": "I try to login as a user without password",
  "keyword": "When "
});
formatter.match({
  "location": "ApiCallsSteps.iTryToLoginWithoutPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the user is \u0027not logged in\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyTheUsersAreRetrieved(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Delay get list of user for 3 seconds - DELAYED RESPONSE",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.step({
  "name": "I get list of users",
  "keyword": "When "
});
formatter.match({
  "location": "ApiCallsSteps.iGetListOfUsers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the users are \u0027retrieved\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyTheUsersAreRetrieved(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify response is delayed for 3 seconds",
  "keyword": "And "
});
formatter.match({
  "location": "ApiCallsSteps.iVerifyResponseIsDelayedFor3Seconds()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/PurchaseItem.feature");
formatter.feature({
  "name": "As a customer I want purchase 2 items",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@UI"
    }
  ]
});
formatter.scenario({
  "name": "Purchasing 2 items successfully",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UI"
    },
    {
      "name": "@Test-1"
    }
  ]
});
formatter.step({
  "name": "I am logged in customer on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "PurchaseItemsSteps.iAmLoggedInCustomerOnHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for an item \u0027Blouse\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "PurchaseItemsSteps.iSearchForAnItem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I quick view the item from the search results page",
  "keyword": "And "
});
formatter.match({
  "location": "PurchaseItemsSteps.iQuickViewItemFromTheSearchResultsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I change the size to \u0027M\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "PurchaseItemsSteps.iChangeTheSize(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the item to basket",
  "keyword": "And "
});
formatter.match({
  "location": "PurchaseItemsSteps.iAddTheItemToBasket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for another item \u0027Printed Dress\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "PurchaseItemsSteps.iSearchForAnItem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I quick view the item from the search results page",
  "keyword": "And "
});
formatter.match({
  "location": "PurchaseItemsSteps.iQuickViewItemFromTheSearchResultsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the item to basket",
  "keyword": "And "
});
formatter.match({
  "location": "PurchaseItemsSteps.iAddTheItemToBasket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I proceed to basket summary",
  "keyword": "And "
});
formatter.match({
  "location": "PurchaseItemsSteps.iProceedToBasketSummary()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that the items sizes are correct",
  "keyword": "Then "
});
formatter.match({
  "location": "PurchaseItemsSteps.iVerifyThatTheItemsSizesAreCorrect()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that the items prices are correct",
  "keyword": "And "
});
formatter.match({
  "location": "PurchaseItemsSteps.iVerifyThatTheItemsPricesAreCorrect()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am able to complete my order successfully",
  "keyword": "And "
});
formatter.match({
  "location": "PurchaseItemsSteps.iCanCompleteMyOrderSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Review previous orders and add a message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UI"
    },
    {
      "name": "@Test-2"
    },
    {
      "name": "@Test-3"
    }
  ]
});
formatter.step({
  "name": "I am logged in customer on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "PurchaseItemsSteps.iAmLoggedInCustomerOnHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to my account section",
  "keyword": "And "
});
formatter.match({
  "location": "PurchaseItemsSteps.iNavigateToMyAccountSection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click to view orders history",
  "keyword": "And "
});
formatter.match({
  "location": "PurchaseItemsSteps.iClickPreviousOders()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select an item from my previous order",
  "keyword": "And "
});
formatter.match({
  "location": "PurchaseItemsSteps.iSelectAnItemFromPreviousOrder()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add a comment",
  "keyword": "When "
});
formatter.match({
  "location": "PurchaseItemsSteps.iAddAComment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the comment appears under message",
  "keyword": "Then "
});
formatter.match({
  "location": "PurchaseItemsSteps.iVerifyTheCommentAppearsUnderMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify colour of item selected is \u0027red\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "PurchaseItemsSteps.iVerifyColourOfItemSelected(String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[blue]\u003e but was:\u003c[red]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.BJSS.framework.stepdefinitions.PurchaseItemsSteps.iVerifyColourOfItemSelected(PurchaseItemsSteps.java:166)\r\n\tat ✽.I verify colour of item selected is \u0027red\u0027(src/test/resources/features/PurchaseItem.feature:27)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});