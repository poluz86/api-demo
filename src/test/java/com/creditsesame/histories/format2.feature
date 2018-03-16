Feature: User Signup - Format 2
  As user I need to login to Service Api

  Scenario Outline: Login Successful - Using cucumber dataset
    Given I authenticate into ServiceApi with username: "<username>" password: "<password>" using apiKey: "<apiKey>"


  @test8
    Examples:
      | username                    | password | apiKey |
      | testtu-nelsonqa-386@cs.com  | password | cs-123 |

  @docker
    Examples:
      | username                    | password | apiKey |
      | tester@cs.com               | password | cs-123 |
