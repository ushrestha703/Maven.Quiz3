package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

        String newStr = str.substring(0, indexToCapitalize) +
                str.substring(indexToCapitalize, indexToCapitalize + 1).toUpperCase() +
                str.substring(indexToCapitalize + 1, str.length());

        return newStr;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                String result = string.substring(i, j);
                if(!list.contains(result)) {
                    list.add(string.substring(i, j));
                }
            }
        }
        return list.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){

        int counter = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                counter++;
            }
        }
        return counter;
    }

}
