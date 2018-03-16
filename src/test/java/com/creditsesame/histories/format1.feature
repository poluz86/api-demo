Feature: User Signup - Format 1
  As user I need to login to Service Api

  Scenario Outline: Login Successful - Using json file
    Given I authenticate into ServiceApi using body "<jsonFile>"

  @test8
    Examples:
      | jsonFile                    |
      | LoginSuccessful_test8.json  |

  @docker
    Examples:
      | jsonFile                    |
      | LoginSuccessful_docker.json |