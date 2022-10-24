import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

public class MexicanWave {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(wave("two words")));
    }

    public static String[] wave(String str) {

        return IntStream.range(0, str.length()).mapToObj(i -> {
                    if (str.substring(i, i + 1).matches("^[a-z]")) {
                        return (str.substring(0, i) +
                                Character.toUpperCase(str.charAt(i)) +
                                str.substring(i + 1));
                    }return null;}).filter(Objects::nonNull)
                .toArray(String[]::new);
    }
}
