Feature: Under construction

  @shori
  Scenario: Promoting DB Results,The website will feature contact details for DB Results including contact numbers and maps of office locations.
    Given I am  on DB website
    And I select the "SUBMIT" button
    And I select "Contact" link
    Then I should see the "office locations","office addresses" and "phone number" on the page
      | office locations | office addresses                                                  | phone number    |
      | Melbourne        | Level 1, 303 Collins St Melbourne VIC 3000 AUSTRALIA              |Phone: +61 3 8630 0000|
      | Sydney           | Suite 6, Level 7, 66 Hunter StSydney NSW 2000 AUSTRALIA           |Phone: 1300 130 838|
      | Canberra         | Level 6, 39 London Circuit Canberra ACT 2601 AUSTRALIA            |Phone: +61 2 6263 5911|
      | Hong Kong        | Suite 36, Unit A, 20/F  9 Queen's Road Central Central, HONG KONG |Phone: +852 3189 7040|

      
     