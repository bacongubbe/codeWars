import java.util.Arrays;

public class Scrambler {

    public static void main(String[] args){

        System.out.println(scramble3("rkqodlw","world")); //should return true
        System.out.println(scramble3("katas","steak")); //should return false
        System.out.println(scramble3("javscripts","javascript")); //should be false
        System.out.println(scramble3("aaabbbccc", "abc")); //should return true
    }

    //function only compares if all the characters is included, but does not check the amount of characters. i.e, if
    //word contains multiple 'a' but scramble only one. it still returns true.
    public static boolean scramble(String str1, String str2) {

        char[] array = str2.toCharArray();
        for (char c : array){
            if(!str1.contains(c+"")){return false;}
        }return true;
    }

    public static boolean scramble2 (String str1, String str2){

        if (str2.length() > str1.length()){return false;}
        int index = 0;
        int ScrambleIndex = 0;

        for (int i = 0; i < str2.length(); i++){
        index = countLetters(str2.charAt(i), str2);
            for (int j = 0; j < str1.length(); j++){
                if (str1.charAt(j) == str2.charAt(i)){
                    ScrambleIndex ++;
                }
            }if (ScrambleIndex < index){return false;}
            else {ScrambleIndex = 0;}
        }
        return true;
    }

    private static int countLetters(char c, String s){
        int index = 0;
        for(int i = 0; i < s.length() ; i++){
            if (s.charAt(i) == c) {index++;}
        }
        return index;
    }

    private static boolean scramble3(String str1, String str2){

        if (str1.length() < str2.length()){return false;}
        int index = str1.length() - str2.length();
        int originalLen = str1.length();

        for (String c : str2.split("")){
            if(str1.contains(c)) {
                str1 = str1.replace(c , "");
            } else return false;
        }

        return originalLen - str1.length() == str2.length();
    }
}
