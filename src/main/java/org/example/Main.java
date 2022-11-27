package org.example;

import org.example.util.Anagram;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Anagram anagram = new Anagram("reglament");
        anagram.match(Arrays.asList("hello", "worlddfgb", "zombies", "pants"));
    }
}