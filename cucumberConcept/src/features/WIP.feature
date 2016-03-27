Feature: Check DB projects 
 
  @shori
  Scenario: Promoting DB Results, check projects- REST
    Given I am  on DB website
    And I choose to select the link "Our Services"
    And I want to know more about "Strategy" in our services page
    Then I should see "Service" details as "We help shape your future and define how to get you there."
    And I store a snapshot of page
    
     @shori
  Scenario: Promoting DB Results, check Our services- Strategy details
    Given I am  on DB website
    And I choose to select the link "Our Services"
    And I want to know more about "Consulting" in our services page
    Then I should see "Service" details as "Combining expertise with innovative ideas and solutions."
    And I store a snapshot of page