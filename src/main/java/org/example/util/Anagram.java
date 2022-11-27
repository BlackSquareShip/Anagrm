package org.example.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    private String word;

    public Anagram(String word) {
        this.word = word;
    }

    public List<String> match(List<String> asList) {
        int length = word.length();
        int i = 0;
        List<String> resultList = new ArrayList<>();

        for(String checkingWord : asList){
            if(checkingWord.length() == word.length() && !(checkingWord.toLowerCase()).equals(word.toLowerCase())){
                List<String> wordList = new ArrayList<>(Arrays.asList(word.split("")));
                List<String> checkList = new ArrayList<>(Arrays.asList(checkingWord.toLowerCase().split("")));
                int equals = 0;
                for(String wordLetter : wordList){
                    if(checkList.contains(wordLetter.toLowerCase())){
                        checkList.remove(wordLetter.toLowerCase());
                        equals += 1;
                    }
                }
                if(equals == word.length()){
                    resultList.add(checkingWord);
                }
            }
        }
        return resultList;
    }
}
