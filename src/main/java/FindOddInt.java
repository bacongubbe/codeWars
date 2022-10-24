import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class FindOddInt {

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{1, 2, 2, 1, 2, 2, 3, 1, 1}));
    }

    public static int findIt(int[] a) {

        AtomicInteger theResult = new AtomicInteger();

        stream(a)
                .boxed()
                .collect(Collectors.groupingBy(s -> s))
                .forEach((k, v) -> { if (v.size() % 2 == 1) theResult.set(k);});

        return theResult.get();

    }
}
