package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.example.SumEven;
public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<Integer>(10);
        ArrayList<String> words = new ArrayList<String>(5);
        ArrayList<String> fiveLetterWords = new ArrayList<String>();
        int sumOfEvenInt;
        System.out.println("Enter the word length for search");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        intArray.add(11);
        intArray.add(14);
        intArray.add(19);
        intArray.add(22);
        intArray.add(35);
        intArray.add(44);
        intArray.add(61);
        intArray.add(68);
        intArray.add(72);
        intArray.add(91);
        sumOfEvenInt = SumEven.sumEvenInt(intArray);
        System.out.println("Sum of even numbers: " + sumOfEvenInt);

        words.add("hello");
        words.add("hi");
        words.add("piggy");
        words.add("byeee");
        words.add("buses");
        fiveLetterWords = WordsFiveLetters.findFiveLetterWords(words,length);
        int arrayLength = fiveLetterWords.size();
        for(String fiveLetter: fiveLetterWords){
            System.out.println(fiveLetter);
        }
        if(arrayLength == 0){
            System.out.println("No words found with your entered word length");
        }

        //Bonus Section
        String sentence = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] sentenceToArray = sentence.split(" ");
        ArrayList<String> wordsSentence = new ArrayList<String>(Arrays.asList(sentenceToArray));
        for(String a : sentenceToArray){
            System.out.println(a);
        }
    }
}
