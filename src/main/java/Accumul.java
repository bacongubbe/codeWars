import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Accumul {


    public static void main(String[] args) {
        System.out.println(accum("abcde"));
    }
    public static String accum(String s) {
        StringBuilder sb = new StringBuilder();

        String[] arr = s.split("");

        return IntStream.range(0, arr.length).mapToObj(i -> arr[i].toUpperCase() + arr[i].repeat(i).toLowerCase()).collect(Collectors.joining("-"));
      
      /*for (int i = 0; i < arr.length; i++){
        sb.append(arr[i].toUpperCase());
        sb.append(arr[i].repeat(i).toLowerCase());
        sb.append("-");
      }
      
      return sb.toString().substring(0, sb.length() - 1);*/

    }
}