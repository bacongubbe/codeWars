public class ReverseSentance {

    public static void main(String[] args){

        System.out.println(reverseWords("I am a total looser"));
    }

    private static String reverseWords(String str) {
        String[] array = str.split(" ");
        StringBuilder newWord = new StringBuilder();

        for (int i = array.length - 1; i >= 0; i--) {
            newWord.append(array[i] + " ");
        }
        return newWord.toString();

    }
}
