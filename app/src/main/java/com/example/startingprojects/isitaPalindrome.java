package com.example.startingprojects;

public class isitaPalindrome {

    //2. Create function to check if the string is a palindrome without using string.reverse() method
    //   public boolean checkPalindrome(String word){};
    public static boolean checkPalindrome(String word){
        String backwardsString = "";

        // flip the string and save it to another string
        for(int i = 0; i < word.length(); i++){
            backwardsString = word.charAt(i) + backwardsString;
        }

        System.out.println(word);
        System.out.println(backwardsString);
        // is it a palindrome?
        if (backwardsString.equals(word)){
            return true;
        }
        return false;
    }
}
