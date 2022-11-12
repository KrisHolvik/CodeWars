package com.projekt2;

import java.util.Arrays;

public class ReversedWords {
    public String spinWords(String sentence) {
        String[] wordsArray = sentence.split(" ");
        String newSentence = null;
        for (int i=0; i< wordsArray.length; i++){
            wordsArray[i] = wordsArray[i].length()>=5 ?
                    wordsArray[i] = new StringBuffer(wordsArray[i]).reverse().toString()
                    : wordsArray[i];
        } newSentence = Arrays.toString(wordsArray);
        return newSentence = newSentence.substring(1, newSentence.length()-1).replaceAll(",", "");
        }
     }
