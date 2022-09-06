import java.io.StringReader;
import java.util.Arrays;

public class StringSplit {

    public static void main (String[] args){

        System.out.println(solution("abcdefg"));
        Arrays.asList(solution("abcdefg")).forEach(str -> System.out.print(str));
        System.out.println(Arrays.toString(solution("abcdefg")));

    }

    public static String[] solution(String s){

        String[] array;
        if (s.length()%2 == 1){
            array = new String[(s.length()/2)+1];
            s += "_";
        }
        else {
            array = new String[s.length()/2];}

        for (int i = 0; i < array.length; i++){
          array[i] = s.substring(i*2,i*2+2);
        }
        return array;
    }
}
