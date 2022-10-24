public class BackwardString {

    public static void main(String[] args){

    }

    private String makeBackward(String str){
    StringBuilder newString = new StringBuilder();
    for(int i = str.length()-1; i >= 0; i--){
        newString.append(str.charAt(i));}
    return newString.toString();
    }
}
