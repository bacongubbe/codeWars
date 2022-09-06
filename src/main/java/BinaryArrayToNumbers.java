import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryArrayToNumbers {

    public static void main (String[] args){

        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        int sum = 0;
        String number = String.valueOf(binary.toArray());
        for (int i = 0; i < binary.size(); i++) {
            sum += binary.get(i)*Math.pow(2, binary.size() - i - 1);
        }
        return sum;
    }
}
