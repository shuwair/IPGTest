# Test for IPG

## Requiremnt 

Generate a file with x number of lines and each line consist of a string that is unique with 100 characters long with limitation of 10M of ram

## Solution

* Used Flyweight Pattern for passing strings and not stored in any array or list to save memory 
* String generated with the combination of  counter and zero padding (eg .....0000001) so every string shuld be unique
* Used BufferedWriter for wiring generated rows to file with buffer size of 100 as each row contains 100 chars

## Results

Successly generates file with x no of rows cosists of unique 100 characters long string with less than 4m of ram untilize restuls recoded with Jprofiler 10 million rows

#### Strings generated 

0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001
0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000002
......
0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000009999999
0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010000000


#### Memory Utilize

![alt text](https://github.com/shuwair/IPGTest/blob/master/ipg3.jpg?raw=true)

#### Ojbect Details

![alt text](https://github.com/shuwair/IPGTest/blob/master/ipg2.JPG?raw=true)


