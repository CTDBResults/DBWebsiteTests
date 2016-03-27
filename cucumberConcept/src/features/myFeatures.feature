Feature: Proof of concept

 
  Scenario: Customer Engagement and Interaction
    The website will feature a contact form that when submitted will send to a nominated email address.

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


  