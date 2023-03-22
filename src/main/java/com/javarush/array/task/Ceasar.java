package com.javarush.array.task;

public class Ceasar {
    public static String encryption(String text, int step) {
        String res = "";

        char[] textChar = text.toCharArray();
        char[] lowChars = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с',
                'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        char[] upChars = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж',
                'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х',
                'Ц', 'Ч', 'Ш', 'Щ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};

        for(int i = 0; i < textChar.length; i++) {
            int index = 0;
            boolean isNOTLetter = Character.isWhitespace(textChar[i]);
            if(!isNOTLetter){
                if(Character.isLowerCase(textChar[i])){
                    while (textChar[i] != lowChars[index]) index++;
                    index += step;
                    if(index > 32){
                        index -= 33;
                    }
                    textChar[i] = lowChars[index];
                } else if(Character.isUpperCase(textChar[i])){
                    while (textChar[i] != upChars[index]) index++;
                    index += step;
                    if(index > 32){
                        index -= 33;
                    }
                    textChar[i] = upChars[index];
                }
            }
        }
        for(char c: textChar) {
            res += c;
        }
        return res;
    }//текст, выделенный жирным шрифтом
}
