package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        //Array Practice
        //Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8
        int[] array = {1, 1, 2, 3, 5, 8};
        //Loop through the array and print out each value
        for(int i : array)
        {
            System.out.println(i);
        }
        //modify the loop to only print the odd numbers
        System.out.println("Printing only odd numbers in array");
        for(int i : array)
        {
            if(i%2!=0){
            System.out.println(i);}
        }

        String sentence =  "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        //Use the split method to divide the string at each space and store the individual
        // words in an array.
        String[] wordsInSentence = sentence.split(" ");
        System.out.println(Arrays.toString(wordsInSentence));

        //change the delimiter to split the string into separate sentences
        String[] separateSentences = sentence.split("\\.");
        System.out.println(Arrays.toString(separateSentences));


    }
}