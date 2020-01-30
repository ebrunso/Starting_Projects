package com.example.startingprojects;

public class fizzBuzz {

    //3. Create a function that will print:
    //     "fizz" is the number is divisible by 3
    //     "buzz" is the number is divisible by 5
    //     "fizzbuzz" is the number is divisible by both
    public static void checkFizzBuzz(int fizzOrBuzz) {

        String fizzAnswer = "";

        if (fizzOrBuzz%3 == 0) {
            fizzAnswer = "fizz";
        }
        if (fizzOrBuzz%5 == 0) {
            fizzAnswer = fizzAnswer + "buzz";
        }
        System.out.println(fizzAnswer);

    }
}
