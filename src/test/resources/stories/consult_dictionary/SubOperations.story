Lookup a definition
Narrative:
I want to check a subtraction operation using keyboard input

Scenario: Search the calculator
Given the user clear the board in the calculator
When the user input 'data'
Then they should see the definition 'result'

Examples:
|data|result|
|5-6=|-1|
|6-5=|1|
|-7.8-(-6.5)=|-1.3|
|0-0=|0|
|125.4-166.7=|-41.3|
|-6-42.5=|-48.5|
|870.6767676-67.8987876=|802.77798|
|999-(-879)=|1878|
|0-76.5=|-76.5|
|999.45-0=|999.45|