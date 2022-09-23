Scenario Outline: Checking Login Functionality with Valid Username also
Given User is on Login Page
When user Enter the Username in "<userName>" and enter the password "<password>"
Then should click on Login button
And add any one product to cart
Examples:
| userName | password |
|   performance_glitch_user  |secret_sauce |