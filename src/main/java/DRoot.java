import java.util.stream.IntStream;

public class DRoot {
    public static void main (String[] args){

        digital_root(87654680);
    }

    public static void digital_root(int n){

        String number = Integer.toString(n);
        int sum = 0;
        for (int i = 0; i < number.length(); i++){
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
            if (i<number.length()-1){
            System.out.print(number.charAt(i) + " + " );}
            else System.out.print(number.charAt(i));
        }
        System.out.print(" = "+ sum);
    }
}
