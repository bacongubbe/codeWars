import java.util.*;

public class Snail {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(snail(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}})));
    }
    public static int[] snail(int[][] array) {

        if (array[0].length == 0) return new int[]{0};

        int[] snail = new int[array.length * array.length];

        int y = 0;
        int x = 0;
        int spiral = 0;
        int i = 0;

        while (i < snail.length){


        }


        return snail;
    }
}