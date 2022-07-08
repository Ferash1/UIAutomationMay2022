#@Femi01
Feature: Newtours
  As a user
  I want to be able to register an account
  So that i can have an account
  Background:
    Given I am on the Newtours homepage
    When I click on Register link
#@Femi02
  Scenario: Register an account with only mandatory fields
    And     I enter Username as "Alex", password and confirmation password as "123456"
    And     I click on Submit button
    Then    The confirmation page is displayed with the username as "Alex"

@Femi03Encap
  Scenario: Register an account with all the fields
    When    I enter the contact information of Firstname as "Femi", Lastname as "Fash", number as  "07523418975" and email as "lexfa@gmail.com"
    And     I enter mailing Information of address as "9 Wallfield Crescent" City as "Queensland", State as  "Gold coast" postalCode as "4728 ",and country as "AUSTRALIA"
    Then    I enter User Information of username as "Alex", password and confirm password as "123456"
    And     I click on Submit button
    Then    The confirmation page is displayed with the username as "Alex"

#  Using Scenario Outline/ Examples
  @Femi04
  Scenario Outline: Register an account with all the fields
    When    I enter the contact information of "<Firstname>","<Lastname>","<PhoneNumber>" and "<Email>"
    And     I enter mailing Information of "<Address>", "<City>","<State>","<PostalCode>" and "<Country>"
    Then    I enter User Information of "<UserName>",Password and Confirm Password as "<Password>"
    And     I click on Submit button
    Then    The confirmation page is displayed with the username as "<UserName>"
    Examples:
      | Firstname | Lastname | PhoneNumber | Email           | Address              | City       | PostalCode | Country       | UserName | Password |
      | Femi      | Fash     | 07523418975 | lexfa@gmail.com | 9 Wallfield Crescent | Queensland | 4728       | Australia    | Alex     | 123456   |
      | Wale      | Akin     | 07523412345 | walea@gmail.com | 8 Castle Street      | Surey      | 2389       | Canada        | Blackky  | 098765   |
      | Amaka     | Obi      | 07523411208 | aobi@gmail.com  | 4 Sunnybank Road     | Alabama    | 1297       | United States | Nne      | 987245   |