Lookup a definition
Narrative:
I want to test the multiplication operation using keyboard input

Scenario: Search the calculator
Given the user clear the board in the calculator
When the user input 'data'
Then they should see the definition 'result'


Examples:
|data|result|
|15*3=|45|
|-120*340=|-40800|
|-7.8*(-6.5)=|50.7|
|0*0=|0|
|435.89657*22.3459=|9740.50116356|
|125.4*166.7=|20904.18|
|0*(-500)=|0|
|-56.943211*0=|0|
|100.001*0.0000=|0|
