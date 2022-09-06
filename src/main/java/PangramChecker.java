public class PangramChecker {
    public static void main (String[] args) {

        System.out.println(check("The quick brown fox jumps over the lazy dog."));
    }

    public static boolean check(String sentence){
        for (char c = 'a'; c <= 'z'; c++) {
            if (!sentence.toLowerCase().contains(""+c)) {
                return false;
            } else {
                c++;
            }
        }
        return true;
    }
}
