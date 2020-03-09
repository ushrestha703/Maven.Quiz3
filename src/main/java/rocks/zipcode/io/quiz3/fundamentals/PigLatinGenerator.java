package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {

        String[] temp = str.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String t : temp) sb.append(createWord(t) + " ");
        return sb.toString().trim();
    }

    public String createWord(String str) {

        String strend1 = "";

        if (VowelUtils.startsWithVowel(str)) {
            return str + "way";
        } else

            if (VowelUtils.getIndexOfFirstVowel(str) == -1) {
                str = str.substring(1) + str.charAt(0);
                return str + "ay";
            }
            else

            for (int i = 0; i < VowelUtils.getIndexOfFirstVowel(str); i++){
                Character strend = str.charAt(i);
                strend1  = strend1 +  strend;
            }
            str = str.substring(VowelUtils.getIndexOfFirstVowel(str)) + strend1;
            return str + "ay";
        }
    }

