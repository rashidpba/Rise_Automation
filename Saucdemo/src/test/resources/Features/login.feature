#Author: Rashid kp
#email:rashidpba@gmail.com
#Keywords Summary :Assignment
#Open browser and and browse to : https://www.saucedemo.com/
#Perform a login flow to the application. The script should be flexible enough so that it can accept input parameters
#Select 3 items randomly
Feature: Validate user login and add to cart

  Scenario Outline: VALIDATE ADDTO CART Saucedemo
    Given open  https://www.saucedemo.com/
    When login to account <username> and <password>
    Then add to cart randomly

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
   
      | problem_user            | secret_sauce |
     | performance_glitch_user | secret_sauce |
