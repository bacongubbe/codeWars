public class CapitalizeFirstLetters {

    public static void main(String[] args){

        System.out.println(Capitalize("most trees are blue"));

    }

    private static String Capitalize(String str){

        if (str == null) return null;
        String output = "";
        for (String s : str.split(" ")){
            output += s.substring(0,1).toUpperCase() + s.substring(1) + " ";
        }
        return output.trim();
    }
}
