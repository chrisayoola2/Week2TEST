package com.example.week2test;

import java.util.Arrays;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

public class Problem1 {

    public static void main(String[] args) {

        int numArray[] = {2, 8, 9, 3, 4, 3, 2, 6, 6, 2, 4, 9, 8};

        sortArray(numArray);

    }




    private static void sortArray(int[] anArray){
        Arrays.sort(anArray);
        System.out.printf("{ ");

        for (int a : anArray) {
            System.out.printf("%d ",a);
        }
        System.out.println("}");
    }

}
