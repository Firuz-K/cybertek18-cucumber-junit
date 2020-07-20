Feature: SmartBear order process

  @smartbear
  Scenario: SmartBear order process
    Then User is logged into SmartBear Tester account and on Order page
          # User fills out the form as followed:

    Then User selects FamilyAlbum from product dropdown
    Then User enters to quantity
    Then User enters John Wick to costumer name
    Then User enters Kinzie Ave to street
    Then User enters Chicago to city
    Then User enters IL to state
    Then User enters "60056"
    Then User selects Visa as card type
    Then User enters "1111222233334444" to card number
    Then User enters expiration date
    Then User clicks process button
    Then User verifies John Wick is in the list


  # TC 27


  Scenario: SmartBear order process
    Given User is logged into SmartBear Tester account and on Order page
          # User fills out the form as followed:

    Then User selects FamilyAlbum from product dropdown
    Then User enters to quantity
    Then User enters "John Wick" to costumer name
    Then User enters "Kinzie Ave" to street
    Then User enters "Chicago" to city
    Then User enters "IL" to state
    Then User enters "60056"
    Then User selects Visa as card type
    Then User enters "1111222233334444" to card number
    Then User enters "expiration date" to expiration date
    Then User clicks process button
    Then User verifies "John Wick" is in the list


  Scenario Outline: TC#27: SmartBear order process

    Given User is logged into SmartBear Tester account and on Order page
    # User fills out the form as followed from the table below:
    Then User selects "<product>" from product dropdown
    Then User enters "<quantity>" to quantity
    Then User enters "<customer name>" to costumer name
    Then User enters "<street>" to street
    Then User enters "<city>" to city
    Then User enters "<state>" to state
    Then User enters "<zip>" to zip
    Then User selects "<cardType>" as card type
    Then User enters "<card number>" to card number
    Then User enters "<expiration date>" to expiration date
    Then User clicks process button
    Then User verifies "<costumer name>" is in the list

    Examples:
      | product     | quantity | customer name    | street      | city        | state | zip   | cardType | card number   | expiration date | costumer name    |
      | MyMoney     | 1        | Ken Adams        | Kinzie st   | Chicago     | IL    | 60004 | Visa     | 1234567890123 | 10/22           | Ken Adams        |
      | FamilyAlbum | 4        | Joey Tribbiani   | State st    | Chicago     | IL    | 60656 | Visa     | 3432323232323 | 12/22           | Joey Tribbiani   |
      | ScreenSaver | 5        | Rachel Green     | Michigan st | Chicago     | IL    | 60056 | Visa     | 3432323232323 | 12/22           | Rachel Green     |
      | MyMoney     | 5        | Chandler Bing    | Erie st     | Chicago     | IL    | 60666 | Visa     | 3432323232323 | 12/22           | Chandler Bing    |
      | FamilyAlbum | 9        | Dr Drake Ramoray | Dale st     | Arl Hgths   | IL    | 60452 | Visa     | 3432323232323 | 12/22           | Dr Drake Ramoray |
      | ScreenSaver | 10       | Monica Geller    | Euclid ave  | Arl Hgths   | IL    | 60312 | Visa     | 3432323232323 | 12/22           | Monica Geller    |
      | MyMoney     | 3        | Ross Geller      | River rd    | Des Plaines | IL    | 60666 | Visa     | 3432323232323 | 12/22           | Ross Geller      |
      | MyMoney     | 1        | Ken Adams        | Kinzie st   | Chicao      | IL    | 60312 | Visa     | 3432323232323 | 12/22           | Ken Adams        |