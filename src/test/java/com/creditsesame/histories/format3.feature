Feature: User Signup - Format 3
  As user I need to login to Service Api

  Scenario Outline: Login Successful - Using serialized object
    Given I signup into ServiceApi with username: "<username>" password: "<password>" using apiKey: "<apiKey>"


  @test8
    Examples:
      | username                    | password | apiKey |
      | testtu-nelsonqa-386@cs.com  | password | cs-123 |

  @docker
    Examples:
      | username                    | password | apiKey |
      | tester@cs.com               | password | cs-123 |
