package com.example.startingprojects;

import java.util.Arrays;

public class checkAnagram {

    static boolean isItAnagram(char[] str1, char[] str2){
        int str1Length = str1.length;
        int str2Length = str2.length;

        //check length of both strings
        if (str1Length != str2Length){
            return false;
        }

        //Sort the strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < str1Length; i++){
            if (str1[i] != str2[i]){
                return false;
            }
        }
        return true;
    }
}
