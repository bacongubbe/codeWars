import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class DRoot {
    public static void main (String[] args){

        System.out.println(digital_root(456));
    }

    public static int digital_root(int n){

        String number = Integer.toString(n);
        char[] charArray = number.toCharArray();

        int newInt = 0;
        for (int i = 0; i < number.length(); i++) {
            newInt += charArray[i] - '0';
        }

        if (String.valueOf(newInt).length() > 1) {
            newInt = digital_root(newInt);
            return newInt;
        }
        else {
            return newInt;
        }
    }
}
