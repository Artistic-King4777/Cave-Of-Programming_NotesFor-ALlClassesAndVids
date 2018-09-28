package javaForCompleteBeginners;

import java.util.HashMap;

public class PhoneBook {

    public HashMap<String, String> map = new HashMap<>();

    public void add(String id, String number) {
        map.put(id, number);
    }

    public void remove(String id) {
        map.remove(id);
    }


    public String lookup(String name) {
        return this.map.get(name);
    }

    public static int score(String word) {
        String uword = word.toUpperCase();
        int score = 0;

        for(int i = 0; i < uword.length(); i++ ) {
            switch(uword.charAt(i)) {
                case 'Q' : case 'Z' :
                    score += 10;
                    break;
                case 'J' : case 'X' :
                    score += 8;
                    break;
                case 'K' :
                    score += 5;
                    break;
                case 'F' : case 'H' : case 'V' : case 'W' : case 'Y' :
                    score += 4;
                    break;
                case 'B' : case 'C' : case 'M' : case 'P' :
                    score += 3;
                    break;
                case 'D' : case 'G' :
                    score += 2;
                    break;
                default :
                    score += 1;
                    break;
            } // end of switch statement
        } // end of for loop
        return score;
    } // end of score method


}
