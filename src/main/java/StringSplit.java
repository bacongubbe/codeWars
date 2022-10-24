import java.io.StringReader;
import java.util.Arrays;

public class StringSplit {

    public static void main (String[] args){

        System.out.println(solution("abcdefghijlmopqrs"));
        Arrays.asList(solution("abcdefghijlmopqrs")).forEach(str -> System.out.print(str));
        System.out.println(Arrays.toString(solution("abcdefghijlmopqrs")));
    }

    public static String[] solution(String s){

        int chPerArrayItem = 2;

        String[] array;
        if (s.length()%2 == 1){
            array = new String[(s.length()/chPerArrayItem)+1];
            s += "_";
        }
        else {
            array = new String[s.length()/chPerArrayItem];}

        for (int i = 0; i < array.length; i++){
          array[i] = s.substring(i*chPerArrayItem,i*chPerArrayItem+chPerArrayItem);
        }
        return array;
    }
}
