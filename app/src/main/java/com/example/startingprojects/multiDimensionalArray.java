package com.example.startingprojects;

public class multiDimensionalArray {


    //5. Print a multiplication table from 1 to 10 using  multidimensional array
    //   Output
    //   1 2 3 4 5 6 7 8 9 10
    //   2 4 6 8 10 12 14 16 18 20
    //    ...
    // public void printTables(){};
    public static void multiplicationTable(){
        int[][] product = new int[10][10];
        for(int i = 1; i <= 10; i++){
            for(int k = 1; k <= 10; k++){
                product[i][k] = i * k;
                System.out.print("\t" +product[i][k]);
            }
            System.out.println("");
        }
    }

}
