# Starting_Projects

Clone the files from github (https://github.com/ebrunso/Starting_Projects)
The file path for the files is:
Starting_Projects/app/src/main/java/com/example/startingprojects/

The changed files are: 
MainActivity.java, multiDimensionalArray.java, checkAnagram.java, 
fizzBuzz.java, isitaPalindrome.java, animalDuplicates.java

Run the MainActivity.java file after all files are compiled.

1. Create a function to print the duplicates in a list of strings
   public void findDuplicates(List<String> strings){};
**method in animalDuplicates.java**
![animalDuplicates output](https://raw.githubusercontent.com/ebrunso/Starting_Projects/master/app/src/main/java/com/example/startingprojects/1.%20animal%20duplicates.png)

2. Create function to check if the string is a palindrome without using string.reverse() method
   public boolean checkPalindrome(String word){};
**method in isitaPalindrome.java**
![isitaPalindrome output](https://raw.githubusercontent.com/ebrunso/Starting_Projects/master/app/src/main/java/com/example/startingprojects/2.%20palindrome%20check.png)

3. Create a function that will print:
     "fizz" is the number is divisible by 3
     "buzz" is the number is divisible by 5
     "fizzbuzz" is the number is divisible by both
**method in fizzBuzz.java**
![fizzBuzz output](https://raw.githubusercontent.com/ebrunso/Starting_Projects/master/app/src/main/java/com/example/startingprojects/3.%20fizzbuzz.png)

4.  Create a function to check if the two strings are Anagrams:    Eg COAT and TACO would be anagrams
   public boolean checkAnagrams(String word1, String word2){};
**method in checkAnagram.java**
![checkAnagram output](https://raw.githubusercontent.com/ebrunso/Starting_Projects/master/app/src/main/java/com/example/startingprojects/4.%20anagram.png)

5. Print a multiplication table from 1 to 10 using  multidimensional array
   Output
   1 2 3 4 5 6 7 8 9 10
   2 4 6 8 10 12 14 16 18 20
    ...
 public void printTables(){};
**method in multiDimensionalArray.java**
![multiDimensionalArray output](https://raw.githubusercontent.com/ebrunso/Starting_Projects/master/app/src/main/java/com/example/startingprojects/5.%20multiplication%20tables.png)

**Research**
1. What is the difference in a hash map versus a hash table?
	**Hashmap isn't thread-safe or synchronized, so it can be shared with many threads.
Hashtable doesn't allow any null keys or values while Hashmap allows one null key and multiple null values.**

2. Why should you generally override the equals and hashCode methods?
	**If equals() or hashCode() methods are not overridden, the class will not behave properly, because hash based collections are organized using hash codes to determine where the objects reside in memory**

3. How does a factory design pattern work?
	**Factory methods allow classes to use subclasses to create objects. Factory methods require new operations to make objects, but not new classes.**

4. How does Java Garbage Collection Work?
	**Java garbage collection checks to see if an object can be accessed in memory. If It cannot be accessed, it is marked for deletion, and the garbage collector deletes it to free up memory.**

5. What is the difference in a HashMap vs a HashTable?
	**Hashmap is not synchronized. It is not thread-safe and can be shared with many threads.
Hashmap allows one null key and multiple null values while Hashtable doesn't allow any null keys or values.**

6. What is a sparse Array?
	**A sparse array is an array where many elements have a value of zero.**

7. What is the difference in a ArrayList and the List?
	**List is a collection of elements of a sequence where each element is an object and elements are accessed by their index. Arraylist is a dynamic array of objects that increases or reduces in size whenever needed. Lis is an interface and ArrayList is a class.**

8. What is the difference in comparator vs comparable?
	**the comparator has many sorting sequences and comparable is a single sorting sequence. Comparable affects the original class, while comparable doesn't affect the original class. Comparable provices a compareTo() method to sort elements. Comparator provides a compare() method. Comparable is present in java.lang package, while comparator is present in java.util package. We can sort the list of elements of comparable by type by Collections.sort(List), while the elements of comparator type can be sorted by the Collections.sort(List, Comparator) method.**
