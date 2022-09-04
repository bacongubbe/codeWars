public class CreditcardMasker {

    public static void main (String[] args){

        System.out.println(Maskify("213123123123125265123"));
    }
    public static String Maskify(String str){

        StringBuilder maskedWord = new StringBuilder();

        if(str.length()>=4) {
            int length = str.length()-4;
            for (int i = 0; i < length; i++) {
                maskedWord.append("#");
            }
            for (int i = length; i < str.length(); i++) {
                maskedWord.append(str.charAt(i));
            }
            return maskedWord.toString();

        }
        else return str;
    }
}
