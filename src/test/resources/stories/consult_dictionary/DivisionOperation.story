Lookup a definition
Narrative:
I want to test the division operation using keyboard input

Scenario: Search the calculator
Given the user clear the board in the calculator
When the user input 'data'
Then they should see the definition 'result'

Examples:
|data|result|
|10/2=|5|
|25.000/5.00=|5|
|-456/2=|-228|
|-100.34/23.4=|-4.28803418803|
|6/(-3.3)=|-1.81818181818|
|0/(-3.3)=|0|
|7/0=|Infinity|