package com.example.startingprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1. Create a function to print the duplicates in a list of strings
        //   public void findDuplicates(List<String> strings){};
        String[] animalArr = {"cat", "pig", "dog", "cat", "pig"};
        List<String> animalList = new ArrayList<>(Arrays.asList(animalArr));
        System.out.println("the list of animals is: " + animalList);
        animalDuplicates.findDuplicates(animalList);

        //2. Create function to check if the string is a palindrome without using string.reverse() method
        //   public boolean checkPalindrome(String word){};
        String possiblePalindrome = "apple";
        System.out.println("Is " + possiblePalindrome + " a palindrome? Answer: " + isitaPalindrome.checkPalindrome(possiblePalindrome));
        String possiblePalindrome2 = "racecar";
        System.out.println("Is " + possiblePalindrome2 + " a palindrome? Answer: " + isitaPalindrome.checkPalindrome(possiblePalindrome2));

        //3. Create a function that will print:
        //     "fizz" is the number is divisible by 3
        //     "buzz" is the number is divisible by 5
        //     "fizzbuzz" is the number is divisible by both
        int fizzOrBuzz = 30;
        System.out.println("checking " + fizzOrBuzz + " for Fizz or Buzz, or both! ");
        fizzBuzz.checkFizzBuzz(fizzOrBuzz);

        //4.  Create a function to check if the two strings are Anagrams:    Eg COAT and TACO would be anagrams
        //   public boolean checkAnagrams(String word1, String word2){};
        char str1Arr[] = {'a', 'm', 'a', 'l', 'g', 'a', 'm'};
        char str2Arr[] = {'m', 'a', 'a', 'm', 'l', 'a', 'g'};
        String strA = "amalgam";
        String strB = "maamlag";

        if (checkAnagram.isItAnagram(str1Arr, str2Arr)){
            System.out.println("The strings " + strA + " and " + strB + " are anagrams");
        } else {
            System.out.println("The strings " + strA + " and " + strB + " are not anagrams");
        }

        //5. Print a multiplication table from 1 to 10 using  multidimensional array
        //   Output
        //   1 2 3 4 5 6 7 8 9 10
        //   2 4 6 8 10 12 14 16 18 20
        //    ...
        // public void printTables(){};
        //int [][] muliDarray = new int[10][10];
        multiDimensionalArray.multiplicationTable();


    }
}
