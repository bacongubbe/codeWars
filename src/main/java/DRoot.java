public class DRoot {
    public static void main (String[] args){

        digital_root(87654680);
    }

    public static int digital_root(int n){

        String number = Integer.toString(n);
        StringBuilder sum = new StringBuilder();

        for (int i = 0; i < number.length(); i++){
            sum.append(number.charAt(i));
        }

        String sumString = sum.toString();
        StringBuilder newSum = new StringBuilder();

        for (int i = 0; i < sumString.length(); i++){
            newSum.append(sumString.charAt(i));
        }

        return Integer.parseInt(newSum.toString());
    }
}
