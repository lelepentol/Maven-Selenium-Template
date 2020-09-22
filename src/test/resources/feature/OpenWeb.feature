Feature: Open Web

  Scenario Outline: Login to app
    Given I Want Access Guru99
    When I open the Web
    And input the email <email> and password <password>
    Then I go to homepage

    Examples: 
      | email 									| password  					 |
      |     "mngr285839" | "zymyqEr" 			 |