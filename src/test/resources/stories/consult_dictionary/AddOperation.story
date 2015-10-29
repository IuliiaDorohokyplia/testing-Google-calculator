Lookup a definition
Narrative:
I want to test the addition operation using keyboard input

Scenario: Search the calculator
Given the user clear the board in the calculator
When the user input 'data'
Then they should see the definition 'result'

Examples:
|data|result|
|15+3=|18|
|-120+340=|220|
|125.4+166.7=|292.1|
|0+0=|0|
|435.89657+22.3459=|458.24247|
|0+5=|5|
|0+0=|0|
|7+(-56.943211)=|-49.943211|
