package com.geo.morse.app;

import com.geo.morse.strings.TestStrings;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();

        //Test English to Morse
        for (int i = 0; i < TestStrings.englishText.length; i++) {
            String result = converter.convertMorse(true, TestStrings.englishText[i]);
            if (!result.equals(TestStrings.morseText[i])) {
                System.out.println("English to Morse Conversion Error Occured.");
                System.out.println("Error converting: " + TestStrings.morseText[i]);
                System.out.println("Result was: " + result);
            }
        }

        //Test Morse to English
        for (int i = 0; i < TestStrings.morseText.length; i++) {
            String result = converter.convertMorse(false, TestStrings.morseText[i]);
            if (!result.equals(TestStrings.englishText[i].toLowerCase())) {
                System.out.println("Morse to English Conversion Error Occured.");
                System.out.println("Error Converting: " + TestStrings.englishText[i]);
                System.out.println("Result was: " + result);
            }
        }
    }
}
