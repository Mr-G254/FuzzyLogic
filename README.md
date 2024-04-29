# FuzzyLogic
In the sample code provided I have used Java to compare two given strings getting the percentage match using the Fuzzy Logic.<br>
The logic behind this: 
- Looping through each character and comparing them to see if the characters at a certain index are the same in both strings.
- If the letters aren't the same, the  letter needs to be altered for it to match.
- The total number of alterations `(letters to be changed)` needs to be counted.
- To get the percentage match you have to get the number of letters that won't be altered `(total length of largest string minus number of altered letters)` divide it by total length of the longest string times 100.
