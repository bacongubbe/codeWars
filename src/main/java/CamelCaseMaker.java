import static java.lang.Character.*;

public class CamelCaseMaker {

    public static void main (String[] args) {

        System.out.println(makeCamelCase("son-of-the-bitch"));
        System.out.println(makeCamelCase("super_cool_user_name"));


    }
    public static String makeCamelCase(String s) {

        StringBuilder camelWord = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-' || s.charAt(i) == '_') {
                camelWord.append(toUpperCase(s.charAt(i + 1)));
                i++;
            }
            else {
                camelWord.append(s.charAt(i));
            }
        }
        return camelWord.toString();
    }
}
