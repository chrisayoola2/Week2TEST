package com.example.week2test;

public class Problem2 {


    public static void main(String[] args) {

        String myString = "frog";
        mySubstring(myString);


    }


    private static void mySubstring( String aString){

        for (int i= 0; i<aString.length(); i++){
        for (int j = i+1; j <= aString.length(); j++){
            System.out.printf("%S ",aString.substring(i,j));
        }
    }
}
}
