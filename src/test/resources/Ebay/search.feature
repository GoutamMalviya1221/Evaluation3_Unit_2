
@tag
Feature: Advance Search 

  @tag1
  Scenario: Advance Search Functionality
    Given open browser and enter url , Click on the Advance near Search
    When   enter keyword or item number , select keyword option , enter Exclude words , select the category     
    And click on the using advanced search option link
    And then enter the details provided in the images
    Then Assert the No Exact matches found
    And close the browser

#  @tag2
#  Scenario Outline: Title of your scenario outline
#    Given I want to write a step with <name>
#    When I check for the <value> in step
#    Then I verify the <status> in step

#    Examples: 
#     | name  | value | status  |
#      | name1 |     5 | success |
#      | name2 |     7 | Fail    |
