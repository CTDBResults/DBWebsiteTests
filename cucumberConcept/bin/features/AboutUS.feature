Feature: Proof of concept

  @shori
  Scenario: Promoting DB Results, check projects- REST
    Given I am  on DB website
    And I select the "SUBMIT" button
    And I select "About Us" link
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
      | TRACY KELLY       | HEAD OF DIGITAL              |
      | PETER FAULKNER    | PEOPLE AND CULTURE MANAGER   |

      @shori
  Scenario Outline: Customer Engagement and Interaction. Negative tests.
    Given I am  on DB website
    And I select the "SUBMIT" button
    And I select "Contact" link
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
      | name     | company | company | email          | phone  | message         |
      | gavin123 | DB1     | manager | aaa@gmail.com  | 123123 | ALL is NOT Well |