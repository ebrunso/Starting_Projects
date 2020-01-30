package com.example.startingprojects;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class animalDuplicates {

    //1. Create a function to print the duplicates in a list of strings
    //   public void findDuplicates(List<String> strings){};

    public static void findDuplicates(List<String> strings) {

        final Set<String> setToReturn = new HashSet<>();
        final Set<String> set1 = new HashSet<>();

        for (String yourString : strings) {
            if (!set1.add(yourString)) {
                setToReturn.add(yourString);
            }
        }
        System.out.println("the list of duplicate animals is: " + setToReturn);
    }
}
