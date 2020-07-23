Feature: Wikipedia


Given User is on Wikipedia home page
Then User types "Steve Jobs" in the wiki search box
Then User clicks wiki search button

  @wiki
  Scenario: Wikipedia Search Functionality Title Verification
    Then User sees "Steve Jobs" is in the wiki title


  Scenario: Wikipedia Search Functionality Header Verification
    Then User sees Steve Jobs is in the main header

  @SteveJobs
  Scenario Outline: Wikipedia Search Functionality Image Header Verification
    Given User is on Wikipedia home page
    Then User types "<Input>" in the wiki search box
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header
    Then User sees "<expectedImageHeader>" is in the image header;

    Examples:
      | Input           | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Steve Jobs      | Steve Jobs      | Steve Jobs         | Steve Jobs        |
      | Albert Einstein | Albert Einstein | Albert Einstein    | Albert Einstein     |
      | James Cameron   | James Cameron   | James Cameron      | James Cameron       |
      | Lady Gaga       | Lady Gaga       | Lady Gaga          | Lady Gaga           |



