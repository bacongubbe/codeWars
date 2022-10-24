import java.util.Arrays;

    class Persist {
        public static int persistence(long n) {
            String number = String.valueOf(n);
            if (number.length() <= 1) return 0;

            int count = 0;
            String[] numberArray = number.split("");

            do {
                int result = 1;
                for (String s : numberArray){
                   result *= Integer.parseInt(s);
                }
                number = String.valueOf(result);
                numberArray = number.split("");
                count += 1;
            } while (numberArray.length > 1);

            return count;
        }
    }