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

        int[] snail = new int[array[0].length * array[0].length];

        int y = 0;
        int x = 0;
        int spiral = 0;
        int direction = 0;
        int i = -1;

        while (i < snail.length -1){
        i++;
        snail[i] = array[y][x];

        if (direction == 0){
            x++;
            if (x == array[0].length - spiral -1) {
                direction = 1;
                continue;
            }
        }
        if (direction == 1){
            y++;
            if (y == array[0].length - spiral -1) {
                direction = 2;
                continue;
            }
        }
        if (direction == 2) {
            x--;
            if (x == spiral) {
                direction = 3;
                spiral++;
                continue;
            }
        }
        if (direction == 3){
            y--;
            if (y == spiral) {
                direction = 0;
            }
        }}

        return snail;
    }
}