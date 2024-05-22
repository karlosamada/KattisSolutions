//https://open.kattis.com/problems/falsesecurity
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class FalseSenseofSecurity {

    public static void generateMorseCode(HashMap<Character, String> morseCode) {
        morseCode.put('A', ".-");
        morseCode.put('B', "-...");
        morseCode.put('C', "-.-.");
        morseCode.put('D', "-..");
        morseCode.put('E', ".");
        morseCode.put('F', "..-.");
        morseCode.put('G', "--.");
        morseCode.put('H', "....");
        morseCode.put('I', "..");
        morseCode.put('J', ".---");
        morseCode.put('K', "-.-");
        morseCode.put('L', ".-..");
        morseCode.put('M', "--");
        morseCode.put('N', "-.");
        morseCode.put('O', "---");
        morseCode.put('P', ".--.");
        morseCode.put('Q', "--.-");
        morseCode.put('R', ".-.");
        morseCode.put('S', "...");
        morseCode.put('T', "-");
        morseCode.put('U', "..-");
        morseCode.put('V', "...-");
        morseCode.put('W', ".--");
        morseCode.put('X', "-..-");
        morseCode.put('Y', "-.--");
        morseCode.put('Z', "--..");
        morseCode.put('_', "..--");
        morseCode.put(',', ".-.-");
        morseCode.put('.', "---.");
        morseCode.put('?', "----");
    }

    public static void getCharValue(HashMap<String, Character> charCode) {
        charCode.put(".-", 'A');
        charCode.put("-...", 'B');
        charCode.put("-.-.", 'C');
        charCode.put("-..", 'D');
        charCode.put(".", 'E');
        charCode.put("..-.", 'F');
        charCode.put("--.", 'G');
        charCode.put("....", 'H');
        charCode.put("..", 'I');
        charCode.put(".---", 'J');
        charCode.put("-.-", 'K');
        charCode.put(".-..", 'L');
        charCode.put("--", 'M');
        charCode.put("-.", 'N');
        charCode.put("---", 'O');
        charCode.put(".--.", 'P');
        charCode.put("--.-", 'Q');
        charCode.put(".-.", 'R');
        charCode.put("...", 'S');
        charCode.put("-", 'T');
        charCode.put("..-", 'U');
        charCode.put("...-", 'V');
        charCode.put(".--", 'W');
        charCode.put("-..-", 'X');
        charCode.put("-.--", 'Y');
        charCode.put("--..", 'Z');
        charCode.put("..--", '_');
        charCode.put(".-.-", ',');
        charCode.put("---.", '.');
        charCode.put("----", '?');
    }
    public static String reverseCodeLength(String morseLength) {
        String newCodeLength = "";
        for (int i = morseLength.length() - 1; i <= 0; i--) {
            System.out.println(morseLength.charAt(i));
            newCodeLength += morseLength.charAt(i);
        }

        return newCodeLength;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, String> morseCode = new HashMap<Character, String>();
        HashMap<String, Character> charCode = new HashMap<String, Character>();

        generateMorseCode(morseCode);
        getCharValue(charCode);
        while(sc.hasNext()) {
            String encryptedMessage = sc.next();
            String firstEncrpytion = "";
            String morseLength = "";
            for(int i = 0; i < encryptedMessage.length(); i++) {
                String morse = morseCode.get(encryptedMessage.charAt(i));
                firstEncrpytion += morse;
                morseLength += String.valueOf(morse.length());
            }

            int currentIndex = 0;
            String word = "";
            for (int i = morseLength.length() - 1; i >= 0; i--) {
                int intChar = Character.getNumericValue(morseLength.charAt(i));

                Character currentChar = charCode.get(firstEncrpytion.substring(currentIndex, currentIndex + intChar));
                currentIndex += intChar;
                word += currentChar;
            }

            System.out.println(word);
        }
    }
}
