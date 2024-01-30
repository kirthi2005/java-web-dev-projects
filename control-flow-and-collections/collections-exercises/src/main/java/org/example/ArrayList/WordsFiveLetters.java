package org.example;

import java.util.ArrayList;

public class WordsFiveLetters {
    public static ArrayList<String>  findFiveLetterWords(ArrayList<String> wordsList,int length){
        ArrayList<String> returnWords = new ArrayList<>();
        for(String listWord: wordsList)
        {
            int l=listWord.length();
            /*if(l==5){
                returnWords.add(listWord);
            }*/
            if(l==length){
                returnWords.add(listWord);
            }
        }
        return returnWords;
    }
}
