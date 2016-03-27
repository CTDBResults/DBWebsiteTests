Feature: Check DB projects

@shori
  Scenario: Promoting DB Results, check projects- REST
    Given I am  on DB website
    And I select the "SUBMIT" button
    And I select "Projects" link
    And I want to know more about "REST" project
    Then I should see "Rest" details as "REST entrusted DB Results to be their digital services partner."
    
@shori
Scenario: Promoting DB Results, check projects- first australian
    Given I am  on DB website
    And I select the "SUBMIT" button
    And I select "Projects" link
    And I want to know more about "FIRST AUSTRALIAN" project
    Then I should see "FIRST AUSTRALIAN" details as "First Australian implementation of new AASB15 accounting standards for iconic legal services company"

 @shori
  Scenario: Promoting DB Results, check projects- first australian
    Given I am  on DB website
    And I select the "SUBMIT" button
    And I select "Projects" link
    And I want to know more about "Victorian electricity distributor" project
    Then I should see "Victorian electricity distributor" details as "A strategy for Power of Choice keeps a Victorian electricity company competitive"