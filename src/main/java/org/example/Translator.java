package org.example;

public class Translator {

    public String translateString(String input, int shift){
        StringBuilder decodedString = new StringBuilder();
        for(char a: input.toCharArray()) {
            decodedString.append(translateLetter(a, shift));
        }
        return decodedString.toString();
    }

    private char translateLetter(char ch, int shift){
        if(Character.isLetter(ch)){
            char base = Character.isUpperCase(ch) ? 'A' : 'a';
            int shiftedIndex = (ch-base+shift)%26;
            if (shiftedIndex < 0)
                shiftedIndex += 26;
            return (char)(base+shiftedIndex);
        }
        return ch;
    }
}
