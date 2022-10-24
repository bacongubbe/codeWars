import static java.lang.Math.sqrt;
import static java.lang.Math.subtractExact;

public class findNextSquare {

    public static void main (String[] args){
        System.out.println(findNextSquare(121));
    }


        public static long findNextSquare(long sq) {
            if (sqrt(sq)*10 % 10 != 0 ) return -1;

            do {sq++;}
            while (sqrt(sq)*10 % 10 != 0);
            return sq;
        }
}
