Feature: Check DB projects

  #our services
  @shori
  Scenario: Promoting DB Results, check Our services- Strategy details
    Given I am  on DB website
    And I choose to select the link "Our Services"
    And I want to know more about "Strategy" in our services page
    Then I should see "Service" details as "We help shape your future and define how to get you there."

  @shori
  Scenario: Promoting DB Results, check Our services- Strategy details
    Given I am  on DB website
    And I choose to select the link "Our Services"
    And I want to know more about "Consulting" in our services page
    Then I should see "Service" details as "Combining expertise with innovative ideas and solutions."

  @shori
  Scenario: Promoting DB Results, check Our services- Strategy details
    Given I am  on DB website
    And I choose to select the link "Our Services"
    And I want to know more about "Digital" in our services page
    Then I should see "Service" details as "Unlock your digital potential through disruption."

  @shori
  Scenario: Promoting DB Results, check Our services- Strategy details
    Given I am  on DB website
    And I choose to select the link "Our Services"
    And I want to know more about "Technology" in our services page
    Then I should see "Service" details as "Smart solutions to bring your strategy to life."

  @shori
  Scenario: Promoting DB Results, check Our services- Strategy details
    Given I am  on DB website
    And I choose to select the link "Our Services"
    And I want to know more about "Operations" in our services page
    Then I should see "Service" details as "Help to ensure you stay focused on what you do best."

  #About US
  @shori
  Scenario: Promoting DB Results, check projects- REST
    Given I am  on DB website
    And I choose to select the link "About Us"
    Then I should see following "<Name>" as "<Position>" roles
      | Name              | Position                     |
      | ANDREW DEAN       | CHIEF EXECUTIVE OFFICER      |
      | GAVIN BUNSHAW     | EXECUTIVE DIRECTOR           |
      | SALLY MCLEAN      | CHIEF FINANCIAL OFFICER      |
      | JOHN DEMELIS      | EXECUTIVE DIRECTOR           |
      | BRENTON MCPHERSON | REGIONAL DIRECTOR - NORTHERN |
      | DAMIAN WALSH      | ENERAL MANAGER - ASIA        |
      | MATT NIDD         | HEAD OF DIGITAL              |
      | JULIAN BRANDES    | CHAIRMAN                     |
      | TRACY KELLY       | PEOPLE AND CULTURE MANAGER   |
      | PETER FAULKNER    | HEAD OF DIGITAL              |

  @shori
  Scenario Outline: Customer Engagement and Interaction. Negative tests.
    Given I am  on DB website
    And I choose to select the link "Contact"
    And I enter then details as
      | Fields  | Value                         |
      | name    | shori                         |
      | company | Automated Test                |
      | email   | hemant.shori@dbresults.com.au |
      | phone   | 5555                          |
      | message | All is well                   |
    And I select the "SUBMIT" button
    Then I should see the message as "Your message has been sent. We'll be in touch soon."

    Examples: 
      | name     | company | company | email         | phone  | message         |
      | gavin123 | DB1     | manager | aaa@gmail.com | 123123 | ALL is NOT Well |

  # DB Projects
  @shori
  Scenario: Promoting DB Results, check projects- REST
    Given I am  on DB website
    And I choose to select the link "Projects"
    And I want to know more about "REST" project
    Then I should see "Rest" details as "REST entrusted DB Results to be their digital services partner."

  @shori
  Scenario: Promoting DB Results, check projects- first australian
    Given I am  on DB website
    And I choose to select the link "Projects"
    And I want to know more about "FIRST AUSTRALIAN" project
    Then I should see "FIRST AUSTRALIAN" details as "First Australian implementation of new AASB15 accounting standards for iconic legal services company"

  @shori
  Scenario: Promoting DB Results, check projects- first australian
    Given I am  on DB website
    And I choose to select the link "Projects"
    And I want to know more about "Victorian electricity distributor" project
    Then I should see "Victorian electricity distributor" details as "A strategy for Power of Choice keeps a Victorian electricity company competitive"

  # Contact US
  @shori
  Scenario: Customer Engagement and Interaction
    The website will feature a contact form that when submitted will send to a nominated email address.

    Given I am  on DB website
    And I choose to select the link "Contact"
    And I enter then details as
      | Fields  | Value                         |
      | name    | shori                         |
      | company | Automated Test                |
      | email   | hemant.shori@dbresults.com.au |
      | phone   | 5555                          |
      | message | All is well                   |
    And I select the "SUBMIT" button
    Then I should see the message as "Your message has been sent. We'll be in touch soon."

  @shori
  Scenario Outline: Customer Engagement and Interaction. Negative tests.
    Given I am  on DB website
    And I choose to select the link "Contact"
    And I enter then details as
      | Fields  | Value                         |
      | name    | shori                         |
      | company | Automated Test                |
      | email   | hemant.shori@dbresults.com.au |
      | phone   | 5555                          |
      | message | All is well                   |
    And I select the "SUBMIT" button
    Then I should see the message as "Your message has been sent. We'll be in touch soon."

    Examples: 
      | name     | company | company | email         | phone  | message         |
      | gavin123 | DB1     | manager | aaa@gmail.com | 123123 | ALL is NOT Well |
