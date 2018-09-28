package javaForCompleteBeginners.programming_CoreJavaClasses;

/**
 * Title:
 *
 * "Array of Strings"
 */

public class VidK_Eleven_ArraysOfStrings {
    public static void main(String[] args) {
        // soooo ......apparantly this is about makin an array of strings and i didnt knw
        // and made an array of strings in the previous class XD... whoops

        // OKAY so we gonna learn more then jus array of strings thank glob

        // Basics of string arrays
        String[] words = new String[3];

        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";

        System.out.println(words[2]);

        String[] fruits = {"apple", "banana", "pear", "kiwi"};

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        System.out.println("==========");

        int value = 0;
        String text = null;
        System.out.println(text);
        String[] texts = new String[2];
        System.out.println(texts[0]);
        texts[0] = "one";

        System.out.println("+++++++++++++++ MY CODE ++++++++++++");

        String[] favGuys = {"Yuzuru/Satomi", "Luffy/Zoro", "Naruto/Gaara", "Viktor/Yuri", "Deadpool/Spiderman"};
        for(String guys : favGuys){
            System.out.println(guys);
        }




    }
}
