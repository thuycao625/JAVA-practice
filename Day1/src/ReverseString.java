public class ReverseString {
    public static void main(String[] args) {
        String input = "This is another test";
        String[] araySlipted = splitString(input);
        String ouput = convertArraytoString(checkLengthtReverseString(araySlipted));
        System.out.println("ouput: " + ouput);
    }

    private static String convertArraytoString(String[] StringArray) {
        String stringConverted = String.join(" ", StringArray);
        return stringConverted;
    }

    private static String[] checkLengthtReverseString(String[] stringArray) {

        for (int i = 0 ; i < stringArray.length; i++) {
            if(stringArray[i].length() >= 5) {
                stringArray[i] = reverseString(stringArray[i]);
            }
        }
        return stringArray;
    }

    public static String reverseString(String string){
        StringBuilder sb =new StringBuilder(string);
        sb.reverse();
        return sb.toString();
    }

    private static String[] splitString(String input) {
        String[] newStringArray = input.split("\\s");
        return newStringArray;
    }
}