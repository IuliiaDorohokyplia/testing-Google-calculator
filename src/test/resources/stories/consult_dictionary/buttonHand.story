Lookup a definition
Narrative:
I want to check out all arithmetic operations using data entry via buttons

Scenario: KeyBord
Given the user clear the board in the calculator
When the user performs using button 'numberButton'
Then they should see the definition 'result'


Examples:
|numberButton|result|
|1|1|
|(54−2)=|52|
|(54÷2)=|27|
|(4×2)=|8|
|(54+2)=|56|
|10−50%=|5|
|(5.4+2)=|7.4|
|AC|0|