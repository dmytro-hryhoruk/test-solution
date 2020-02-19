# Concatenated Words
* [Challenge](#challenge)
* [Project Structure](#structure)
* [Setup Guide](#setup)

<hr>

# <a name="challenge"></a>Challenge

We have provided a file called “words.txt” which contains a sorted list of
approximately 56,000 words. The words are listed one word per line, do not contain spaces,
and are all lowercase.
Your task is to write a program that reads the file and provides the following:
❖ the longest concatenated word (that is, the longest word that is comprised entirely of
shorter words in the file)
❖ the 2nd longest concatenated word
❖ the total count of all the concatenated words in the file
For example, if the file contained:
* cat
* cats
* catsdogcats
* dog
* dogcatsdog
* hippopotamuses
* rat
* ratcatdogcat

The longest concatenated word would be 'ratcatdogcat' with 12 characters. ‘hippopotamuses’ is
a longer word, however it is not comprised entirely of shorter words in the list. The 2nd longest
concatenated word is ‘catsdogcats’ with 11 characters. The total number of concatenated words
is 3. Note that ‘cats’ is not a concatenated word because there is no word ‘s’ in the list.


<hr>

<a name="structure"><h2>Project structure</h2></a>

  * Java 12

  * Maven 4.0.0

  * log4j 2.13.0

  * maven-checkstyle-plugin

<a name="developer"><h2>Setup Guide</h2></a>

Open the project in your IDE.

Configure main method in Main class as Entry point in your application.

Run main method to see all of the result and you will see all of the result
in your console.

Also I have covered this solution with tests for different test cases
you may find them here -> src/test/SolutionTest

#Author
[Dmytro_Hryhoruk](https://github.com/dmytro-hryhoruk)

