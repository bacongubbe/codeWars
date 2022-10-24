import java.util.Arrays;

public class FindOddInt2 {

    public static void main(String[] args) {
        System.out.println(stray(new int[]{1,1,1,5,1,2,2}));
    }

    static int stray(int[] numbers) {
        int[] sorted = Arrays.stream(numbers).sorted().toArray();

        for (int i = 0; i < sorted.length-1; i++){
            if (sorted[i] != sorted[i+1]) {return sorted[i];}
            i++;
        }
        return sorted[sorted.length-1];
    }
}
