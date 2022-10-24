import java.util.List;
import java.util.stream.IntStream;

public class LineNumbering {

    public static void main(String[] args) {
        System.out.println(number(List.of("a", "b", "c")));
    }

    public static List<String> number(List<String> lines) {
        return IntStream.range(0, lines.size())
                .mapToObj(i -> i+1 +": " +lines.get(i))
                .toList();
    }
}
