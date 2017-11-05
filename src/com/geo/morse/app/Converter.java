package com.geo.morse.app;

/**
 * Morse Code Converter using Arrays
 */
public class Converter {
    private final String[] morseRep = {".-","-...","-.-.","-..",".","..-.","--.", "....", "..",
            ".---", "-.-", ".-..", "--","-.","---",".--.","--.-",".-.","...","-","..-",
            "...-",".--","-..-","-.--","--..","|","-----",".----","..---","...--","....-",
            ".....","-....","--...","---..","----."};
    private final String[] englishRep = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n",
            "o","p","q","r","s","t","u","v","w","x","y","z"," ","0","1","2","3","4","5","6","7","8","9"};

    public String convertMorse(boolean toMorse, String textToConvert) {
        StringBuilder builder = new StringBuilder();

        if (toMorse) {
            for (int i = 0; i < textToConvert.length(); i++) {
                for (int j = 0; j < englishRep.length; j++) {
                    String currentLetter = textToConvert.substring(i, i + 1).toLowerCase();
                    if (currentLetter.equals(englishRep[j])) {
                        builder.append(morseRep[j]);
                        if (i < textToConvert.length() - 1) {
                            builder.append(" ");
                        }
                    }
                }
            }
        } else {
            String[] morseWords = textToConvert.split("\\|");
            for (int i = 0; i < morseWords.length; i++) {
                String[] morseLetters = morseWords[i].split(" ");
                for (int j = 0; j < morseLetters.length; j++) {
                    for (int k = 0; k < morseRep.length; k++) {
                        if (morseLetters[j].equals(morseRep[k])) {
                            builder.append(englishRep[k]);
                        }
                    }
                }
                if (i < morseWords.length - 1) {
                    builder.append(" ");
                }
            }
        }

        return builder.toString();
    }
}
